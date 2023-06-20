package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioFinalTest {

	@Test
	public void queUnUsuarioFinalPuedaAgregarUnaFigurita() {

		UsuarioFinal usuario = new UsuarioFinal("Mati Tonello");
		Figurita figu1 = new Figurita("B2", 'B', "Argentina", "Diego Maradona", 3000.00);

		
		assertTrue(usuario.agregarFigurita(figu1));
 	}
	
	@Test
	public void queUnUsuarioFinalSiPuedaAgregarFiguritasExistentes() {
		final Integer CANTIDAD_DE_FIGURITAS_ESPERADAS = 2;
		UsuarioFinal usuario = new UsuarioFinal("Mati Tonello");
		Figurita figu1 = new Figurita("B2", 'B', "Argentina", "Diego Maradona", 3000.00);
		Figurita figu2 = new Figurita("B2", 'B', "Argentina", "Diego Maradona", 3000.00);

		
		assertTrue(usuario.agregarFigurita(figu1));
		assertTrue(usuario.agregarFigurita(figu2));
		assertEquals(CANTIDAD_DE_FIGURITAS_ESPERADAS, usuario.getCantidadDeStockDeFiguritas());
	}
	
	@Test
	public void queUnUsuarioFinalPuedaPegarUnaFigurita() {
		
	}

}
