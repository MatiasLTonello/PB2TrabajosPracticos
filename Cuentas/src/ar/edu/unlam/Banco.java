package ar.edu.unlam;

public class Banco {

	private String nombreDelBanco;
	private String direccion;

	public Banco(String nombreDelBanco, String direccion) {
		this.setNombreDelBanco(nombreDelBanco);
		this.setDireccion(direccion);
	}

	public String getNombreDelBanco() {
		return nombreDelBanco;
	}

	public void setNombreDelBanco(String nombreDelBanco) {
		this.nombreDelBanco = nombreDelBanco;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
