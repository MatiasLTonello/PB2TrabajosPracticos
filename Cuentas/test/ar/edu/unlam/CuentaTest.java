package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaTest {

	@Test
	public void queSePuedaCrearUnaCuentaCorriente() {
		final String DNI_ESPERADO = "40143300";
		final String NOMBRE_Y_APELLIDO_ESPERADO = "Matias Tonello";
		final Double DINERO_INICIAL_EN_CUENTA = 0.00;
		final Double LIMITE_DESCUBIERTO_INICIAL = 120.00;
		
		CuentaCorriente cuenta1 = new CuentaCorriente("40143300", "Matias Tonello", 120.00);
		
		assertEquals(DNI_ESPERADO, cuenta1.getDNI());
		assertNotNull(cuenta1);
	}
	
	@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
		final String DNI_ESPERADO = "40143300";
		final String NOMBRE_Y_APELLIDO_ESPERADO = "Matias Tonello";
		final Double DINERO_INICIAL_EN_CUENTA = 0.00;
		
		CuentaSueldo cuentaSueldo = new CuentaSueldo("40143300", "Matias Tonello");
		
		assertEquals(DNI_ESPERADO, cuentaSueldo.getDNI());
		assertNotNull(cuentaSueldo);
	}
	
	@Test
	public void queSePuedaCrearUnaCuentaDeAhorros() {
		final String DNI_ESPERADO = "40143300";
		final String NOMBRE_Y_APELLIDO_ESPERADO = "Matias Tonello";
		final Double DINERO_INICIAL_EN_CUENTA = 0.00;
		
		CuentaAhorro cuentaAhorro = new CuentaAhorro("40143300", "Matias Tonello");
		
		assertEquals(DNI_ESPERADO, cuentaAhorro.getDNI());
		assertNotNull(cuentaAhorro);
	}

}
