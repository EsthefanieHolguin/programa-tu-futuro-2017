/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_cinco;

/**
 * @author Juan Maldonado
 * Un producto tiene nombre, tipo, stock actual y precio. 
 * Diseñe las clases necesarias para modelar este problema y 
 * escriba el método imprimir que muestre por consola el nombre de la tienda y los artículos que ofrece, 
 * mostrando el nombre del artículo y su precio.
 */
public class Producto {

	private String nombre;
	private String tipo;
	private int stockActual;
	private int precio;
	
	
	public Producto() {
		this.nombre = "";
		this.tipo = "";
		this.stockActual = 0;
		this.precio = 0;
	}


	public Producto(String nombre, String tipo, int stockActual, int precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.stockActual = stockActual;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getStockActual() {
		return stockActual;
	}


	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
}
