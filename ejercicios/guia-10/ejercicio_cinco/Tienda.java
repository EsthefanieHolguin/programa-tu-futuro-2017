/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_cinco;

/**
 * @author Juan Maldonado
 * Una tienda tiene un nombre, tipo y una lista de a lo más 100 productos. 
 * Un producto tiene nombre, tipo, stock actual y precio. 
 * Diseñe las clases necesarias para modelar este problema y 
 * escriba el método imprimir que muestre por consola el nombre de la tienda y los artículos que ofrece, 
 * mostrando el nombre del artículo y su precio.
 *
 */
public class Tienda {
	
	private String nombre;
	private String tipo;
	private Producto[] productos;
	
	
	public Tienda() {
		this.nombre = "";
		this.tipo = "";
		this.productos = new Producto[100];
	}


	public Tienda(String nombre, String tipo, Producto[] productos) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.productos = productos;
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


	public Producto[] getProductos() {
		return productos;
	}


	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	
	
	
	/**
	 * método imprimir que muestre por consola el nombre de la tienda y los artículos que ofrece, 
	 * mostrando el nombre del artículo y su precio.
	 */
	
	public void imprimir(){
		System.out.println( "Nombre de la tienda : " + this.nombre );
		for (int i = 0; i < this.productos.length; i++) {
			Producto prod = this.productos[i];
			System.out.println( "  Articulo " + prod.getNombre() );
			System.out.println( "  Precio " + prod.getPrecio() );
			System.out.println( "---" );
		}
	}
	

}
