/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_cuatro;

/**
 * @author Juan Maldonado
 *
 * Una asignatura tiene un nombre, profesor y una lista de a lo más 45 alumnos. 
 * Un alumno tiene como atributos un nombre y una edad. Diseñe las clases necesarias para 
 * modelar este problema y escriba el método imprimir que muestre por consola los datos de una 
 * asignatura y los alumnos que pertenecen a esa asignatura.
 */
public class Alumno {
	
	private String nombre;
	private int edad;
	
	public Alumno() {
		this.nombre = "";
		this.edad = 0;
	}

	public Alumno(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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
	
	
	
	
	

}
