package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdministradorTest {

	@Test
	public void queUnAdministradorPuedaAgregarUnaFigurita() {

		Administrador admin = new Administrador("Mati Tonello");
		Figurita figu1 = new Figurita("B2", 'B', "Argentina", "Diego Maradona", 3000.00);
		Figurita figu2 = new Figurita("B2", 'B', "Argentina", "Diego Maradona", 3000.00);

		assertTrue(admin.agregarFigurita(figu1));
		
	}
	
	@Test
	public void queUnAdministradorNoPuedaAgregarUnaFiguritaExistente() {
		Administrador admin = new Administrador("Mati Tonello");
		Figurita figu1 = new Figurita("B2", 'B', "Argentina", "Diego Maradona", 3000.00);
		Figurita figu2 = new Figurita("B2", 'B', "Argentina", "Diego Maradona", 3000.00);
		assertTrue(admin.agregarFigurita(figu1));
		assertFalse(admin.agregarFigurita(figu2));

	}

}
