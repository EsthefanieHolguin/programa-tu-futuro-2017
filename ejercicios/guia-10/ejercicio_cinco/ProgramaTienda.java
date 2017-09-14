/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_cinco;

/**
 * @author jmaldonado
 *
 */
public class ProgramaTienda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Producto[] arregloProductos = new Producto[3];
		arregloProductos[0] = new Producto("mouse", "xx", 2, 15000);
		arregloProductos[1] = new Producto("teclado", "xx", 3, 20000);
		arregloProductos[2] = new Producto("Computador", "xx", 3, 400000);
		
		Tienda tienda = new Tienda("xxx", "Electronica", arregloProductos);
		tienda.imprimir();
		
	}

}
