package ar.edu.unlam;

import java.util.Objects;

public class Figurita {

	private String codigoIdentificatorio, seleccion, nombreDelJugador;
	private char letraDelGrupoPerteneciente;
	private Double valor;
	
	
	public Figurita(String codigoIdentificatorio, char letraDelGrupoPerteneciente, String seleccion, String nombreDelJugador, Double valor) {
		this.codigoIdentificatorio = codigoIdentificatorio;
		this.seleccion = seleccion;
		this.letraDelGrupoPerteneciente = letraDelGrupoPerteneciente;
		this.valor = valor;
		this.nombreDelJugador = nombreDelJugador;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigoIdentificatorio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figurita other = (Figurita) obj;
		return Objects.equals(codigoIdentificatorio, other.codigoIdentificatorio);
	}


	public String getCodigoIdentificatorio() {
		return codigoIdentificatorio;
	}


	public void setCodigoIdentificatorio(String codigoIdentificatorio) {
		this.codigoIdentificatorio = codigoIdentificatorio;
	}


	public String getSeleccion() {
		return seleccion;
	}


	public void setSeleccion(String seleccion) {
		this.seleccion = seleccion;
	}


	public String getNombreDelJugador() {
		return nombreDelJugador;
	}


	public void setNombreDelJugador(String nombreDelJugador) {
		this.nombreDelJugador = nombreDelJugador;
	}


	public char getLetraDelGrupoPerteneciente() {
		return letraDelGrupoPerteneciente;
	}


	public void setLetraDelGrupoPerteneciente(char letraDelGrupoPerteneciente) {
		this.letraDelGrupoPerteneciente = letraDelGrupoPerteneciente;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}
}
