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
	//private String[] canciones;
	
	private Cancion[] canciones;
	
	
	// Constructor por defecto inicializa el arreglo de canciones en 5
	public Playlist(){
		this.canciones = new Cancion[5];
	}
	
	public Playlist( String nombre, Cancion[] canciones ){
		this.nombre = nombre;
		this.canciones = canciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cancion[] getCanciones() {
		return canciones;
	}

	public void setCanciones(Cancion[] canciones) {
		this.canciones = canciones;
	}
	
	
	public void agregarCancion( Cancion cancion, int posicion ){
		if( posicion >= 0 && posicion < this.canciones.length ){
			this.canciones[posicion] = cancion;
		}else{
			System.out.println( "Posicion fuera de rango" );
		}
	}
	
	public void imprimir(){
		System.out.println( "Nombre : " + this.nombre );
		int suma = 0;
		for (int i = 0; i < this.canciones.length; i++) {
			
			Cancion x = this.canciones[i];
			suma = suma + x.getDuracion();
			System.out.println( "[" + i + "] " + x.getNombre() );
			
		}
		System.out.println( "Duracion total playlist" + suma );
		System.out.println( "------------------" );
	}
	
}
