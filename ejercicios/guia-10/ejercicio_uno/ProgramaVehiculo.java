/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_uno;

/**
 * @author Juan Maldonado
 *
 */
public class ProgramaVehiculo {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Vehiculo hyundai = new Vehiculo("AX001", "Hyundai Accent", "Auto", 2017, "ABCD-11", 0, 8000000, 10);
		
		System.out.println( "Vender auto hyundai" );
		hyundai.vender();
		
		System.out.println( "El nuevo Stock es de : " );
		System.out.println( hyundai.getStock() );
		
		System.out.println( "-------------------------" );
		
		System.out.println( "Vender auto hyundai" );
		hyundai.vender();
		
		System.out.println( "El nuevo Stock es de : " );
		System.out.println( hyundai.getStock() );
		
	}
}
