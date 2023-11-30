$(document).ready(function() {
    // Selecciona el botón "Verificar Estado" por su ID
    $('#verificarBtn').click(function(e) {
        e.preventDefault(); // Evita que el formulario se envíe (recargue la página)

        // Obtiene el valor del código de estudiante
        var codigoEstudiante = $('#codigoEstudiante').val();
        
  // Código válido
  $('#mensajeValidacion').text('Estudiante validado');

  // Realiza una solicitud GET al backend con el código del estudiante como parámetro en la URL
  $.ajax({
      url: 'http://localhost:8080/estudiante/codigo/' + codigoEstudiante,
      method: 'GET',
      dataType: 'json',
      success: function(response) {
          // Verifica el valor de id_estado en la respuesta
          if (response.estado && response.estado.id_estado === 1) {
              // Estudiante activo, redirige a inscripcion.html
              window.location.href = 'inscripcion.html?codigo='+response.codigo;
          } else if (response.estado && response.estado.id_estado === 2) {
              // Estudiante no activo, muestra mensaje de error
              $('#mensajeValidacion').text('El estudiante no está activo');
          } else {
              // Respuesta inesperada del backend
              $('#mensajeValidacion').text('Error en la respuesta del servidor');
          }
      },
      error: function(xhr, status, error) {
          // Ocurrió un error en la solicitud al backend
          console.error(error);
          $('#mensajeValidacion').text('Error en la solicitud al backend');
      }
  });
});
});
