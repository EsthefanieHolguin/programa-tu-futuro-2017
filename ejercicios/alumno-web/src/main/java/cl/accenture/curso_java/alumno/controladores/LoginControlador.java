/**
 * 
 */
package cl.accenture.curso_java.alumno.controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author jmaldonado
 *
 */
@ManagedBean
@SessionScoped
public class LoginControlador implements Serializable {

	private static final long serialVersionUID = -6848126621941457061L;
	private String nombreUsuario;
	private String password;
	private String mensaje;
	private boolean error;
	
	
	public LoginControlador() {
		this.nombreUsuario = "";
		this.password = "";
		this.mensaje = "";
		
	}
	
	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * 
	 */
	public String iniciarSesion(){
		if( this.nombreUsuario.equals( "jmaldonado" ) && this.password.equals( "123" )  ){
			this.mensaje = "";
			this.error = false;
			return "principal2?faces-redirect=true";
		}else{
			this.error = true;
			this.mensaje = "Usuario y/o Password incorrectos";
			return "";
		}
		
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}
	
}
