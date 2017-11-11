function validar(){

	var idalumno,nombre,apellido,email,telefono,dni,fechanacimiento;
	var expresion,expresion2;

	
    idalumno 	= document.getElementById("idalumno").value;
	nombre 		= document.getElementById("nombre").value;
	apellido 	= document.getElementById("apellido").value;
    
	email 		= document.getElementById("email").value;
	telefono 	= document.getElementById("telefono").value;
	dni	= document.getElementById("dni").value;
	
	
	fechanacimiento= document.getElementById("fechanacimiento").value;

	expresion 	= /\w+@+\w+\.+[a-z]/;
	expresion2 	= /[a-z]/;

	if(idalumno === "" || 
		nombre === "" || 
		apellido === "" ||
		email === "" || 
		telefono ===""  || 
		dni ==="" || 
		fechanacimiento === ""){
		alert("No debe dejar espacios en blanco");
		return false;
	}
	else if(nombre.length > 15){
		alert("El nombre debe ser menor a 15 caracteres");
		return false;
	}
	else if(apellido.length > 20){
		alert("Los apellidos deben ser menor a 21 caracteres");
		return false;
	}
	else if(email.length > 50){
		alert("El correo debe ser menos a 51 caracteres");
		return false;
	}
	else if(!expresion.test(email)){
		alert("El correo no es válido");
		return false;
	}
	else if(telefono.length < 9 || telefono.length > 9){
		alert("El telefono es invalido");
		return false;
	}
	else if(isNaN(telefono)){
		alert("El telefono debe ser un numero");
		return false;
	}
}