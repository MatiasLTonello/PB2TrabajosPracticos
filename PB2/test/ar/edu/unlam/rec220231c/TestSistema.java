package ar.edu.unlam.rec220231c;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSistema {

	
	 
	@Test
	public void queSePuedaRegistrarUnaPelicula() throws PeliculaExistenteExeption {
		
		final Integer CANTIDAD_DE_PELICULAS_ESPERADAS = 1;
		Cine cine = new Cine ("hoyts");
		Integer codigoPelicula = 1;
		String descripcion = "Duro De matar" ;  
		Integer duracion = 105; // minutos
		Integer id=1;
		
		Pelicula pelicula= new Pelicula (descripcion, duracion );
		cine.registrarPelicula(codigoPelicula, pelicula);
		
		assertEquals(CANTIDAD_DE_PELICULAS_ESPERADAS, cine.getCantidadDePeliculas());
	}
	
	
	@Test(expected = PeliculaExistenteExeption.class)
	public void queAlRegistrarUnaPeliculaDuplicadaLanceUnaExpcionPeliculaDuplicadaException() throws PeliculaExistenteExeption {
		
		Cine cine = new Cine ("hoyts");
		Integer codigoPelicula = 1;
		String descripcion = "Duro De matar" ;  
		Integer duracion = 105; // minutos
		
		
		Pelicula pelicula= new Pelicula (descripcion, duracion);
		cine.registrarPelicula(codigoPelicula, pelicula);
	
		Pelicula pelicula2= new Pelicula ("Instinto", 95 );
	
		
		cine.registrarPelicula(codigoPelicula, pelicula2);
		
		 
	
	}
	
	@Test
	public void queSePuedaAsignarUnaPeliculaEnUnaSalaProyecciones() throws SalaDuplicadaException {
	
		final Integer cantidadDePeliculasEsperadasEnLaSala = 1;

		Pelicula pelicula= new Pelicula ("Instinto", 95 );
	
		Cine cine = new Cine ("hoyts");
		
		String nombreSala= "sala 1";
		Sala salaProyeccion = new SalaProyeccion(nombreSala);
	
		
		cine.registrarSala(salaProyeccion);
		salaProyeccion.addPelicula(pelicula);
		
		assertEquals(cantidadDePeliculasEsperadasEnLaSala, salaProyeccion.getCantidadDePeliculasAProyectar());
		
		
	}
	

	@Test
	public void queSePuedaAsignarUnaPeliculaEnUnaSalaProyecionTienda() throws SalaDuplicadaException {
	
		final Integer cantidadDePeliculasEsperadasEnLaSala = 1;

		Pelicula pelicula= new Pelicula ("Instinto", 95 );
	
		Cine cine = new Cine ("hoyts");
		
		String nombre= "sala 1";
		
		SalaTienda tienda=new SalaTienda("Tienda");
		SalaProyeccion salaproyeccion = new SalaProyeccion("proyeccion");
		Sala salaProyecionTienda = new ProyeccionTienda(nombre,tienda,salaproyeccion);
	
		cine.registrarSala(salaProyecionTienda);
		salaProyecionTienda.addPelicula(pelicula);
	
		assertEquals(cantidadDePeliculasEsperadasEnLaSala, salaProyecionTienda.getCantidadDePeliculasAProyectar());

		
	}
	

	@Test
	public void queSePuedaAlRegistrarUnaVentaEnSalaTienda() throws SalaDuplicadaException, SalaDeProyeccionException, SalaInexistenteException {
		
		
		final Integer CANTIDAD_DE_VENTAS_ESPERADAS = 1;
		Cine cine = new Cine ("hoyts");
		
		String nombre= "sala 1";
		SalaTienda salaTienda = new SalaTienda(nombre);
	
		cine.registrarSala(salaTienda);
		
		
		
		Integer numeroVenta =1;
		Double monto= 100d;
		Venta  venta = new Venta(numeroVenta, monto);
		cine.registrarVentaAUnaSala(nombre,venta);
		
		assertEquals(CANTIDAD_DE_VENTAS_ESPERADAS, salaTienda.getCantidadDeVentas());
		
		
		
		
	}


	@Test(expected = SalaDeProyeccionException.class)
	public void queSePuedaAlRegistrarUnaVentaEnSalaProyeccionTienda() throws SalaDuplicadaException, SalaDeProyeccionException, SalaInexistenteException {
		
		Cine cine = new Cine ("hoyts");
		
		String nombresala= "sala 1";
		

		SalaTienda tienda=new SalaTienda("Tienda");
		SalaProyeccion salaproyeccion = new SalaProyeccion("proyeccion");
		Sala salaProyeccionTienda = new  ProyeccionTienda(nombresala,tienda,salaproyeccion);
	
		cine.registrarSala(salaProyeccionTienda);
		
		
		
		Integer numeroVenta =1;
		Double monto= 100d;
		Venta  venta = new Venta(numeroVenta, monto);
		cine.registrarVentaAUnaSala(nombresala,venta);

				
		
		
	}
//
//	
//
//
//	@Test
//	public void queSePuedaAlRegistrarUnaPeliculasalaPoyeccionTienda() {
//		
//		
//		Cine cine = new Cine ("hoyts");
//		
//		Integer codigoPelicula = 1;
//		String descripcion = "Duro De matar" ;  
//		Integer duracion = 105; // minutos
//		Integer id=1;
//		
//		Pelicula pelicula= new Pelicula (descripcion, duracion );
//		cine.registrarPelicula(codigoPelicula, pelicula);
//				
//
//		SalaTienda tienda=new SalaTienda("Tienda");
//		SalaProyeccion salaproyeccion = new SalaProyeccion("proyeccion");
//		
//		String nombreSala ="sala Mixta";
//		Sala salaProyeccionTienda = new  ProyeccionTienda(nombreSala ,tienda,salaproyeccion);
//	
//		cine.registrarSala(salaProyeccionTienda);
//		
//		cine.registrarPeliculaAUnaSala(codigoPelicula,nombreSala );
//		assert___(     );
//		
//		
//	}
//	
//	
	@Test
	public void queSeCalculeCorrectamenteElTotalDeVentasDeTodasLasSalasDetipoTiendas() throws SalaDuplicadaException, SalaDeProyeccionException, SalaInexistenteException {
	


		Cine cine = new Cine ("hoyts");
		
		String nombre= "sala Tienda";
		Sala salaTienda = new SalaTienda(nombre);
	
		cine.registrarSala(salaTienda);
		
	
		Integer numeroVenta =1;
		Double monto= 100d;
		Venta  venta = new Venta(numeroVenta, monto);
		cine.registrarVentaAUnaSala(nombre,venta);



		SalaTienda tienda=new SalaTienda("Tienda");
		SalaProyeccion salaproyeccion = new SalaProyeccion("proyeccion");
		
		String nombreProyeccionTienda ="salaMixta";
		Sala salaTienda2 = new  ProyeccionTienda(nombreProyeccionTienda ,tienda,salaproyeccion);
	
		cine.registrarSala(salaTienda2);
	
	
		Integer numeroVenta2 =2;
		Double monto2= 300d;
		Venta  venta2 = new Venta(numeroVenta2, monto2);
//		cine.registrarVentaAUnaSala(nombreProyeccionTienda,venta2);

		
  	
		Double valorEsperado = 400d;
		Double valorObtenido = cine.obtenerEltotalDeVetasDeTodasLasConTiendas();
		assertEquals(valorEsperado,valorObtenido);
		

	
	}
//	
//	@Test
//	public void queSePuedaObtenerLasPeliculasQueSeProyectaEnTodasLasSalasOrdenasPorNombre() {
//		
//	}
//	



}
