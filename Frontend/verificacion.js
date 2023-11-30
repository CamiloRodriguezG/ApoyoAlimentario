
// Espera a que el documento HTML esté completamente cargado
document.addEventListener("DOMContentLoaded", function () {
    // Encuentra el botón "Enviar Información" por su id
    var enviarInfoBtn = document.getElementById("actInfoBtn");

    // Agrega un evento click al botón "Enviar Información"
    enviarInfoBtn.addEventListener("click", async function () {
        // Obtiene los valores de los campos del formulario
        var sostiene_hogar = document.getElementById("sostieneHogar").value;
        var vive_fuera_familia = document.getElementById("residenciaFueraBogota").value;
        var se_autosustenta = document.getElementById("autosustenta").value;
        var personas_acargo = document.getElementById("aCargoDeMasPersonas").value;
        var vive_empleador = document.getElementById("viveCasaEmpleador").value;
        var condicion_especial = document.getElementById("condicionEspecial").value;
        var zona_vulnerabilidad = document.getElementById("zonaVulnerabilidad").value;
        var discapacidad = document.getElementById("discapacidad").value;
        var problema_alimentario = document.getElementById("problemasAlimentacion").value;
        var puntaje = 0;
        var ingresos_familiares
        var valor_matricula
        var id_codigo
        var id_estado_solicitud = 1
        var id_periodo
        var id_solicitud = document.getElementById('id_solicitud').value;

        var data = await getSolicitud(id_solicitud)
        // Crea un objeto con los datos del formulario
        var solicitudData = {
            ingresos_familiares: data.ingresos_familiares,
            sostiene_hogar: sostiene_hogar,
            vive_fuera_familia: vive_fuera_familia,
            se_autosustenta: se_autosustenta,
            personas_acargo: personas_acargo,
            vive_empleador: vive_empleador,
            condicion_especial: condicion_especial,
            zona_vulnerabilidad: zona_vulnerabilidad,
            discapacidad: discapacidad,
            problema_alimentario: problema_alimentario,
            valor_matricula: data.valor_matricula,
            puntaje: puntaje,
            valor_matricula: valor_matricula,
            id_estado_solicitud: id_estado_solicitud,
            id_codigo: data.id_codigo,
            id_evaluador: id_evaluador,
            id_periodo: data.id_periodo,
            id_solicitud: id_solicitud,
        };
        actualizarSolocitud(solicitudData)
        // Realiza una solicitud POST a la ruta "/solicitud/add" con los datos del formulario
        
    });

    
});

async function getSolicitud(id_solicitud){
    fetch('http://localhost:8080/solicitud/all')
        .then(response => response.json())
        .then(data => {
            for(i in data){
                if(data[i].id_solicitud=id_solicitud){
                    console.log(data[i])
                return {
                ingresos_familiares : data[i].ingresos_familiares,
                valor_matricula : data[i].valor_matricula,
                id_codigo : data[i].id_codigo,
                id_periodo : data[i].id_periodo
                }
            }
            }
        });
}

function actualizarSolocitud(solicitudData){
    fetch('http://localhost:8080/solicitud/update', {
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
}