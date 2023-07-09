package ar.edu.unlam;

import java.util.Set;
import java.util.HashSet;

public class PlanificadorDeEventos {
	
	private Set<Usuario> usuarios;

	public PlanificadorDeEventos() {
		usuarios = new HashSet<Usuario>();
	}
	
	public void add(Usuario nuevo) {
		usuarios.add(nuevo);
	}

}
