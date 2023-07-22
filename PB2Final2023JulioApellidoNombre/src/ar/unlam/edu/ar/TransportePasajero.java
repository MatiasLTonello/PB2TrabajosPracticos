package ar.unlam.edu.ar;

import java.util.*;

public class TransportePasajero extends MedioTransporte {
	
	private Integer cantidadDePasajerosMaximo;
	private List <Pasajero> pasajeros;
	
	public TransportePasajero(String patente, Integer cantidadDePasajerosMaximos) {
		super(patente);
		this.setPasajeros(new ArrayList <Pasajero>(cantidadDePasajerosMaximos));
	}

	public Integer getCantidadDePasajerosMaximo() {
		return cantidadDePasajerosMaximo;
	}

	public void setCantidadDePasajerosMaximo(Integer cantidadDePasajerosMaximo) {
		this.cantidadDePasajerosMaximo = cantidadDePasajerosMaximo;
	}

	public List <Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(List <Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	public Integer getCantidadDePasajeros() {
		return this.pasajeros.size();
	}

}
