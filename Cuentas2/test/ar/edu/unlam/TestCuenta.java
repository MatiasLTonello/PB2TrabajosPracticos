package ar.edu.unlam;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestCuenta {


	@Test
	public void queSePuedaInstanciarUnaCuentaCorrienteCorrectamente() {
		final String CBU_FINAL_ESPERADO = "20401433008";
		final String NOMBRE_FINAL_ESPERADO = "Matias Tonello";
		final Double DINERO_DESCUBIERTO_FINAL = 150.00;
		final Double DINERO_INICIAL_ESPERADO = 0.0;
		
		Cuenta nuevaCuenta = new CuentaCorriente(CBU_FINAL_ESPERADO, NOMBRE_FINAL_ESPERADO, DINERO_DESCUBIERTO_FINAL);
		
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
	
	@Test(expected = SaldoInsuficienteException.class)
	public void queNoSePuedaRetirarMasDineroDelSaldoEnCuentasDeAhorro() throws SaldoInsuficienteException {
		final String CBU_FINAL_ESPERADO = "20401433008";
		final String NOMBRE_FINAL_ESPERADO = "Matias Tonello";
		
		Cuenta nuevaCuenta = new CuentaAhorro(CBU_FINAL_ESPERADO, NOMBRE_FINAL_ESPERADO);
		
		nuevaCuenta.agregarDinero(200.00);
		
		nuevaCuenta.retirarDinero(400.00);
		
	}
	

	@Test(expected = SaldoInsuficienteException.class)
	public void queNoSePuedaRetirarMasDineroDelSaldoEnCuentasSueldo() throws SaldoInsuficienteException {
		final String CBU_FINAL_ESPERADO = "20401433008";
		final String NOMBRE_FINAL_ESPERADO = "Matias Tonello";
		
		Cuenta nuevaCuenta = new CuentaSueldo(CBU_FINAL_ESPERADO, NOMBRE_FINAL_ESPERADO);
		
		nuevaCuenta.agregarDinero(200.00);
		
		nuevaCuenta.retirarDinero(400.00);
		
	}
	
	@Test
	public void queSeCobreUnRecargoDe6PesosDespuesDeLaQuintaExctraccionEnLasCajasDeAhorro() throws SaldoInsuficienteException {
		final String CBU_FINAL_ESPERADO = "20401433008";
		final String NOMBRE_FINAL_ESPERADO = "Matias Tonello";
		final Double SALDO_FINAL_ESPERADO = 40.00;
		final Integer CANTIDAD_DE_EXCTRACCIONES_ESPERADAS = 7;
		
		Cuenta nuevaCuenta = new CuentaAhorro(CBU_FINAL_ESPERADO, NOMBRE_FINAL_ESPERADO);
		
		nuevaCuenta.agregarDinero(400.00);
		nuevaCuenta.retirarDinero(300.00);
		nuevaCuenta.retirarDinero(10.00);
		nuevaCuenta.retirarDinero(10.00);
		nuevaCuenta.retirarDinero(10.00);
		nuevaCuenta.retirarDinero(10.00);
		nuevaCuenta.retirarDinero(4.00);
		nuevaCuenta.retirarDinero(4.00);
		
		assertEquals(CANTIDAD_DE_EXCTRACCIONES_ESPERADAS, ((CuentaAhorro)nuevaCuenta).getCantidadDeExctracciones());
		
		assertEquals(SALDO_FINAL_ESPERADO, nuevaCuenta.getSaldo(), 0.1);
	}
	
	@Test
	public void queSePuedaRetirarTeniendoElSaldoDeDescubiertoEnCuentaYSeCobreElPorcentaje() throws SaldoInsuficienteException {
		final String CBU_FINAL_ESPERADO = "20401433008";
		final String NOMBRE_FINAL_ESPERADO = "Matias Tonello";
		final Double SALDO_DESCUBIERTO = 150.00;
		final Double SALDO_FINAL_ESPERADO = -105.00;
	
		
		Cuenta nuevaCuenta = new CuentaCorriente(CBU_FINAL_ESPERADO, NOMBRE_FINAL_ESPERADO, SALDO_DESCUBIERTO);
		
		nuevaCuenta.agregarDinero(100.00);
		nuevaCuenta.retirarDinero(200.00);

		assertEquals(SALDO_FINAL_ESPERADO, nuevaCuenta.getSaldo(), 0.1);
		
	}
	

}
