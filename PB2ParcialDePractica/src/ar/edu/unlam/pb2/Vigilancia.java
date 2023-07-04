package ar.edu.unlam.pb2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Vigilancia {

	private String nombre;

	// Colocar el tipo de coleccion que corresponda
	private Collection<Persona> personas;
	// Colocar el tipo de coleccion que corresponda
	private Collection<Banco> bancos;

	public Vigilancia(String nombre) {
		this.nombre = nombre;
	}
	
	//No se puede cambiar 
	private Map <Integer, Atraco> atracos;
	

	/*
	 * Registra tanto como Vigiladores como atracadores no permite registrar 2
	 * personas con el mismo DNI. Si esto sucede lanza una exception
	 * PersonaDuplicadaException
	 * 
	 */

	public void registrarPersona(Persona persona) {

	}

	public void agregarBanco(Banco banco) {

	}

	/*
	 * Este Metodo lanza las siguientes Excepciones NoSeEncuentraAtracadorException
	 * BancoNoEncontradoExcecption
	 * 
	 */
	
	public void registrarAtraco(Integer dniAtracador, Integer idBanco) {

	
	Atracador atracador;
	Banco banco;
	Atraco atraco = new Atraco (atracador,banco);		
	
	
	//Se debe agregar un atraco al Mapa
	this.atracos;	
		
		
	}
	

	
	//Si la clave no existe lanza ClaveInexistenteException
	public Atraco buscarAtracoPorClave(Integer claveAtraco) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public Vigilante obtenerElVigiladorDeUnAtraco(Integer claveAtraco) {

		
		Vigilante vigilante;
		
		
		
		return vigilante;
		
		
		
	}

	
	public Set<Atracador> obtenerAtracadoresOrdenados(OrdenPorApodos ordenPorApodo ){
		
		Set<Atracador> atracadoresOrdenadados;
		
		
		return atracadoresOrdenadados;
	}
	
	

}
