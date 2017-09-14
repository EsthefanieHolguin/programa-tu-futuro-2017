/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_seis;

/**
 * @author jmaldonado
 *
 */
public class Perfil {
	
	private String nombre;
	private Permiso[] permisos;
	
	
	public Perfil() {
		this.nombre = "";
		this.permisos = new Permiso[10];
	}


	/**
	 * @param nombre
	 * @param permisos
	 */
	public Perfil(String nombre, Permiso[] permisos) {
		super();
		this.nombre = nombre;
		this.permisos = permisos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Permiso[] getPermisos() {
		return permisos;
	}


	public void setPermisos(Permiso[] permisos) {
		this.permisos = permisos;
	}
	
	
	public void imprimir(){
		System.out.println( "Nombre : " + this.nombre );
		System.out.println( "Permisos " );
		for (int i = 0; i < this.permisos.length; i++) {
			Permiso p = this.permisos[i];
			System.out.println( "	" + p.getNombre() );
		}
	}
	
	
	

}
