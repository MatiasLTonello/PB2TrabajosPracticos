package ar.edu.unlam;

public class Usuario {
	
	private String nombreDeUsuario;
	private Boolean estaLogueado;
	private Boolean estaBloqueado;
	private Integer edad;
	private String contrasenia;
	
	public Usuario(String nombreDeUsuario) {
		this.setNombreDeUsuario(nombreDeUsuario);
		this.setEstaLogueado(false);
		this.estaBloqueado = false;
	}

	public Usuario(String nombreDeUsuario, Integer edad) {
		this.setNombreDeUsuario(nombreDeUsuario);
		this.setEstaLogueado(false);
		this.estaBloqueado = false;
		this.edad = edad;
	}

	public Usuario(String nombreDeUsuario, Integer edad, String contrasenia) {
		this.setNombreDeUsuario(nombreDeUsuario);
		this.setEstaLogueado(false);
		this.estaBloqueado = false;
		this.edad = edad;
		this.contrasenia = contrasenia;
	}

	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	public void setNombreDeUsuario(String nombreDeUsuario) {
		this.nombreDeUsuario = nombreDeUsuario;
	}

	public Boolean getEstaLogueado() {
		return estaLogueado;
	}

	public void setEstaLogueado(Boolean estaLogueado) {
		this.estaLogueado = estaLogueado;
	}

	public Boolean getEstaBloqueado() {
		return estaBloqueado;
	}

	public void setEstaBloqueado(Boolean estaBloqueado) {
		this.estaBloqueado = estaBloqueado;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	
	

}
