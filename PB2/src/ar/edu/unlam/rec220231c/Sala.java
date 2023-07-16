package ar.edu.unlam.rec220231c;

import java.util.Objects;
import java.util.Set;
import java.util.*;

public abstract class Sala {
	
	private Set<Pelicula> peliculasAProyectar;

	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		return Objects.equals(nombre, other.nombre);
	}

	private String nombre;

	public Sala(String nombre) {
		this.peliculasAProyectar = new HashSet<Pelicula>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	
	public void addPelicula(Pelicula p) {
		peliculasAProyectar.add(p);
	}
	
	public Integer getCantidadDePeliculasAProyectar() {
		return peliculasAProyectar.size();
	}
	

}
