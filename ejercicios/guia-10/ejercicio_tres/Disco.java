/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_tres;

/**
 * @author Juan Maldonado
 * Diseñe la clase Disco que represente un disco musical. 
 * Un disco tiene como atributos un título, un artista, género musical y una lista de a lo más 20 canciones.
 *  Escriba además el método imprimir que muestre por consola los datos del disco y el listado (enumerado) de canciones.
 *
 */
public class Disco {
	
	private String titulo;
	private String artista;
	private String generoMusical;
	private String[] canciones;
	
	
	//Constructor por decto
	public Disco() {
		this.titulo = "xxx";
		this.artista = "xxxx";
		this.generoMusical = "xxxx";
		this.canciones = new String[20];
	}

	//Constructor Usando todos los atributos de la clase
	public Disco(String titulo, String artista, String generoMusical,
			String[] canciones) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.generoMusical = generoMusical;
		this.canciones = canciones;
	}


	//getters y Setters
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public String[] getCanciones() {
		return canciones;
	}

	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}
	
	
	//Escriba además el método imprimir que muestre por consola los datos del disco y el listado (enumerado) de canciones.
	
	public void imprimir(){
		System.out.println( "titulo : " + this.titulo );
		System.out.println( "Artista : " + this.artista );
		System.out.println( "Genero Musical " + this.generoMusical );
		
		for (int i = 0; i < this.canciones.length; i++) {
			System.out.println( "["+ i + "] " + this.canciones[i] );
		}
	}
	
	

}
