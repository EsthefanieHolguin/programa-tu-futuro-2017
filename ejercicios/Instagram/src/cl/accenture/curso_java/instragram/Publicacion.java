/**
 * 
 */
package cl.accenture.curso_java.instragram;

import java.util.Date;

/**
 * @author jmaldonado
 *
 */
public abstract class Publicacion implements Imprimible {
	
	private String descripcion;
	private int likes;
	private String[] comentarios;
	private Date fechaPublicacion;
	
	
	public Publicacion() {
		this.descripcion = "";
		this.likes = 0;
		this.comentarios = new String[1];
		this.fechaPublicacion = new Date();
	}


	/**
	 * 
	 * @param descripcion
	 * @param likes
	 * @param comentarios
	 * @param fechaPublicacion
	 */
	public Publicacion(String descripcion, int likes, String[] comentarios,
			Date fechaPublicacion) {
		super();
		this.descripcion = descripcion;
		this.likes = likes;
		this.comentarios = comentarios;
		this.fechaPublicacion = fechaPublicacion;
	}

	
	// GETTERS Y SETTERS -- 

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	/**
	 * @return the likes
	 */
	public int getLikes() {
		return likes;
	}


	/**
	 * @param likes the likes to set
	 */
	public void setLikes(int likes) {
		this.likes = likes;
	}


	/**
	 * @return the comentarios
	 */
	public String[] getComentarios() {
		return comentarios;
	}


	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String[] comentarios) {
		this.comentarios = comentarios;
	}


	/**
	 * @return the fechaPublicacion
	 */
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}


	/**
	 * @param fechaPublicacion the fechaPublicacion to set
	 */
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	@Override
	public void imprimir() {
		System.out.println( "Descripcion " + this.getDescripcion() );
		System.out.println( "Likes " + this.getLikes() );
		System.out.println( "Fecha  " + this.getFechaPublicacion() );
		System.out.println( "Comentarios " );
		
		for (int i = 0; i < this.comentarios.length; i++) {
			System.out.println( "	" + this.comentarios[i] );
		}
	}
	
	@Override
	public String toString() {
		String texto = "\n";
		texto += "\nDescripcion " + this.getDescripcion();
		texto += "\nLikes " + this.getLikes();
		texto += "\nFecha  " + this.getFechaPublicacion();
		texto += "\nComentarios  ";
		for (int i = 0; i < this.comentarios.length; i++) {
			texto += "\n 	" + this.comentarios[i];
		}
		return texto;
	}
	
	
}
