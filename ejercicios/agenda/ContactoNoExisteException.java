/**
 * 
 */
package cl.accenture.curso_java.agenda_telefonica;

/**
 * @author Administrador
 *
 */
public class ContactoNoExisteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8371180850396008013L;
	
	/**
	 * 
	 * @param mensaje
	 */
	public ContactoNoExisteException(String mensaje){
		super(mensaje);
	}
}
