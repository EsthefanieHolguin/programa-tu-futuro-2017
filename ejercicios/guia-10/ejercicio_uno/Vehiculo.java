/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_uno;

/**
 * @author Juan Maldonado
 *
 * Se desea desarrollar un sistema para una concesionaria de vehículos. 
 * Todos los vehículos tienen un código identificador, una marca, un tipo (auto o camioneta), 
 * un modelo (año), una patente, kilometraje, precio de venta y stock. 
 * Diseñe la clase Vehiculo y escriba el método vender, tal que al vender 
 * un auto se debe actualizar el stock.
 */
public class Vehiculo {
	
	// Atributos de la calse 
	private String codigo;
	private String marca;
	private String tipo;
	private int modelo;
	private String patente;
	private int kilometraje;
	private int precioVenta;
	private int stock;
	
	
	//Constructores
	
	
	//Constructor por defecto que inicializa los atributos de la
	// Clase con valores que usted defina
	public Vehiculo(){
		this.codigo = "00F";
		this.marca = "Totoya Yaris";
		this.tipo = "Auto";
		this.modelo = 2017;
		this.patente = "ABCD-12";
		this.kilometraje = 0;
		this.precioVenta = 7000000;
		this.stock = 10;
	}
	
	
	// Constructor que recibe como parametros todos los atributos de la clase.
	public Vehiculo(String codigo, String marca, String tipo, int modelo,
			String patente, int kilometraje, int precioVenta, int stock) {
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}
	
	
	// Getters Y Setters 
	// Nos permiten acceder y cambiar el valor de cada atributo definido en la clase.
	// Set = Cambiar el valor de un atributo
	// Get = Obtener el valor de un atributo

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public int getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	public void vender(){
		this.stock = this.stock - 1;
		
	}
	
}
