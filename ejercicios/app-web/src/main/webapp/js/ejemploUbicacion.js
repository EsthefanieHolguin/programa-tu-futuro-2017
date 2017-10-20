/**
 * 
 */
// Funcion que mostrara la ubicacion del usuario
// en la consola
function obtenerUbicacion()
{
	if( navigator.geolocation ){
		navigator.geolocation.getCurrentPosition( function( posicion ){
			document.getElementById("idLatitude").innerHTML = posicion.coords.latitude;
			document.getElementById("idLongitude").innerHTML = posicion.coords.longitude;			
		} );

	}else{
		console.log( "Su navegador no soporta geolocalizacion" );
	}
}
