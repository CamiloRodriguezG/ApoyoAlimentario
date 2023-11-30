package com.example.demo;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomPhysicalNaming extends PhysicalNamingStrategyStandardImpl{

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        return name; // Conserva el nombre de la tabla sin cambios
    }
    
}