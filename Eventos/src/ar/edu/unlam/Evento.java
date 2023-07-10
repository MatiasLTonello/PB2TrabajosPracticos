package ar.edu.unlam;

import java.util.Objects;
import java.util.Set;

public abstract class Evento {

	private String descripcion;
	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private Organizador organizador;



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

	
	
}
