/**
 * 
 */
package cl.accenture.curso_java.control3;

/**
 * @author jmaldonado
 *
 */
public class CuentaCorriente extends CuentaBancaria {

	private int lineaDeCredito;
	

	public int getLineaDeCredito() {
		return lineaDeCredito;
	}

	public void setLineaDeCredito(int lineaDeCredito) {
		this.lineaDeCredito = lineaDeCredito;
	}
	
	@Override
	public void girarDinero(int monto) {
		if( this.getSaldo() + this.getLineaDeCredito() >= monto ){
			this.setSaldo( this.getSaldo() - monto );
		}else{
			System.out.println( "Supera el saldo y la linea de credito" );
		}
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println( "Linea de Credito : " + this.getLineaDeCredito() );
	}


}
