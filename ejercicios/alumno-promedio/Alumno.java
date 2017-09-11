/**
 * 
 */
package cl.accenture.curso_java.guia_repaso;

/**
 * @author jmaldonado
 *
 */
public class Alumno {
	
	private String nombre;
	private double notaUno;
	private double notaDos;
	private double notaTres;
	
	//Constructor por defecto
	public Alumno(){
		this.nombre = "";
	}
	
	// Constructor utilizando todos los atributos
	public Alumno( String nombre, double notaUno, double notaDos, double notaTres ){
		this.nombre = nombre;
		this.notaUno = notaUno;
		this.notaDos = notaDos;
		this.notaTres = notaTres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNotaUno() {
		return notaUno;
	}

	public void setNotaUno(double notaUno) {
		this.notaUno = notaUno;
	}

	public double getNotaDos() {
		return notaDos;
	}

	public void setNotaDos(double notaDos) {
		this.notaDos = notaDos;
	}

	public double getNotaTres() {
		return notaTres;
	}

	public void setNotaTres(double notaTres) {
		this.notaTres = notaTres;
	}
	
	public double calcularPromedio(){
		return (this.notaUno + this.notaDos + this.notaTres)/3;
	}
	

}
