package ar.edu.unlam;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
    private List<Evento> eventos;


	
	public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
        this.eventos = new ArrayList<>();

	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}
	
	public String getNombreEquipoLocal() {
		return equipoLocal.getNombreDelEquipo();
	}



}
