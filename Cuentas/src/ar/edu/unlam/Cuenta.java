package ar.edu.unlam;

public abstract class Cuenta {

	private String DNI;
	private String nombreYApellido;
	private Double dineroEnCuenta;
	private Boolean esVip;
	
	public Cuenta(String dNI, String nombreYApellido, Double dineroEnCuenta, Boolean esVip) {
		DNI = dNI;
		this.nombreYApellido = nombreYApellido;
		this.dineroEnCuenta = dineroEnCuenta;
		this.esVip = esVip;
	}
	
	public abstract Boolean extraerDinero(Double dineroAExtraer);
	public abstract Double depositarDinero(Double dineroADepositar);

	
	public Cuenta(String dNI, String nombreYApellido) {
		DNI = dNI;
		this.nombreYApellido = nombreYApellido;
	}

	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	public Double getDineroEnCuenta() {
		return dineroEnCuenta;
	}
	public void setDineroEnCuenta(Double dineroEnCuenta) {
		this.dineroEnCuenta = dineroEnCuenta;
	}
	public Boolean getEsVip() {
		return esVip;
	}
	public void setEsVip(Boolean esVip) {
		this.esVip = esVip;
	}
	
	
}
