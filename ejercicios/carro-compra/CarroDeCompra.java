/**
 * 
 */
package cl.accenture.curso_java.guia_trece;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * @author jmaldonado
 *
 */
public class CarroDeCompra {
	
	private Usuario usuario;
	private List<Producto> productos;
	
	public CarroDeCompra() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param usuario
	 * @param productos
	 */
	public CarroDeCompra(Usuario usuario, List<Producto> productos) {
		super();
		this.usuario = usuario;
		this.productos = productos;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	/**
	 * Agregar un producto a la lista
	 * @param producto
	 */
	public void agregarProducto( Producto producto ){
		this.productos.add(producto);
	}
	
	/**
	 * Eliminar un producto, Debe sobreescribir el metodo equals en la clase
	 * Producto.
	 * @param producto
	 */
	public void eliminarProducto( Producto producto ){
		this.productos.remove(producto);
	}
	
	/**
	 * 
	 */
	public void ordernarPorPrecio(){
		Collections.sort( this.productos );
	}
	
	/**
	 * 
	 */
	public void ordernarPorNombre(){
		Collections.sort( this.productos, new OrdenarPorNombre() );
	}
	
	/**
	 * 
	 */
	public void ordernarPorIdentificador(){
		Collections.sort( this.productos, new Comparator<Producto>() {

			public int compare(Producto o1, Producto o2) {
				if( o1.getIdentificador() > o2.getIdentificador())
					return 1;
				if( o1.getIdentificador() < o2.getIdentificador())
					return -1;
				return 0;
			}
		}  );
	}
	
	/**
	 * 
	 * @return
	 */
	public int calcularPrecioTotal(){
		int suma = 0;
		for( Producto producto : this.productos ){
			suma += producto.getPrecio();
		}
		return suma;
	}
	
	/**
	 * Funciona por que la clase producto
	 * implementa el comparator segun su precio
	 * @return
	 */
	public Producto obtenerProductoMasCaro(){
		return Collections.max(this.productos);
	}
	
	
	/**
	 * Funciona por que la clase producto
	 * implementa el comparator segun su precio
	 * @return
	 */
	public Producto obtenerProductoMasBarato(){
		return Collections.min(this.productos);
	}
	
	
	/**
	 * 
	 * @param identificador
	 * @return
	 */
	public Producto buscarProducto( int identificador ){
		Producto productoBuscar = null;
		for( Producto producto : this.productos ){
			if( producto.getIdentificador() == identificador ){
				return productoBuscar;
			}
		}
		return productoBuscar;
	}
	
	
	
	
	
	
}
