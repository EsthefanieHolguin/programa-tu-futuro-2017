/**
 * 
 */
package cl.accenture.curso_java.agenda_telefonica;

/**
 * @author Administrador
 *
 */
public class Contacto {

	private String nombre;
	private int edad;
	private String telefono;
	
	public Contacto() {
		this.nombre = "";
		this.edad = 0;
		this.telefono = "";
	}
	
	public Contacto(String nombre, int edad, String telefono) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void imprimir() {
		System.out.println( "Nombre: " + this.nombre );
		System.out.println( "Edad: " + this.edad );
		System.out.println( "Telefono: " + this.telefono );
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nNombre "+ this.nombre );
		builder.append("\nEdad "+ this.edad );
		builder.append("\nTelefono "+ this.telefono );
		return builder.toString();
	}
	
	
	
}
