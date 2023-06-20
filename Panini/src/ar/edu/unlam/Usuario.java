package ar.edu.unlam;

public abstract class Usuario {

	private String nombreDeUsuario;
	
	public abstract Boolean agregarFigurita(Figurita figurita);

	public Usuario(String nombreDeUsuario) {
		super();
		this.nombreDeUsuario = nombreDeUsuario;
	}
	
	
}
