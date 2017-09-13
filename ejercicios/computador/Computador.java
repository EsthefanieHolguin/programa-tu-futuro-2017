/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class Computador {

	private String marca;
	private String modelo;
	private Mouse mouse;
	private int precio;
	
	public Computador(){
		this.marca ="";
		this.modelo = "";
		this.mouse = new Mouse();
		this.precio = 0;
	}
	
	public Computador(String marca, String modelo, Mouse mouse, int precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.mouse = mouse;
		this.precio = precio;
	}




	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the mouse
	 */
	public Mouse getMouse() {
		return mouse;
	}
	/**
	 * @param mouse the mouse to set
	 */
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int calcularPrecio(){
		return this.precio + this.mouse.getPrecio();
	}
}
