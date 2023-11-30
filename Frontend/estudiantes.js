const base_url = "http://localhost:8080"; 
const  enviarCorreo = async (codigo,mensaje) => {
    const url = base_url+"/enviar-correo?codigo="+codigo+"&mensaje="+mensaje;
    const response = await fetch(url,{
        method:"GET"
    })

    
    if(!response.ok){
        throw new ERROR (response.status);
    }
    
    const respuesta = await response.text();
    
    return respuesta;
}


const getEstudiantes = async () => {
    const url = base_url+"/estudiante/all"
    const response = await fetch(url,{
        method:"GET"
    })

    if(!response.ok){
        throw new ERROR (response.status);
    }

    const estudiantes = await response.json();

    return estudiantes;
}

const contenedor = document.getElementById("contenedor");


const estudiantes = getEstudiantes().then(estudiantes=>{
    estudiantes.forEach(estudiante=>{
        const estudianteDiv = document.createElement("div");
        const codigo = document.createElement("div");
        const programa = document.createElement("div");
        const matriculas = document.createElement("div");
        const facultad = document.createElement("div");
        const nombre = document.createElement("div");
        const promedio = document.createElement("div");
        const email = document.createElement("div");
        const estado = document.createElement("div");
        const btnCorrecto = document.createElement("button");
        const btnIncorrecto = document.createElement("button");
        const observacion = document.createElement("textarea");

        codigo.textContent = estudiante.id_codigo;
        programa.textContent = estudiante.programa;
        matriculas.textContent = estudiante.matriculas;
        facultad.textContent = estudiante.facultad;
        nombre.textContent = estudiante.n_estudiante;
        promedio.textContent = estudiante.promedio;
        email.textContent = estudiante.email;
        estado.textContent = estudiante.estado;

        btnCorrecto.textContent = "Correcto";
        btnIncorrecto.textContent = "Incorrecto";
        
        estudianteDiv.appendChild(codigo);
        estudianteDiv.appendChild(programa);
        estudianteDiv.appendChild(matriculas);
        estudianteDiv.appendChild(facultad);
        estudianteDiv.appendChild(nombre);
        estudianteDiv.appendChild(promedio);
        estudianteDiv.appendChild(email);
        estudianteDiv.appendChild(estado);

        estudianteDiv.appendChild(observacion);
        estudianteDiv.appendChild(btnCorrecto);
        estudianteDiv.appendChild(btnIncorrecto);
        estudianteDiv.classList.add("contenedor-estudiante");

        contenedor.appendChild(estudianteDiv);

        btnCorrecto.addEventListener("click",() =>{
            enviarCorreo(estudiante.id_codigo,"Le informamos que su solicitud para ser inscrito como beneficiario del programa Apoyo Alimentario ha sido APROBADA. ").then(respuesta=>{console.log(respuesta)})
        })

        btnIncorrecto.addEventListener("click",() =>{
            console.log(observacion.value);
            enviarCorreo(estudiante.id_codigo,observacion.value).then(respuesta=>{console.log(respuesta)})
        })

    })
    
});

