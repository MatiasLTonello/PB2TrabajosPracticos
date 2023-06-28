package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCuenta {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void queSePuedaInstanciarUnaCuentaCorrienteCorrectamente() {
		final String CBU_FINAL_ESPERADO = "20401433008";
		final String NOMBRE_FINAL_ESPERADO = "Matias Tonello";
		final Double DINERO_INICIAL_ESPERADO = 0.0;
		
		Cuenta nuevaCuenta = new CuentaCorriente(CBU_FINAL_ESPERADO, NOMBRE_FINAL_ESPERADO);
		
		assertNotNull(nuevaCuenta);
		assertEquals(NOMBRE_FINAL_ESPERADO, nuevaCuenta.getNombreDelPropietario());
		assertEquals(DINERO_INICIAL_ESPERADO, nuevaCuenta.getSaldo(), 0.1);
	}

	@Test
	public void queSePuedaInstanciarUnaCuentaSueldoCorrectamente() {
		final String CBU_FINAL_ESPERADO = "20401433008";
		final String NOMBRE_FINAL_ESPERADO = "Matias Tonello";
		final Double DINERO_INICIAL_ESPERADO = 0.0;
		
		Cuenta nuevaCuenta = new CuentaSueldo(CBU_FINAL_ESPERADO, NOMBRE_FINAL_ESPERADO);
		
		assertNotNull(nuevaCuenta);
		assertEquals(NOMBRE_FINAL_ESPERADO, nuevaCuenta.getNombreDelPropietario());
		assertEquals(DINERO_INICIAL_ESPERADO, nuevaCuenta.getSaldo(), 0.1);
	}
	
	@Test
	public void queSePuedaInstanciarUnaCuentaAhorroCorrectamente() {
		final String CBU_FINAL_ESPERADO = "20401433008";
		final String NOMBRE_FINAL_ESPERADO = "Matias Tonello";
		final Double DINERO_INICIAL_ESPERADO = 0.0;
		
		Cuenta nuevaCuenta = new CuentaAhorro(CBU_FINAL_ESPERADO, NOMBRE_FINAL_ESPERADO);
		
		assertNotNull(nuevaCuenta);
		assertEquals(NOMBRE_FINAL_ESPERADO, nuevaCuenta.getNombreDelPropietario());
		assertEquals(DINERO_INICIAL_ESPERADO, nuevaCuenta.getSaldo(), 0.1);
	}
	

}
