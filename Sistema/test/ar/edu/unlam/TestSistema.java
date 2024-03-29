 package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSistema {

	@Test
	public void queSePuedaCrearUnSistema() {
		final String nombreDelSistema = "GM2";
		final Integer cantidadMaximaDeUsuarios = 5;
		
		Sistema GM2 = new Sistema(nombreDelSistema, cantidadMaximaDeUsuarios);
		
		assertNotNull(GM2);
	}
	
	@Test
	public void queSeEsteGuardandoBienElNombreDelSistema() {
		final String NOMBRE_DEL_SISTEMA_ESPERADO = "GM2";
		final Integer cantidadMaximaDeUsuarios = 5;
		
		Sistema GM2 = new Sistema("GM2", cantidadMaximaDeUsuarios);
		
		assertEquals(GM2.getNombreDelSistema(), NOMBRE_DEL_SISTEMA_ESPERADO);
	}

	@Test
	public void queSePuedaAgregarUnUsuarioAlSistema() {
		Usuario mati = new Usuario("matias1");

		Sistema GM2 = new Sistema("GM2", 3);

		assertTrue(GM2.agregarUsuario(mati));
		
	}
	
	@Test
	public void queNoSePuedaIngresarUnUsuarioAlSistemaConElMismoNombreQueOtroUsuario() {
		Usuario mati = new Usuario("matias1");
		Usuario mati2 = new Usuario("matias1");
		Usuario mati3 = new Usuario("matias3");
		Sistema GM2 = new Sistema("GM2", 3);
		GM2.agregarUsuario(mati3);
		GM2.agregarUsuario(mati2);
		assertFalse(GM2.agregarUsuario(mati));
	}
	
	@Test
	public void queSePuedaCalcularLaCantidadDeUsuariosLogueadosCorrectamente() {
		final Integer CANTIDAD_DE_USUARIOS_LOGUEADOS = 0;
		Usuario mati = new Usuario("matias1");
		Usuario mati2 = new Usuario("matias1");
		Usuario mati3 = new Usuario("matias3");
		Sistema GM2 = new Sistema("GM2", 3);
		GM2.agregarUsuario(mati);
		GM2.agregarUsuario(mati3);
		GM2.agregarUsuario(mati2);
		
		assertEquals(GM2.getCantidadDeUsuariosLogueados(), CANTIDAD_DE_USUARIOS_LOGUEADOS);
	}
	
	@Test
	public void queSeCalculeCorrectamenteLaEdadPromedioDeLosUsuariosEnElSistema() {
		Usuario mati = new Usuario("matias1", 30);
		Usuario mati2 = new Usuario("matias2", 120);
		Usuario mati3 = new Usuario("matias3", 30);
		final Double EDAD_PROMEDIO_ESPERADA = 60.00;
		Sistema GM2 = new Sistema("GM2", 3);
		GM2.agregarUsuario(mati);
		GM2.agregarUsuario(mati3);
		GM2.agregarUsuario(mati2);
		
		assertEquals(EDAD_PROMEDIO_ESPERADA, GM2.calcularEdadPromedio());
	}
	
	@Test
	public void queSePuedaLoggearUnUsuarioCorrectamente() {
		Usuario usuario1 = new Usuario("Matias", 30, "contrasenia");
		Sistema GM2 = new Sistema("GM2", 3);
		GM2.agregarUsuario(usuario1);

		assertTrue(GM2.loggearUsuario("Matias", "contrasenia"));
	}
	
	@Test
	public void queSeCalculeCorrectamenteLosUsuariosLoggeados() {
		Usuario usuario1 = new Usuario("Matias", 30, "contrasenia");
		Sistema GM2 = new Sistema("GM2", 3);
		GM2.agregarUsuario(usuario1);
		GM2.loggearUsuario("Matias", "contrasenia");
		final Integer CANTIDAD_DE_USUARIOS_LOGGEADOS_ESPERADOS = 1;
		
		
		assertEquals(CANTIDAD_DE_USUARIOS_LOGGEADOS_ESPERADOS, GM2.getCantidadDeUsuariosLogueados());
	}
	

}
