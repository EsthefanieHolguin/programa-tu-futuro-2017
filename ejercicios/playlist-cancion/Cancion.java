/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class Cancion {
	
	private String nombre;
	private String autor;
	private int duracion; // Segundos
	
	public Cancion(){
		this.nombre = "";
		this.autor = "";
		this.duracion = 0;
	}
	
	public Cancion(String nombre, String autor, int duracion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.duracion = duracion;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	
	
}
