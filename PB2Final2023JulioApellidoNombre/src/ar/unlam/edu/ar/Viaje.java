package ar.unlam.edu.ar;

import java.time.LocalDateTime;
import java.util.*;

public class Viaje {
	
	private LocalDateTime salida; 
	private LocalDateTime llegada;  
	private String origen;  
	private String destino;
	private MedioTransporte medioTransporte;
	private List<Pasajero> pasajeros;
	
	public Viaje(LocalDateTime salida, LocalDateTime llegada, String origen, String destino,
			MedioTransporte medioTransporte) {
			this.pasajeros = new ArrayList<Pasajero>();
	}
	public LocalDateTime getSalida() {
		return salida;
	}
	public void setSalida(LocalDateTime salida) {
		this.salida = salida;
	}
	public LocalDateTime getLlegada() {
		return llegada;
	}
	public void setLlegada(LocalDateTime llegada) {
		this.llegada = llegada;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public MedioTransporte getMedioTransporte() {
		return medioTransporte;
	}
	public void setMedioTransporte(MedioTransporte medioTransporte) {
		this.medioTransporte = medioTransporte;
	}
	public void registrarTicketPasajero(Pasajero pasajero) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
