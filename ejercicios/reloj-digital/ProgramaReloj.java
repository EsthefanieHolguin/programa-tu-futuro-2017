/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class ProgramaReloj {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		int segundos = 0;
		int horas = 0;
		int minutos = 0;
		for( segundos = 0; segundos < 60; segundos ++  ){
			System.out.println( horas + ":"+ minutos + ":" + segundos );
			Thread.sleep(1000);
			if( segundos == 59 ){
				segundos = -1;
				minutos = minutos + 1;
				if( minutos == 60){
					minutos = 0;
					horas = horas +1;
					if( horas == 24 ){
						horas = 0;
					}
				}
			}
		}

	}

}
