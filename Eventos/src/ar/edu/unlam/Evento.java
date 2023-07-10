package ar.edu.unlam;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;


public abstract class Evento {

	private String descripcion;
	private Organizador organizador;
	private List<Invitado> invitados; 
	private Set<Invitado> confirmados;


	public Evento() {
		invitados = new ArrayList<Invitado>();
		confirmados = new HashSet<Invitado>();
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	@Override
	public int hashCode() {
		return Objects.hash(descripcion);
	}
	
	public abstract Set<Agasajado> getAgasajado();
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(descripcion, other.descripcion);
	}

	public Organizador getOrganizador() {
		return organizador;
	}

	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	protected abstract void add(Agasajado agasajado);

	public void add(Invitado nuevo) {
		invitados.add(nuevo);
	}
	
	public Integer getCantidadDeInvitados() {
		return invitados.size();
	}
	
	public void confirmar(Invitado elQueConfirma) {

		confirmados.add(elQueConfirma);
	}
	public Integer getCantidadDeInvitadosConfirmados() {
		return confirmados.size();
	}
	
}
