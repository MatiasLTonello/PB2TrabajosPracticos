package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prueba {

	@Test
	public void queSePuedaCrearUnCumpleanios() {
		// Preparaci�n
		final String mailOrganizador = "chiquitapia@afa.com", nombreOrganizador = "Chiqui Tapia", mailAgasajado = "lio@Messi.com", nombreAgasajado = "Lionel Messi";
		final Integer edadOrganizador = 55, edadAgasajado = 36;
		final Integer cantidadDeUsuariosEsperados = 2, cantidadDeEventosEsperados = 1, cantidadDeCumpleaniosEsperados = 1, cantidadDeCasamientosEsperados = 0;
		
		// Ejecuci�n
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		principal.add(new Organizador(mailOrganizador, nombreOrganizador, edadOrganizador));
		principal.crear((Organizador)principal.getUsuario(mailOrganizador), (Evento)new Cumple(new Agasajado(mailAgasajado, nombreAgasajado, edadAgasajado)));
		
		// Validaci�n
		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
		assertEquals(cantidadDeEventosEsperados, principal.getCantidadDeEventos());
		assertEquals(cantidadDeCumpleaniosEsperados, principal.getCantidadDeCumpleanios());
		assertEquals(new Organizador(mailOrganizador, nombreOrganizador, edadOrganizador), principal.getEvento("El cumple de Lionel Messi").getOrganizador());
		assertEquals(cantidadDeCasamientosEsperados, principal.getCantidadDeCasamientos());
	}
	
	@Test
	public void queSePuedaCrearUnCasamiento() {
		// Preparaci�n
		final String mailOrganizador = "roberto@galan.com", nombreOrganizador = "Roberto Galan", mailAgasajado1 = "luli@salazar.com", nombreAgasajado1 = "Luciana Zalazar", mailAgasajado2 = "rodrigo@redrado.com", nombreAgasajado2 = "Rodrigo Redrado", nombreDelEvento = "El casamiento de Luli y Rodri";
		final Integer edadOrganizador = 101, edadAgasajado1 = 36, edadAgasajado2 = 43;
		final Integer cantidadDeUsuariosEsperados = 3, cantidadDeEventosEsperados = 1, cantidadDeCumpleaniosEsperados = 0, cantidadDeCasamientosEsperados = 1;
		
		// Ejecuci�n
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		principal.add(new Organizador(mailOrganizador, nombreOrganizador, edadOrganizador));
		principal.add(new Agasajado(mailAgasajado1, nombreAgasajado1, edadAgasajado1));
		principal.add(new Agasajado(mailAgasajado2, nombreAgasajado2, edadAgasajado2));
		principal.crear((Organizador)(principal.getUsuario(mailOrganizador)), new Casamiento(nombreDelEvento));
		principal.getEvento(nombreDelEvento).add(new Agasajado(mailAgasajado1, nombreAgasajado1, edadAgasajado1));
		principal.getEvento(nombreDelEvento).add(new Agasajado(mailAgasajado1, nombreAgasajado1, edadAgasajado1));		
		// Validaci�n
		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
		assertEquals(cantidadDeEventosEsperados, principal.getCantidadDeEventos());
		assertEquals(cantidadDeCumpleaniosEsperados, principal.getCantidadDeCumpleanios());
		assertEquals(new Organizador(mailOrganizador, nombreOrganizador, edadOrganizador), principal.getEvento(nombreDelEvento).getOrganizador());
		assertEquals(cantidadDeCasamientosEsperados, principal.getCantidadDeCasamientos());
	}
	
	@Test
	public void queSePuedaInvitarGenteAUnCumpleanios() {
		// Preparaci�n
		final String mailOrganizador = "chiquitapia@afa.com", nombreOrganizador = "Chiqui Tapia", mailAgasajado = "lio@Messi.com", nombreAgasajado = "Lionel Messi";
		final Integer edadOrganizador = 55, edadAgasajado = 36;
		final Integer cantidadDeUsuariosEsperados = 4, cantidadDeInvitadosEsperados = 2;
		
		// Ejecuci�n
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		principal.add(new Organizador(mailOrganizador, nombreOrganizador, edadOrganizador));
		principal.add(new Invitado("kunaguero@kunisports.com", "Sergio Aguero", 36));
		principal.add(new Invitado("kmbappe@second.com", "Kylian Mbapee", 24));
		Organizador organizadorDelEvento = (Organizador)principal.getUsuario(mailOrganizador);
		Cumple elCumpleDeLeo = new Cumple(new Agasajado(mailAgasajado, nombreAgasajado, edadAgasajado));
		principal.crear(organizadorDelEvento, elCumpleDeLeo);
		principal.invitar(elCumpleDeLeo, new Invitado("kunaguero@kunisports.com", "Sergio Aguero", 36));
		principal.invitar(elCumpleDeLeo, new Invitado("kmbappe@second.com", "Kylian Mbapee", 24));
		
		// Validaci�n
		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
		assertEquals(cantidadDeInvitadosEsperados, principal.getEvento("El cumple de Lionel Messi").getCantidadDeInvitados());
	}
	
	@Test
	public void queUnInvitadoPuedaConfirarSuAsistencia () {
		// Preparaci�n
		final String mailOrganizador = "chiquitapia@afa.com", nombreOrganizador = "Chiqui Tapia", mailAgasajado = "lio@Messi.com", nombreAgasajado = "Lionel Messi";
		final Integer edadOrganizador = 55, edadAgasajado = 36;
		final Integer cantidadDeUsuariosEsperados = 4, cantidadDeInvitadosEsperados = 2, cantidadDeInvitadosConfirmados = 1;
		Invitado elKun = new Invitado("kunaguero@kunisports.com", "Sergio Aguero", 36);
		Invitado elSegundo = new Invitado("kmbappe@second.com", "Kylian Mbapee", 24);
		Agasajado agasajado = new Agasajado(mailAgasajado, nombreAgasajado, edadAgasajado);
		// Ejecuci�n
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		principal.add(new Organizador(mailOrganizador, nombreOrganizador, edadOrganizador));
		principal.add(elKun);
		principal.add(elSegundo);
		Organizador organizadorDelEvento = (Organizador) principal.getUsuario(mailOrganizador);
		Cumple elCumpleDeLeo = new Cumple(agasajado);
		principal.crear(organizadorDelEvento, (Evento)elCumpleDeLeo);
		principal.invitar(elCumpleDeLeo, elKun);
		principal.invitar(elCumpleDeLeo, elSegundo);
		principal.confirmar(elCumpleDeLeo, elKun);
		
		// Validaci�n
		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
		assertEquals(cantidadDeInvitadosEsperados, principal.getEvento("El cumple de Lionel Messi").getCantidadDeInvitados());
		assertEquals(cantidadDeInvitadosConfirmados, principal.getEvento("El cumple de Lionel Messi").getCantidadDeInvitadosConfirmados());
	}
	
	@Test(expected = UsuarioNoInvitado.class)
	public void queSiUnUsuarioAsisteAUnEventoQueNoFueInvitadoSalgaException () throws UsuarioNoInvitado {
		// Preparaci�n
		final String mailOrganizador = "chiquitapia@afa.com", nombreOrganizador = "Chiqui Tapia", mailAgasajado = "lio@Messi.com", nombreAgasajado = "Lionel Messi";
		final Integer edadOrganizador = 55, edadAgasajado = 36;
		final Integer cantidadDeUsuariosEsperados = 4, cantidadDeInvitadosEsperados =  1, cantidadDeInvitadosConfirmados = 1;
		Invitado elKun = new Invitado("kunaguero@kunisports.com", "Sergio Aguero", 36);
		Invitado elSegundo = new Invitado("kmbappe@second.com", "Kylian Mbapee", 24);
		Agasajado agasajado = new Agasajado(mailAgasajado, nombreAgasajado, edadAgasajado);
		// Ejecuci�n
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		principal.add(new Organizador(mailOrganizador, nombreOrganizador, edadOrganizador));
		principal.add(elKun);
		principal.add(elSegundo);
		Organizador organizadorDelEvento = (Organizador) principal.getUsuario(mailOrganizador);
		Cumple elCumpleDeLeo = new Cumple(agasajado);
		principal.crear(organizadorDelEvento, (Evento)elCumpleDeLeo);
		principal.invitar(elCumpleDeLeo, elKun);
		principal.confirmar(elCumpleDeLeo, elKun);
		
		// Validaci�n
		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
		assertEquals(cantidadDeInvitadosEsperados, principal.getEvento("El cumple de Lionel Messi").getCantidadDeInvitados());
		assertEquals(cantidadDeInvitadosConfirmados, principal.getEvento("El cumple de Lionel Messi").getCantidadDeInvitadosConfirmados());
		assertFalse(principal.getEvento("El cumple de Lionel Messi").asistir(elSegundo));
	}

}
