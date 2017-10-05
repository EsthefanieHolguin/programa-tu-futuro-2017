package cl.accenture.curso_java.guia_trece;

public class Producto implements Comparable<Producto> {

	private int identificador;
	private String nombre;
	private int precio;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param identificador
	 * @param nombre
	 * @param precio
	 */
	public Producto(int identificador, String nombre, int precio) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Producto ){
			Producto prod = (Producto)obj;
			return this.identificador == prod.getIdentificador();
		}
		return false;
	}

	public int compareTo(Producto o) {
		if( this.precio > o.getPrecio() ){
			return 1;
		}
		if( this.precio < o.getPrecio() ){
			return -1;
		}
		return 0;
//		return this.nombre.compareTo( o.getNombre() );
	}
	
	
	
}
