var qs=window.location.search;
var urlparametros = new URLSearchParams(qs)
var codigoEstudiante = urlparametros.get("codigo")
// Espera a que el documento HTML esté completamente cargado
document.addEventListener("DOMContentLoaded", function () {
    // Encuentra el botón "Enviar Información" por su id
    var enviarInfoBtn = document.getElementById("enviarInfoBtn");

    // Agrega un evento click al botón "Enviar Información"
    enviarInfoBtn.addEventListener("click", function () {
        // Obtiene los valores de los campos del formulario
        var ingresos_familiares = +document.getElementById("ingresosFamiliares").value;
        var sostiene_hogar = document.getElementById("sostieneHogar").value;
        var vive_fuera_familia = document.getElementById("residenciaFueraBogota").value;
        var se_autosustenta = document.getElementById("autosustenta").value;
        var personas_acargo = document.getElementById("aCargoDeMasPersonas").value;
        var vive_empleador = document.getElementById("viveCasaEmpleador").value;
        var condicion_especial = document.getElementById("condicionEspecial").value;
        var zona_vulnerabilidad = document.getElementById("zonaVulnerabilidad").value;
        var discapacidad = document.getElementById("discapacidad").value;
        var problema_alimentario = document.getElementById("problemasAlimentacion").value;
        var valor_matricula = +document.getElementById("valorMatricula").value;
        var puntaje = 0;
        var id_estado_solicitud = 2;
        var id_codigo = codigoEstudiante+"";
        var id_evaluador = "2010102022";
        var id_periodo = '20241';
        var id_solicitud = ''

        // Crea un objeto con los datos del formulario
        var solicitudData = {
            ingresos_familiares: ingresos_familiares,
            sostiene_hogar: sostiene_hogar,
            vive_fuera_familia: vive_fuera_familia,
            se_autosustenta: se_autosustenta,
            personas_acargo: personas_acargo,
            vive_empleador: vive_empleador,
            condicion_especial: condicion_especial,
            zona_vulnerabilidad: zona_vulnerabilidad,
            discapacidad: discapacidad,
            problema_alimentario: problema_alimentario,
            valor_matricula: valor_matricula,
            puntaje: puntaje,
            valor_matricula: valor_matricula,
            id_estado_solicitud: id_estado_solicitud,
            id_codigo: id_codigo,
            id_evaluador: id_evaluador,
            id_periodo: id_periodo,
        };

        // Realiza una solicitud POST a la ruta "/solicitud/add" con los datos del formulario
        console.log(JSON.stringify(solicitudData))
        fetch('http://localhost:8080/solicitud/add', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(solicitudData)
        })
        .then(response => {
            if (response.ok) {
                // La solicitud se realizó con éxito
                console.log('Solicitud enviada con éxito');
                alert('Solicitud enviada con éxito');
            } else {
                // La solicitud tuvo un error
                console.error('Error al enviar la solicitud');
                alert('Error al enviar la solicitud');
            }
        })
        .catch(error => {
            // Manejar errores de red u otros errores
            console.error('Error:', error);
            alert('Error al enviar la solicitud');
        });
    });

    // Encuentra el botón "Adjuntar Documentos" por su id
    var verificarBtn = document.getElementById("verificarBtn");

    // Agrega un evento click al botón "Adjuntar Documentos"
    verificarBtn.addEventListener("click", function () {
        // Redirige a la URL deseada cuando se hace clic en el botón "Adjuntar Documentos"
        window.location.href = "https://forms.gle/X3X7jk4A7deJFT9d8";
    });
});