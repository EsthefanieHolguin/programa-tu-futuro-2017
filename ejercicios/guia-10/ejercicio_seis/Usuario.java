/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_seis;

/**
 * @author jmaldonado
 *
 */
public class Usuario {

	private String nombre;
	private String password;
	private Perfil perfil;
	
	
	public Usuario() {
		this.nombre = "";
		this.password = "";
		this.perfil = new Perfil();
	}
	
	
	
	/**
	 * @param nombre
	 * @param password
	 * @param perfil
	 */
	public Usuario(String nombre, String password, Perfil perfil) {
		super();
		this.nombre = nombre;
		this.password = password;
		this.perfil = perfil;
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
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	public void imprimir(){
		System.out.println( this.nombre  );
		System.out.println( this.password  );
		this.perfil.imprimir();
	}
	
	
}
