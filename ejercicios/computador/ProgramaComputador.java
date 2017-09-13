/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class ProgramaComputador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Se crea la instancia de Mouse 
		Mouse mouse = new Mouse();
		mouse.setPrecio( 2000 );
		
		
		// Se crea la instancia de Computador
		Computador compu = new Computador("marca 1", "modelo1", mouse, 150000);
		System.out.println( compu.calcularPrecio() );

	}

}
