/**
 * 
 */
package cl.accenture.curso_java.base_de_datos;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Administrador
 *
 */
public class Programa {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AlumnoDAO dao = new AlumnoDAO();
		try {
			List<Alumno> alumnos = dao.obtenerAlumnos();
			for( Alumno alumno : alumnos ){
				System.out.println( alumno );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (SinConexionException e) {
			e.printStackTrace();
		}
	}

}
