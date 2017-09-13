/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class Playlist {
	private String nombre;
	private String[] canciones;
	
	
	// Constructor por defecto inicializa el arreglo de canciones en 5
	public Playlist(){
		this.canciones = new String[5];
	}
	
	public Playlist( String nombre, String[] canciones ){
		this.nombre = nombre;
		this.canciones = canciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getCanciones() {
		return canciones;
	}

	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}
	
	
	public void agregarCancion( String cancion, int posicion ){
		if( posicion >= 0 && posicion < this.canciones.length ){
			this.canciones[posicion] = cancion;
		}else{
			System.out.println( "Posicion fuera de rango" );
		}
	}
	
	public void imprimir(){
		System.out.println( "Nombre : " + this.nombre );
		for (int i = 0; i < this.canciones.length; i++) {
			System.out.println( "[" + i + "] " + this.canciones[i] );
		}
		System.out.println( "------------------" );
	}
	
}
