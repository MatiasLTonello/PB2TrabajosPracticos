package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class BancoTest {

	@Test
	public void queSePuedaCrearUnBanco() {
		
		final String NOMBRE_DEL_BANCO_ESPERADO = "BBVA";
		final String DIRECCION_DEL_BANCO_ESPERADA = "BS AS";
		
		Banco bbva = new Banco("BBVA", "BS AS");
		
		assertEquals(NOMBRE_DEL_BANCO_ESPERADO, bbva.getNombreDelBanco());
		assertEquals(DIRECCION_DEL_BANCO_ESPERADA, bbva.getDireccion());
	}
	
	

}
