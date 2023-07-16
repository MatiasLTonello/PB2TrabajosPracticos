package ar.edu.unlam.rec220231c;

import java.util.*;

public class Cine {
	
	//EN Los cines hay 3 tipos de salas Proyectables , Tiendas, ProyectablesTiendas
	
	//No cambisar
	private Map<Integer,Pelicula> peliculas;
	
	
	
	//No pueden existir 2 Salas con el mismo nombre
	private Set<Sala> salas;



	private String nombre;
	
	
	/*
	 * Busca la sala Por nombre. y registra la venta en en dicha sala\
	 * en caso de no encontrar la tienda lanza una excpetion. 
	 * Las ventas solamente se registran en las salas Tienda y en las TiendasPreyectables. 
	 * Las salas Proyectables no registranventas. En caso que se quiera Asiganar una venta en estos tipos 
	 * de salas lanza una exception VentaSalaException  
	 */

	public Cine(String nombre) {
		this.nombre=nombre;
		this.salas = new HashSet<Sala>();
		this.peliculas = new HashMap<>();

	}




	/*
	 * busca la sala por nombre y registra La Venta
	 * 	en caso que se registre una venta en una sala de proyeccion lanza una exception SalaException

	 */
	public void registrarVentaAUnaSala(String nombre, Venta venta) throws SalaDeProyeccionException, SalaInexistenteException {
	    Sala salaDondeRegistrar = buscarSalaPorNombre(nombre);
	    
	    if (salaDondeRegistrar instanceof SalaTienda) {
	        SalaTienda salaTienda = (SalaTienda) salaDondeRegistrar;
	        salaTienda.registrarVenta(venta);
	    } else {
	        throw new SalaDeProyeccionException("Es una sala de proye loco");
	    }
	}
	
	
	
	
	//Registrar Una pelicula en una sala donde se preyectan una Pelicula
	//en caso que se registre una pelicula en una sala de tienda lanza una exception SalaException
	//Si el codigo Pelicula esta duplicado Lanza una Exception PeliculaExistenteExeption
	public void registrarPelicula(Integer codigo, Pelicula pelicula) throws PeliculaExistenteExeption{
		
		if(peliculas.containsKey(codigo)) {
			throw new PeliculaExistenteExeption("Ya existe pa");
		}
		
		peliculas.put(codigo, pelicula);		
	}


	
	

	/*
	 * registra Una sala
	 * No se pueden registrar 2 salas con el mismo nombre, en caso que este se repita lanza Una Exception 
	 * SalaDuplicadaException
	 * 
	 */
	public void registrarSala(Sala sala) throws SalaDuplicadaException {
		for(Sala salaActual: salas) {
			if(salaActual.getNombre().equals(sala.getNombre())) {
				throw new SalaDuplicadaException("Sala duplicada");
			}
		}
		salas.add(sala);
	}


	/*
	 * Registra una pelicula en las salas de proyecciones
	 * en caso que la pelicula no existe lanza exception
	 * en caso que la  sala no exista launa excpetion salaInixistennte xception
	 */


	public void registrarPeliculaAUnaSala(Integer codigoPelicula, String nombreSala) throws PeliculaInexistenteException, SalaInexistenteException {
		Pelicula peliculaAAgregar = buscarPeliculaPorCodigo(codigoPelicula);
		Sala salaDondeSeRegistra = buscarSalaPorNombre(nombreSala);
		
		salaDondeSeRegistra.addPelicula(peliculaAAgregar);
		
	}
	
	private Sala buscarSalaPorNombre(String nombreSala) throws SalaInexistenteException {
		 for(Sala salaActual: salas) {
			 if(salaActual.getNombre().equals(nombreSala)) {
				 return salaActual;
			 }
		 }
		throw new SalaInexistenteException("No existe");
	}




	public Pelicula buscarPeliculaPorCodigo(Integer codigoPelicula) throws PeliculaInexistenteException {
		if(peliculas.containsKey(codigoPelicula)) {
			return peliculas.get(codigoPelicula);
		} else {
			throw new PeliculaInexistenteException("No existe esa peli");
		}
	}




	public Double obtenerEltotalDeVetasDeTodasLasConTiendas() {
		Double contadorDeVentas = 0.00;
		
		
		for(Sala sala: salas) {
			if(sala instanceof SalaTienda) {
		        SalaTienda salaTienda = (SalaTienda) sala;
		        contadorDeVentas += ((SalaTienda) sala).obtenerTotalDeVenta();
			}
		}
		
		return contadorDeVentas;
	}




	public Integer getCantidadDePeliculas() {
		return peliculas.size();
	}



 
	

}
