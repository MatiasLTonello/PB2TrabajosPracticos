package ar.unlam.edu.ar;

import java.util.*;

public class Empresa {

	private String nombre;
	private Map<Integer, Viaje> viajes;
	private Integer idViaje;

	// Se registran todas las ventas de pasajes de los pasajeros
	private Set<Ticket> tickets;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.setIdViaje(0);
		this.viajes = new HashMap<Integer, Viaje>();
		this.tickets = new HashSet<Ticket>();
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) { 
		this.nombre = nombre;
	}

	public Map<Integer, Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Map<Integer, Viaje> viajes) {
		this.viajes = viajes;
	}

	/*
	 * Registra Un Nuevo viaje se debe guardar en un mapa donde la Key es un entero
	 * y es autoincremental arrancando de 0
	 */
	public void registrarViaje(Viaje viaje) {
		viajes.put(idViaje, viaje);
		this.idViaje++;
	}

	/*
	 * Registra Un ticket para carga TicketCarga.class 
	 * Si el viaje no admite Carga lanza TipoTicketInvalidoExcption
	 *  si supera El peso maximo que soporta el   medioTransprte Lanza Una exception CapacidadExcedidaException
	 */

	public void registrarTicketcarga(Integer numeroViaje, Carga carga) {
		// TODO Auto-generated method stub

	}

	/*
	 * Se registra un TicketPasajero TicketPasajero 
	 * Si el viaje no admite pasajeros lanza TipoTicketInvalidoExcption 
	 * si supera la cantidad de pasajero que soporta el medioTransprte Lanza Una exception CantidadPasajeroSobrepasadaException
	 */

	public void registrarTicketPasajero(Integer numeroViaje, Pasajero pasajero) throws TipoTicketInvalidoException {
	
	}

	/*
	 * Se registra un TicketMixto TicketMixto.class  
	 * si supera la cantidad de pasajero que soporta el medioTransprte Lanza Una exception CantidadPasajeroSobrepasadaException
	 * si supera El peso maximo que soporta el   medioTransprte Lanza Una exception CapacidadExcedidaException
	 */

	public void registrarTicketMixto(Integer numeroViaje, Pasajero pasajero,Carga carga) {
		// TODO Auto-generated method stub

	}


	
	
	
	
	
	
	/*
	 * retorna la lista de pasajero enforma Descendiente Lanza una exception si el
	 * viaje no existe o si el tipo de viaje No es compatible para trnssporte de
	 * pasajero lanza una exception si el viaje no existe
	 */

	public TreeSet<Pasajero> obtenerListaPasajeroOrdenadosPorDNIDescendiente(Integer numeroViaje) {

		return null;
	}

	public Double obtenerELTotalDeCargaTransportadaEnTodosLosViajes() {

		return null;
	}

	public Integer getIdViaje() {
		return idViaje;
	}

	public void setIdViaje(Integer idViaje) {
		this.idViaje = idViaje;
	}

}
