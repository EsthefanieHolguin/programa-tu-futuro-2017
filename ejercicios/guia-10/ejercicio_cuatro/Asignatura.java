/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_cuatro;

/**
 * @author Juan Maldonado
 * Una asignatura tiene un nombre, profesor y una lista de a lo más 45 alumnos. 
 * Un alumno tiene como atributos un nombre y una edad. Diseñe las clases necesarias para 
 * modelar este problema y escriba el método imprimir que muestre por consola los datos de una 
 * asignatura y los alumnos que pertenecen a esa asignatura.
 *
 */
public class Asignatura {

	private String nombre;
	private String profesor;
	private Alumno[] alumnos;
	
	public Asignatura() {
		this.nombre = "";
		this.profesor = "";
		this.alumnos = new Alumno[45];
	}

	public Asignatura(String nombre, String profesor, Alumno[] alumnos) {
		super();
		this.nombre = nombre;
		this.profesor = profesor;
		this.alumnos = alumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	
	
	//escriba el método imprimir que muestre por consola los datos de una 
	// asignatura y los alumnos que pertenecen a esa asignatura.
	public void imprimir(){
		System.out.println("Nombre de la Asignatura" + this.nombre );
		System.out.println( "Profesor de la Asignatura" + this.profesor );
		
		System.out.println( "Alumnos de la asignatura" );
		for (int i = 0; i < this.alumnos.length; i++) {
			System.out.println( this.alumnos[i].getNombre() );
		}
	}
	
}
