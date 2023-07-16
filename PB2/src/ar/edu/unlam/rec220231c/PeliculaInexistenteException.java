package ar.edu.unlam.rec220231c;

public class PeliculaInexistenteException extends Exception {
	public PeliculaInexistenteException (String mensaje) {
		super(mensaje);
	}
}
