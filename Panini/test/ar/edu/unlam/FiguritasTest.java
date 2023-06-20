package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class FiguritasTest {

	@Test
	public void queSePuedaCrearUnaFigurita() {
		final String CODIGO_IDENTIFICATORIO_ESPERADO = "B2";
		final char LETRA_DEL_GRUPO_AL_QUE_PERTENCE = 'B';
		final String SELECCION_ESPERADA = "Argentina";
		final String NOMBRE_DEL_JUGADOR_ESPERADO = "Diego Maradona";
		final Double VALOR_DEL_JUGADOR_ESPERADO = 3000.00;
		
		Figurita figu1 = new Figurita("B2", 'B', "Argentina", "Diego Maradona", 3000.00);
		
		assertEquals(CODIGO_IDENTIFICATORIO_ESPERADO, figu1.getCodigoIdentificatorio());
		assertEquals(LETRA_DEL_GRUPO_AL_QUE_PERTENCE, figu1.getLetraDelGrupoPerteneciente());
		assertNotNull(figu1);
		
		
	}

}
