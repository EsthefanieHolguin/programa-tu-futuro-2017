/**
 * 
 */
package cl.accenture.curso_java.control3;

/**
 * @author jmaldonado
 *
 */
public abstract class CuentaBancaria {
	
	private int numeroCuenta;
	private int saldo;
	
	public CuentaBancaria(){
		this.numeroCuenta = 123;
		this.saldo = 300000;
	}

	public CuentaBancaria(int numeroCuenta, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	/**
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	public abstract void girarDinero( int monto );
	
	public void depositarDinero( int monto ){
		this.saldo += monto;
		//this.saldo = this.saldo +  monto;
	}
	
	public void imprimir(){
		System.out.println( "Numero Cuenta : " + this.numeroCuenta );
		System.out.println( "Saldo Disponible : " + this.saldo );
		System.out.println( "--------" );
	}
	
	

}
