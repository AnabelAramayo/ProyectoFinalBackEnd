window.addEventListener('load', function(){
    const formulario = document.querySelector('#update_paciente_form');
    formulario.addEventListener('submit', function(event){
        const formData = {
            id: document.querySelector('#paciente_id').value,
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            dni: document.querySelector('#dni').value,
            fechaAlta: document.querySelector('#fechaAlta').value,
            domicilio: document.querySelector('#domicilio').value,
        };

        const url = '/pacientes';

        const settings = {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }

        fetch(url, settings)
            .then(response => response.json())
    })

})

function findBy(id){
    const url = '/pacientes' + "/" + id;

    const settings = {
        method: 'GET'
    }

    fetch(url,settings)
        .then(response => response.json())
        .then(data => {
            let paciente = data;
            document.querySelector('#paciente_id').value = paciente.id;
            document.querySelector('#nombre').value = paciente.nombre;
            document.querySelector('#apellido').value = paciente.apellido;
            document.querySelector('#dni').value = paciente.dni;
            document.querySelector('#fechaAlta').value = paciente.fechaAlta;
            document.querySelector('#domicilio').value = paciente.domicilio;

            document.querySelector('#div_paciente_updating').style.display = "block";

        }).catch(error => {
            alert("Error: " + error);
        })
}
