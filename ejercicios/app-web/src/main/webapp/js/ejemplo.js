/**
 * 
 */
alert( "Hola" );
console.log( "Como estas ?" );

function saludar(){
	
	var nombre = document.getElementById("campoNombre").value;
	//alert( "Hola " + nombre );
	document.getElementById("mensaje").innerHTML = "Hola " + nombre;
}