/**
 * 
 */
package cl.accenture.curso_java.agenda_telefonica;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrador
 *
 */
public class Agenda {

	private String nombre;
	private List<Contacto> contactos;
	//private Contacto[] contactos;
	
	public Agenda() {
		this.nombre = "";
		this.contactos = new ArrayList<Contacto>();
	}
	public Agenda(String nombre, List<Contacto> contactos) {
		super();
		this.nombre = nombre;
		this.contactos = contactos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	public void imprimir(){
		System.out.println( "Nombre" + this.nombre );
		for( Contacto cont : this.contactos ){
			cont.imprimir();
		}
	}
	
	public int cantidadContactos(){
		return this.contactos.size();
	}
	
	public Contacto buscarContacto( String nombre ) throws ContactoNoExisteException{
		for( Contacto cont : this.contactos ){
			if( cont.getNombre().equalsIgnoreCase(nombre) ){
				return cont;
			}
		}
		throw new ContactoNoExisteException( "No existe contacto" );
	}
	
	public List<Contacto> buscarContactos( String nombre ){
		List<Contacto> coincidencias = new ArrayList<Contacto>();
		for( Contacto cont : this.contactos ){
			if( cont.getNombre().contains( nombre ) ){
				coincidencias.add(cont);
			}
		}
		return coincidencias;
	}
	
	
}
