/**
 * 
 */
package cl.accenture.curso_java.guia_diez.ejercicio_seis;

/**
 * @author jmaldonado
 *
 */
public class ProgramaUsuario {

	public static void main(String[] args) {
		
		Permiso[] arrgeloPermisos = new Permiso[2];
		arrgeloPermisos[0] = new Permiso( "Permiso 1", "AC1" , "xxx" );
		arrgeloPermisos[1] = new Permiso( "Permiso 2", "AC2" , "xxx" );
		
		Perfil perfil = new Perfil( "perfil 1", arrgeloPermisos );
		
		Usuario usuario = new Usuario("Juan", "acb123", perfil);
		
		usuario.imprimir();
		
	}
}
