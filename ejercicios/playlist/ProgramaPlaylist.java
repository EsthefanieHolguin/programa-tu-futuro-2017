/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class ProgramaPlaylist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Playlist p1 = new Playlist();
		p1.agregarCancion("cancion 1", 0);
		p1.agregarCancion("cancion 2", 1);
		p1.agregarCancion("cancion 3", 2);
		p1.agregarCancion("cancion 4", 3);
		p1.agregarCancion("cancion 5", 4);
		
		
		String[] canciones = { "can 1", "can 2", "can 3", "can 4", "can 5" };
		String[] canciones2 = new String[5];
		canciones2[0] = "can 1";
		canciones2[1] = "can 2";
		canciones2[2] = "can 3";
		canciones2[3] = "can 4";
		canciones2[4] = "can 5";
		
		Playlist p2 = new Playlist( "play2 ", canciones );

	}

}
