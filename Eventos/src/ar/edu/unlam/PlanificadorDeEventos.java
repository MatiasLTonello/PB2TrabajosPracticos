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
		usuarios.add(organizador);
		usuarios.addAll(cumple.getAgasajado());
		cumple.setOrganizador(organizador);
		eventos.put(cumple, organizador);	
	}

	public Integer getCantidadDeUsuarios() {
		return usuarios.size();
	}

	public Integer getCantidadDeEventos() {
		return eventos.size();
	}

	public Integer getCantidadDeCumpleanios() {
		Set<Evento> todosLosEventos = eventos.keySet();
		Integer cantidadDeCumpleanios = 0;
		for(Evento actual: todosLosEventos) {
			if(actual instanceof Cumple) {
				cantidadDeCumpleanios++;
			}
		}
		return cantidadDeCumpleanios;
	}

	public Evento getEvento(String descripcionEvento) {
		Set<Evento> todosLosEventos = eventos.keySet();
		for(Evento actual: todosLosEventos) {
			if(actual.getDescripcion().equals(descripcionEvento)) {
				return actual;
			}
		}
		return null;
	}

	public Integer getCantidadDeCasamientos() {
		Set<Evento> todosLosEventos = eventos.keySet();
		Integer cantidadDeCasamientos = 0;
		for(Evento actual: todosLosEventos) {
			if(actual instanceof Casamiento) {
				cantidadDeCasamientos++;
			}
		}
		return cantidadDeCasamientos;
	}

	public void invitar(Evento elEvento, Invitado invitado) {
		elEvento.add(invitado);
	}

	public void confirmar(Evento alQueConfirma, Invitado elQueConfirma) {

		alQueConfirma.confirmar(elQueConfirma);
	}


}
