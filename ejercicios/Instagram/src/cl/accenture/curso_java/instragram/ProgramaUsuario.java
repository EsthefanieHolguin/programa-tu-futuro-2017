/**
 * 
 */
package cl.accenture.curso_java.instragram;

import java.util.Date;

import javax.swing.JOptionPane;

/**
 * @author jmaldonado
 *
 */
public class ProgramaUsuario {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
		int cantidadPublicaciones = Integer.parseInt( JOptionPane.showInputDialog(
				"Ingrese cantidad Publicaciones") );
		
		Publicacion[] publicaciones = new Publicacion[cantidadPublicaciones];
		
		for (int i = 0; i < publicaciones.length; i++) {
			int esFoto = JOptionPane.showConfirmDialog(null, "Es una Foto ? ");
			switch (esFoto) {
				case 0:{
					// Crear Foto
					Foto foto = new Foto();
					foto.setDescripcion( JOptionPane.showInputDialog("Ingrese Descripcion") );
					foto.setLikes( Integer.parseInt( JOptionPane.showInputDialog("Ingrese cantidad Likes ") )  );
					foto.setFechaPublicacion( new Date() );
					
					int cantidadComentarios = Integer.parseInt( JOptionPane.showInputDialog("Ingrese cantidad Comentarios ") );
					String[] comentarios = new String[cantidadComentarios];
					for (int j = 0; j < comentarios.length; j++) {
						comentarios[j] = JOptionPane.showInputDialog("Ingrese Comentario " + (j+1));
					}
					foto.setComentarios(comentarios);
					
					publicaciones[i] = foto;
					break;
				}
				
				case 1:{
					// Crear Video
					Video video = new Video();
					video.setDescripcion( JOptionPane.showInputDialog("Ingrese Descripcion") );
					video.setLikes( Integer.parseInt( JOptionPane.showInputDialog("Ingrese cantidad Likes ") )  );
					video.setFechaPublicacion( new Date() );
					
					int cantidadComentarios = Integer.parseInt( JOptionPane.showInputDialog("Ingrese cantidad Comentarios ") );
					String[] comentarios = new String[cantidadComentarios];
					for (int j = 0; j < comentarios.length; j++) {
						comentarios[j] = JOptionPane.showInputDialog("Ingrese Comentario " + (j+1));
					}
					video.setComentarios(comentarios);
					
					video.setDuracion( Integer.parseInt( JOptionPane.showInputDialog("Ingrese Duracion Video ") )  );
					video.setViews( Integer.parseInt( JOptionPane.showInputDialog("Ingrese Cantidad de Visualizaciones") )  );
					publicaciones[i] = video;
					break;
				}
	
				default:{
					Foto foto = new Foto();
					publicaciones[i] = foto;
					break;
				}
			}
		}
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setPublicaciones(publicaciones);
		
		usuario.imprimir();
		
		JOptionPane.showMessageDialog(null, 
				"Instagram :" + usuario );
		
		JOptionPane.showMessageDialog(null, 
				"El promedio de likes es :" + usuario.promedioLikes() );
		
		JOptionPane.showMessageDialog(null, 
				"La foto mas comentada :" + usuario.getPublicacionMasComentada() );
		
		
		
	}
	
}
