package ar.edu.unlam;

import java.util.HashSet;

public class Administrador extends Usuario {

    private HashSet<Figurita> stockFiguritas;
	public Administrador(String nombreDeUsuario) {
		super(nombreDeUsuario);
		stockFiguritas = new HashSet<>();
	}

	@Override
	public Boolean agregarFigurita(Figurita figurita) {
		return stockFiguritas.add(figurita);
	}

}
