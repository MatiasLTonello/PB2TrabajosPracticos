package ar.edu.unlam;

import java.util.Set;
import java.util.HashSet;

public class Cumple extends Evento {
	
	public Cumple(Agasajado agasajado) {
		this.agasajado = agasajado;
		this.setDescripcion("El cumple de " + agasajado.getNombre());
	}




	private Agasajado agasajado;



	

	public void setAgasajado(Agasajado elQueCumple) {
		this.agasajado = elQueCumple;
	}





	@Override
	public Set<Agasajado> getAgasajado() {
		Set<Agasajado> agasajados = new HashSet<Agasajado>();
		agasajados.add(agasajado);
		return agasajados;
	}





	@Override
	protected void add(Agasajado agasajado) {

		if(this.agasajado != null) {
			this.agasajado = agasajado;
		} 
	}

}
