package ar.edu.unlam;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class PlanificadorDeEventos {
	
	private Set<Usuario> usuarios;
	private  Map<Evento, Organizador> eventos;

	public PlanificadorDeEventos() {
		usuarios = new HashSet<Usuario>();
		eventos = new HashMap<Evento, Organizador>();
	}
	
	public void add(Usuario nuevo) {
		usuarios.add(nuevo);
	}

	public Usuario getUsuario(String mail) {
		for(Usuario actual: usuarios) {
			if(actual.getMail().equals(mail)) {
				return actual;
			}
		}
		return null;
	}

	public void crear(Organizador organizador, Evento cumple) {
		eventos.put(cumple, organizador);	
	}

	public Integer getCantidadDeUsuarios() {
		return usuarios.size();
	}

	public Integer getCantidadDeEventos() {
		return eventos.size();
	}
}
