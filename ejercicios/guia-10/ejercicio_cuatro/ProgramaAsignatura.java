/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_cuatro;

/**
 * @author jmaldonado
 *
 */
public class ProgramaAsignatura {
	
	public static void main(String[] args) {
		
		Alumno[] arregloAlumnos = new Alumno[2];
		arregloAlumnos[0] = new Alumno("Max", 22);
		arregloAlumnos[1] = new Alumno("Carlos", 22);
		
		
		Asignatura java = new Asignatura("Curso Java", "Juan ", arregloAlumnos);
		java.imprimir();
		
	}

}
