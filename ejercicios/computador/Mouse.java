package cl.accenture.curso_java.guia_repaso;

/**
 * 
 * @author jmaldonado
 *
 */
public class Mouse {
	private boolean esInnalambrico;
	private int precio;
	private String color;
	
	public Mouse(){
		this.esInnalambrico = true;
		this.precio = 0;
		this.color = "";
	}
	
	public Mouse(boolean esInnalambrico, int precio, String color) {
		super();
		this.esInnalambrico = esInnalambrico;
		this.precio = precio;
		this.color = color;
	}




	public boolean isEsInnalambrico() {
		return esInnalambrico;
	}
	public void setEsInnalambrico(boolean esInnalambrico) {
		this.esInnalambrico = esInnalambrico;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
