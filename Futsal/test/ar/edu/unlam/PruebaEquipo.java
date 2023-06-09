package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaEquipo {

	@Test
	public void queSePuedaAgregarUnJugadorAUnEquipo() {
		//Datos de entrada
		Equipo river = new Equipo("River Plate");
		Jugador jugador1 = new Jugador("Mati", 40143300);
		final int CANTIDAD_DE_JUGADORES_ESPERADOS = 1;
		// Ejecucion
		
		
		//Validacion
		assertTrue(river.agregarJugador(jugador1));
	}
	
	@Test
	public void queAlCrearUnJugadorSeLePuedaPonerUnValor() {
		//Datos de entrada
		final Double precioDelJugador = 2000.00;


		// Ejecucion
		Jugador jugador1 = new Jugador("Mati", 40143300, 2000.00, 40);
		
		//Validacion
		
		assertEquals(jugador1.getPrecioDelJugador(), precioDelJugador);
		
	}
	
	@Test
	public void queSeCalculeCorrectamenteElValorDeUnEquipo() {
		
		// datos de entrada
		
		final Double VALOR_ESPERADO_DEL_EQUIPO = 7000.00;
        Equipo boca = new Equipo("Boca Juniors");
        Jugador jugador1 = new Jugador("Matiute", 40143300, 3500.00, 23);
        Jugador jugador2 = new Jugador("Florencia", 41150493, 3500.00, 28);
        
        //Ejecucion
        
        boca.agregarJugador(jugador1);
        boca.agregarJugador(jugador2);
        
        //validacion
        
        assertEquals(VALOR_ESPERADO_DEL_EQUIPO, boca.getValorDelEquipo());
        
	}
	
	@Test
	public void queElJugadorTengaCorrectamenteElPrecio() {
		final Double VALOR_DEL_JUGADOR = 3500.00;
		Equipo boca = new Equipo("Boca Juniors");
		
		Jugador jugador1 = new Jugador("matute", 40143300, 3500.00, 40);
		
		assertEquals(VALOR_DEL_JUGADOR, jugador1.getPrecioDelJugador());
	}
	
	@Test
	public void queSePuedaCrearUnEquipo() {
		//Datos de entrada
		
		// Ejecucion
		
		Equipo river = new Equipo("River Plate");
		
		//Validacion
		
		assertNotNull(river);
	}

	@Test
	public void poderCalcularLaEdadPromedioDeUnEquipo() {
		final Double EDAD_PROMEDIO_DEL_EQUIPO_ESPERADA = 50.00;
		
		Equipo boca = new Equipo("Boca");
		
		Jugador jugador1 = new Jugador("Matute", 40143300, 3500.00, 50);
		Jugador jugador2 = new Jugador("Matute", 40143300, 3500.00, 50);
		Jugador jugador3 = new Jugador("Matute", 40143300, 3500.00, 50);
		
		boca.agregarJugador(jugador1);
		boca.agregarJugador(jugador2);
		boca.agregarJugador(jugador3);
		
		assertEquals(EDAD_PROMEDIO_DEL_EQUIPO_ESPERADA, boca.obtenerEdadPromedio());
	}
	
	@Test
	public void queSePuedaCrearUnPartido() {
		Equipo boca = new Equipo("Boca");
		Equipo river = new Equipo("River plate");
		Partido nuevoPartido = new Partido(boca, river);
		
		assertNotNull(nuevoPartido);
	}
	
	@Test
	public void obtenerElNombreDelEquipo1() {
		final String NOMBRE_ESPERADO = "Boca";
		Equipo boca = new Equipo("Boca");
		Equipo river = new Equipo("River plate");
		Partido nuevoPartido = new Partido(boca, river);
		
		assertEquals(NOMBRE_ESPERADO, nuevoPartido.getNombreEquipoLocal());
	}
	
	
	
}

	

	
