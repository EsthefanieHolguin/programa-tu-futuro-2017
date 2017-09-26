/**
 * 
 */
package cl.accenture.curso_java.instragram;

import java.util.Date;

/**
 * @author jmaldonado
 *
 */
public class Video extends Publicacion {
	
	private int duracion;
	private int views;
	
	public Video() {
		super();
		this.duracion = 0;
		this.views = 0;
	}

	/**
	 * @param descripcion
	 * @param likes
	 * @param comentarios
	 * @param fechaPublicacion
	 */
	public Video(String descripcion, int likes, String[] comentarios,
			Date fechaPublicacion, int duracion, int views) {
		super(descripcion, likes, comentarios, fechaPublicacion);
		this.duracion = duracion;
		this.views = views;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the views
	 */
	public int getViews() {
		return views;
	}

	/**
	 * @param views the views to set
	 */
	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println( "Duracion : " + this.getDuracion());
		System.out.println( "Vistas : " + this.getViews());
	}
	
	@Override
	public String toString() {
		String texto = super.toString();
		texto+= "\nDuracion : " + this.getDuracion();
		texto+= "\nVistas : " + this.getViews(); 
		return texto;
	}
}
