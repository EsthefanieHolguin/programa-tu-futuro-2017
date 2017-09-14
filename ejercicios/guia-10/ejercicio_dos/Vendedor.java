/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_dos;

/**
 * @author Juan Maldonado
 *
 * Una empresa paga a sus vendedores mediante comisiones. Los vendedores 
 * reciben $100.000 por semana más el 9% de sus ventas brutas en esa semana. 
 * Por ejemplo, un vendedor que vende $500.000 en mercancías, al cabo de la semana 
 * recibe $100.000 más el 9% de $500.000, es decir, recibe un total de $145.000. 
 * Escriba la clase Vendedor con los atributos nombre, semanas trabajadas y valor de artículos vendidos. 
 * Escriba además el método calcularComision que devuelva la comisión semanal de un vendedor.
 */
public class Vendedor {
	
	// Atributos de la calse 
	private String nombre;
	private int semanasTrabajadas;
	private int valorArticulosVendidos; //Por semana
	
	//Constructores
	

	//Constructor por defecto que inicializa los atributos de la
	// Clase con valores que usted defina
	public Vendedor() {
		this.nombre = "juan";
		this.semanasTrabajadas = 1;
		this.valorArticulosVendidos = 100000;
	}
	
	
	public Vendedor(String nombre, int semanasTrabajadas,
			int valorArticulosVendidos) {
		super();
		this.nombre = nombre;
		this.semanasTrabajadas = semanasTrabajadas;
		this.valorArticulosVendidos = valorArticulosVendidos;
	}
	
	
	// Getters Y Setters 
	// Nos permiten acceder y cambiar el valor de cada atributo definido en la clase.
	// Set = Cambiar el valor de un atributo
	// Get = Obtener el valor de un atributo
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSemanasTrabajadas() {
		return semanasTrabajadas;
	}
	public void setSemanasTrabajadas(int semanasTrabajadas) {
		this.semanasTrabajadas = semanasTrabajadas;
	}
	public int getValorArticulosVendidos() {
		return valorArticulosVendidos;
	}
	public void setValorArticulosVendidos(int valorArticulosVendidos) {
		this.valorArticulosVendidos = valorArticulosVendidos;
	}
	
	
	//Escriba además el método calcularComision que devuelva la comisión semanal de un vendedor.
	public double calcularComision(){
		return this.valorArticulosVendidos * 0.09;
	}
	
	
}
