/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_tres;

/**
 * @author jmaldonado
 *
 */
public class ProgramaDisco {
	
	public static void main(String[] args) {
		
		String[] canciones = new String[20];
		canciones[0] = "cancion 1";
		canciones[1] = "cancion 2";
		canciones[19] = "cancion 20";
		
		Disco disco = new Disco("xx", "xxx", "xxxxx", canciones);
		disco.imprimir();
		
	}

}
