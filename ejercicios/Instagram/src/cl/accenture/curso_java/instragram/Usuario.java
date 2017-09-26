package cl.accenture.curso_java.instragram;

public class Usuario  implements Imprimible {
	
	private String nombre;
	private Publicacion[] publicaciones;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Publicacion[] getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(Publicacion[] publicaciones) {
		this.publicaciones = publicaciones;
	}
	
	public double promedioLikes(){
		double promedio = 0;
		int sumaLikes = 0;
		for (int i = 0; i < this.publicaciones.length; i++) {
//			Publicacion p = this.publicaciones[i];
//			p.getLikes();
			sumaLikes += this.publicaciones[i].getLikes();
		}
		promedio = sumaLikes / this.publicaciones.length;
		return promedio;
	}

	
	public Publicacion getPublicacionMasComentada(){
		
		Publicacion publicacionMasComentada = this.publicaciones[0];
		
		for (int i = 1; i < this.publicaciones.length; i++) {
			if( this.publicaciones[i].getComentarios().length > 
			publicacionMasComentada.getComentarios().length  ){
				publicacionMasComentada = this.publicaciones[i];
			}
		}
		return publicacionMasComentada;
	}
	
	

	@Override
	public void imprimir() {
		System.out.println( "Nombre : " + this.getNombre() );
		System.out.println( "Publicaciones " );
		
		for (int i = 0; i < this.publicaciones.length; i++) {
			this.publicaciones[i].imprimir();
		}
	}
	
	@Override
	public String toString() {
		String texto = "\n";
		texto += "Nombre : " + this.getNombre() + "\n";
		texto += "Publicaciones \n";

		for (int i = 0; i < this.publicaciones.length; i++) {
			texto += this.publicaciones[i].toString();
		}
		
		return texto;
	}
	
}
