/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_seis;

/**
 * @author Juan Maldonado
 * Por otro lado, los permisos tienen un nombre, un identificador y una descripción.
 */
public class Permiso {
	
	private String nombre;
	private String identificador;
	private String descripcion;
	
	public Permiso() {
		this.nombre = "";
		this.identificador = "";
		this.descripcion = "";
	}

	/**
	 * @param nombre
	 * @param identificador
	 * @param descripcion
	 */
	public Permiso(String nombre, String identificador, String descripcion) {
		super();
		this.nombre = nombre;
		this.identificador = identificador;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
