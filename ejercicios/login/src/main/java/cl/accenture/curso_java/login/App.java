package cl.accenture.curso_java.login;

import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre de usuario");
        String password = JOptionPane.showInputDialog("Ingrese su password");
        Usuario usuario = new Usuario(nombre, password,0);
        UsuarioDAO dao = new UsuarioDAO();
        try {
			boolean resultado = dao.login(usuario);
			if( resultado ){
				JOptionPane.showMessageDialog(null, "Inicio de sesion Correcto", "Login", JOptionPane.INFORMATION_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null, "Usuario y/o Password incorrectos", "Login", JOptionPane.ERROR_MESSAGE);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Ocurrio un error en la consulta sql", "Login", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (SinConexionException e) {
			JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos, por favor intente más tarde", "Login", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
        
    }
}
