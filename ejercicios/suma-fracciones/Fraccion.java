/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class Fraccion {
	
	private double numerador;
	private double denominador;
	
	
	public double getNumerador() {
		return numerador;
	}
	public void setNumerador(double numerador) {
		this.numerador = numerador;
	}
	public double getDenominador() {
		return denominador;
	}
	public void setDenominador(double denominador) {
		this.denominador = denominador;
	}
	
	
	public Fraccion sumar( Fraccion fraccion ){
		double numeradorSuma = 
				(this.numerador * fraccion.getDenominador() ) + 
				(this.denominador * fraccion.getNumerador() );
		
		double denominadorSuma = this.denominador * fraccion.getDenominador();
		
		Fraccion fraccionSuma = new Fraccion();
		fraccionSuma.setNumerador( numeradorSuma );
		fraccionSuma.setDenominador(denominadorSuma);

		return fraccionSuma;
	}
	

}
