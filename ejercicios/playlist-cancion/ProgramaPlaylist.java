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
		p1.setNombre("Nombre de la playlist");
		p1.agregarCancion(new Cancion("cancion 1", "juan", 120) , 0);
		p1.agregarCancion(new Cancion("cancion 2", "juan", 120), 1);
		p1.agregarCancion(new Cancion("cancion 3", "juan", 120), 2);
		p1.agregarCancion(new Cancion("cancion 4", "juan", 120), 3);
		p1.agregarCancion(new Cancion("cancion 5", "juan", 120), 4);
		p1.imprimir();
		
		
//		Cancion[] canciones = { "can 1", "can 2", "can 3", "can 4", "can 5" };
		Cancion[] canciones2 = new Cancion[5];
		canciones2[0] = new Cancion("cancion 1", "juan", 120);
		canciones2[1] = new Cancion("cancion 2", "juan", 120);
		canciones2[2] = new Cancion("cancion 3", "juan", 120);
		canciones2[3] = new Cancion("cancion 4", "juan", 120);
		canciones2[4] = new Cancion("cancion 5", "juan", 120);
		
		Playlist p2 = new Playlist( "play2 ", canciones2 );
		
		p2.imprimir();

	}

}
