package ar.edu.unlam;

public class Jugador {
	
	private String nombre;
	private Integer dni;
	private Double precioDelJugador;
	private Integer edad;
	
	public Jugador(String nombre, Integer dni) {
		this.nombre = "Nombre";
		this.dni = dni;
		this.precioDelJugador = 0.00;
	}

	public Jugador(String nombre, Integer dni, Double precioDelJugador, Integer edad) {
		this.nombre = "Nombre";
		this.dni = dni;
		this.precioDelJugador = precioDelJugador;
		this.setEdad(edad);
	}

	public Double getPrecioDelJugador() {
		return precioDelJugador;
	}

	public void setPrecioDelJugador(Double precioDelJugador) {
		this.precioDelJugador = precioDelJugador;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
