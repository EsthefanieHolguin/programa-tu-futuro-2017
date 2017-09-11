/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class ProgramaAlumno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Creacion a partir del constructor por defecto
		Alumno maxi = new Alumno();
		maxi.setNombre("Maximiliano");
		maxi.setNotaUno(70);
		maxi.setNotaDos(50);
		maxi.setNotaTres(60);
		
		// Creacion a partir del constructor que recibe
		// todos los atributos de la clase
		Alumno jesus = new Alumno("Jesus", 70, 30, 40);
		
		System.out.println( maxi.getNombre() );
		System.out.println( maxi.calcularPromedio() );
		
		System.out.println( jesus.getNombre() );
		System.out.println( jesus.calcularPromedio() );
	}

}
