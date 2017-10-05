/**
 * 
 */
package cl.accenture.curso_java.guia_trece;

import java.util.Comparator;

/**
 * @author jmaldonado
 *
 */
public class OrdenarPorNombre implements Comparator<Producto> {

	public int compare(Producto o1, Producto o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
