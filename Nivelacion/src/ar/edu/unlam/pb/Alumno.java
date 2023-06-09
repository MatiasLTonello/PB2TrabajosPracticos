package ar.edu.unlam.pb;

public class Alumno {

	// Constructor 
	public Alumno() {
		 notaPrimerParcial = 0;
		 notaSegundoParcial = 0;
		 aprobo = false;
		 dni = 0;
		 cantidadAsistencias = 0;
	}
	
	public Alumno (int dni) {
		notaPrimerParcial = 0;
		 notaSegundoParcial = 0;
		 aprobo = false;
		 this.dni = dni;
		 cantidadAsistencias = 0;
	}
	
	
	public int getNotaPrimerParcial() {
		return notaPrimerParcial;
	}

	public void setNotaPrimerParcial(int notaPrimerParcial) {
		this.notaPrimerParcial = notaPrimerParcial;
	}

	public int getNotaSegundoParcial() {
		return notaSegundoParcial;
	}

	public void setNotaSegundoParcial(int notaSegundoParcial) {
		this.notaSegundoParcial = notaSegundoParcial;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getCantidadAsistencias() {
		return cantidadAsistencias;
	}

	public void setCantidadAsistencias(int cantidadAsistencias) {
		this.cantidadAsistencias = cantidadAsistencias;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	// Atributos
	private int notaPrimerParcial ;
	private int notaSegundoParcial ;
	private boolean aprobo;
	private int dni;
	private int cantidadAsistencias;
	private String nombre;
	
	public final int NOTA_MINIMA_PARA_APROBAR = 4;
	public final int CANTIDAD_DE_ASISTENCIAS_MINIMA = 25;
	

	//Comportamiento
	
	public boolean aprobo() {
		boolean resultado = false;
		if(notaPrimerParcial >= NOTA_MINIMA_PARA_APROBAR && notaSegundoParcial >= NOTA_MINIMA_PARA_APROBAR && cantidadAsistencias >= CANTIDAD_DE_ASISTENCIAS_MINIMA) {
			resultado = true;
		} 
		return resultado;
	}
	
	public String toString() {
		return "" + dni + " - " + this.getNombre();
	}
}
