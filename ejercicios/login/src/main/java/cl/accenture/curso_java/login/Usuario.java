/**
 * 
 */
package cl.accenture.curso_java.login;

/**
 * @author jmaldonado
 *
 */
public class Usuario {
	
	private String nombre;
	private String password;
	private int intentosFallidos;
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String password, int intentosFallidos) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nusername"+ this.nombre);
		builder.append("\npassword"+ this.password);
		return builder.toString();
	}
	

}
