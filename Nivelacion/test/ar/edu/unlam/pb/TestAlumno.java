package ar.edu.unlam.pb;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAlumno {

	@Test
	public void queSeGuardeCorrectamenteLaNotaDelPrimerParcial() {
		// Datos de entrada
		
		int notaDelPrimerParcial = 7;
		Alumno actual;
		
		// Ejecucion
		
		actual = new Alumno();
		actual.setNotaPrimerParcial(notaDelPrimerParcial);
		
		// Validacion
		
		assertEquals(7, actual.getNotaPrimerParcial());
	}

	@Test
	public void queSiMeSaco7Y10YLasAsistenciasSon25HayaAprobado() {
		// Datos de entrada
		
			final int NOTA_DEL_PRIMER_PARCIAL = 8;
			final int NOTA_DEL_SEGUNDO_PARCIAL = 9;
			final int ASISTENCIA = 25;
			Alumno actual;
		// Ejecucion
			
			actual = new Alumno();
			actual.setNotaPrimerParcial(NOTA_DEL_PRIMER_PARCIAL);
			actual.setNotaSegundoParcial(NOTA_DEL_SEGUNDO_PARCIAL);
			actual.setCantidadAsistencias(ASISTENCIA);
		
			
		//Validacion
			
		assertTrue(actual.aprobo());
	}
	
	@Test
	public void queElToStringDelAlumnoConcateneElDNIYElNombre() {
		
		//Datos de entrada
		final int DNI = 40143300;
		final String NOMBRE = "Pedro";
		String valorEsperado = "40143300 -  Matias";
		Alumno actual;
		
		// Ejecucion
		actual = new Alumno();
		actual.setDni(DNI);
		actual.setNombre(NOMBRE);
		
		//Validacion
		
		assertEquals(valorEsperado, actual.toString());
	}
}
