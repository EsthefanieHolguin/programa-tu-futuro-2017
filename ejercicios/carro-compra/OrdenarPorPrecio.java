/**
 * 
 */
package cl.accenture.curso_java.guia_trece;

import java.util.Comparator;

/**
 * @author jmaldonado
 *
 */
public class OrdenarPorPrecio implements Comparator<Producto> {

	public int compare(Producto o1, Producto o2) {
		if( o1.getPrecio() > o2.getPrecio() )
			return 1;
		if( o1.getPrecio() < o2.getPrecio() )
			return -1;
		return 0;
	}

}
