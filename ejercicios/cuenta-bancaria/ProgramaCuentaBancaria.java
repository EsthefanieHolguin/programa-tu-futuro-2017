/**
 * 
 */
package cl.accenture.curso_java.control3;


/**
 * @author jmaldonado
 *
 */
public class ProgramaCuentaBancaria {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		CuentaVista ctaVista = new CuentaVista();
		ctaVista.setNumeroCuenta(1234567890);
		ctaVista.setSaldo(10000);
		
		CajeroAutomatico cajero = new CajeroAutomatico();
		cajero.girar(ctaVista, 2000);
		
		ctaVista.imprimir();
		
		CuentaCorriente ctaCorriente = new CuentaCorriente();
		ctaCorriente.setLineaDeCredito(300000);
		ctaCorriente.setNumeroCuenta(1003456789);
		ctaCorriente.setSaldo(5000);
		
		cajero.girar(ctaCorriente, 2000);
		ctaCorriente.imprimir();
		
	}
}
