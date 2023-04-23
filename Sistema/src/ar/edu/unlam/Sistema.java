package ar.edu.unlam;

import java.util.LinkedList;

public class Sistema {
	
	private String nombreDelSistema;
	private Integer cantidadMaximaDeUsuarios;
	private LinkedList<Usuario> usuarios;

	public Sistema(String nombreDelSistema, Integer cantidadMaximaDeUsuarios) {
		this.setNombreDelSistema(nombreDelSistema);
		this.setCantidadMaximaDeUsuarios(cantidadMaximaDeUsuarios);
		this.usuarios = new LinkedList<>();
	}

	public String getNombreDelSistema() {
		return nombreDelSistema;
	}

	public void setNombreDelSistema(String nombreDelSistema) {
		this.nombreDelSistema = nombreDelSistema;
	}

	public Integer getCantidadMaximaDeUsuarios() {
		return cantidadMaximaDeUsuarios;
	}

	public void setCantidadMaximaDeUsuarios(Integer cantidadMaximaDeUsuarios) {
		this.cantidadMaximaDeUsuarios = cantidadMaximaDeUsuarios;
	}
	
	public boolean verificarSiElNombreDeUsuarioExisteEnElSistema(String nombreDeUsuario) {
		for(Usuario usuario : usuarios) {
			if(usuario.getNombreDeUsuario().equals(nombreDeUsuario)) {
				return true;
			}
		}
		return false;
	}

	public boolean agregarUsuario(Usuario usuario) {
		if(usuarios.size() < this.cantidadMaximaDeUsuarios && !verificarSiElNombreDeUsuarioExisteEnElSistema(usuario.getNombreDeUsuario())) {
			usuarios.add(usuario);
			return true;
		}
		return false;
	}

	public Integer getCantidadDeUsuariosLogueados() {
		Integer cantidadDeUsuariosLogueados = 0;
		for(Usuario usuario: usuarios) {
			if(usuario.getEstaLogueado() == true) {
				cantidadDeUsuariosLogueados++;
			}
		}
		return cantidadDeUsuariosLogueados;
	}
	
	public Integer getCantidadDeUsuariosBloqueados() {
		Integer cantidadDeUsuariosBloqueados = 0;
		for(Usuario usuario: usuarios) {
			if(usuario.getEstaBloqueado() == true) {
				cantidadDeUsuariosBloqueados++;
			}
		}
		return cantidadDeUsuariosBloqueados++;
	}

	public Double calcularEdadPromedio() {
		Double edadPromedio = 0.00;
		for(Usuario usuario: usuarios) {
			edadPromedio += usuario.getEdad();
		}
		return edadPromedio / usuarios.size();
	}

	public boolean loggearUsuario(String nombreDeUsuario, String contrasenia) {
		for(Usuario usuario: usuarios) {
			if(usuario.getNombreDeUsuario().equals(nombreDeUsuario) && usuario.getContrasenia().equals(contrasenia)) {
				usuario.setEstaLogueado(true);
				return true;
			}
		}
		return false;
	}

	
}
