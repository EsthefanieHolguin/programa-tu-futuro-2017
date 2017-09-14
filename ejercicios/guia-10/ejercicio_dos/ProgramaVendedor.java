/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_dos;

/**
 * @author Juan Maldonado
 *
 */
public class ProgramaVendedor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		Vendedor pepito = new Vendedor( "Pepito", 3, 500000 );
		System.out.println( "El valor de la comision del vendedor pepito es " );
		System.out.println( pepito.calcularComision() );
		
		
	}

}
