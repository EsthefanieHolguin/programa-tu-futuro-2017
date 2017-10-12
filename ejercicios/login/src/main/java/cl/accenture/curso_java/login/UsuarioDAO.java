/**
 * 
 */
package cl.accenture.curso_java.login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jmaldonado
 *
 */
public class UsuarioDAO {
	
	private Conexion conexion;
	
	public UsuarioDAO() {
		this.conexion = new Conexion();
	}

	public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}
	
	
	/**
	 * 
	 * @param usuario
	 * @return
	 * @throws SinConexionException 
	 * @throws SQLException 
	 */
	public boolean login( Usuario usuario ) throws SQLException, SinConexionException{
		Statement st = conexion.obtenerConexion().createStatement();
		String query = "select * from usuario where username='"+usuario.getNombre()+"' and password='"+usuario.getPassword()+"'";
		System.out.println(query);
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			return true;
		}
		return false;
	}

}
