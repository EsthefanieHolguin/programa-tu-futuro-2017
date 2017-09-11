/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

import java.util.Scanner;

/**
 * @author jmaldonado
 *
 */
public class ProgramaFraccion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		int n = lector.nextInt();
		int d = lector.nextInt();
		
		Fraccion f1 = new Fraccion();
		f1.setNumerador(n);
		f1.setDenominador(d);
		
		Fraccion f2 = new Fraccion();
		f2.setNumerador(7);
		f2.setDenominador(2);
		
		
		Fraccion fs = f1.sumar( f2 );
		System.out.println( fs.getNumerador() );
		System.out.println( fs.getDenominador() );
		
		lector.close();
		
	}

}
