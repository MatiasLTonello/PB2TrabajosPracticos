package ar.edu.unlam;

import java.util.Set;
import java.util.HashSet;


public class Casamiento extends Evento {

	private Set<Agasajado> agasajados;
	
	public Casamiento(String descripcion) {
		this.setDescripcion(descripcion);
		agasajados = new HashSet<Agasajado>();
	}

	@Override
	public Set<Agasajado> getAgasajado() {
		return agasajados;
	}

	@Override
	protected void add(Agasajado nuevo) {

		agasajados.add(nuevo);
	}

	

}
