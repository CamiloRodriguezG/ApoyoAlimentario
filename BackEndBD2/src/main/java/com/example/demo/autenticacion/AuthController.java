package com.example.demo.autenticacion;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private DataSource dataSource;

    @PersistenceContext
    private EntityManager entityManager;

    public void obtenerInformacionConexion() throws SQLException {
        Session hibernateSession = entityManager.unwrap(Session.class);
        SessionFactory sessionFactory = hibernateSession.getSessionFactory();
        ConnectionProvider connectionProvider = ((SessionFactoryImplementor) sessionFactory).getServiceRegistry().getService(ConnectionProvider.class);
        Connection connection = connectionProvider.getConnection();

        DatabaseMetaData metaData = connection.getMetaData();

        // Obtener información sobre la conexión actual
        System.out.println("URL de la conexión: " + metaData.getURL());
        System.out.println("Nombre del usuario: " + metaData.getUserName());

        // Cierra la conexión cuando hayas terminado
        connection.close();
    }

    @PostMapping("/prueba")
    public void prueba(@RequestBody Usuario usuario) throws SQLException{
        DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb", usuario.getUsername(), usuario.getPassword());
    }
/* 
    @PostMapping("/connect")
    public String connectToDatabase(@RequestBody Usuario usuario) throws SQLException {
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }*/

    @PostMapping("/createestudiante")
    public String crearNuevoUsuario(@RequestBody Usuario usuario) {
        try (Connection connection = dataSource.getConnection()) {
            String sqlCreacion = "CREATE USER " + usuario.getUsername() + " IDENTIFIED BY " + usuario.getPassword();
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sqlCreacion);
            }
            String sqlGrantRole = "GRANT CONNECT TO "+usuario.getUsername();
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(sqlGrantRole);
            }
            return "Estudiante agregado";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }
}
