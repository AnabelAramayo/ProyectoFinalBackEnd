window.addEventListener('load', function(){
    const formulario = document.querySelector('#update_odonto_form');
    formulario.addEventListener('submit', function(event){
        const formData = {
            id: document.querySelector('#odonto_id').value,
            nombre: document.querySelector('#nombre').value,
            apellido: document.querySelector('#apellido').value,
            matricula: document.querySelector('#matricula').value,
        };

        const url = '/odontologos';

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
    const url = '/odontologos' + "/" + id;

    const settings = {
        method: 'GET'
    }

    fetch(url,settings)
        .then(response => response.json())
        .then(data => {
            let odontologo = data;
            document.querySelector('#odonto_id').value = odontologo.id;
            document.querySelector('#nombre').value = odontologo.nombre;
            document.querySelector('#apellido').value = odontologo.apellido;
            document.querySelector('#matricula').value = odontologo.matricula;

            document.querySelector('#div_odonto_updating').style.display = "block";

        }).catch(error => {
            alert("Error: " + error);
        })
}
