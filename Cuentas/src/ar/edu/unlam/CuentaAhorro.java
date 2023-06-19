package ar.edu.unlam;

public class CuentaAhorro extends Cuenta {

	private Integer cantidadDeExtracciones;
	public CuentaAhorro(String dNI, String nombreYApellido) {
		super(dNI, nombreYApellido);
		this.setCantidadDeExtracciones(0);
	}

	@Override
	public Boolean extraerDinero(Double dineroAExtraer) {
		if(this.getDineroEnCuenta() <= dineroAExtraer) {
			Double nuevoTotal;
			if(this.cantidadDeExtracciones <= 5) {
				nuevoTotal = this.getDineroEnCuenta() - dineroAExtraer;
				this.setDineroEnCuenta(nuevoTotal);
				this.cantidadDeExtracciones++;
				return true;
			} else {
				nuevoTotal = this.getDineroEnCuenta() - dineroAExtraer - 6.00;
				this.setDineroEnCuenta(nuevoTotal);
				this.cantidadDeExtracciones++;
				return true;
			}
		}
		return false;
	}


	public Integer getCantidadDeExtracciones() {
		return cantidadDeExtracciones;
	}

	public void setCantidadDeExtracciones(Integer cantidadDeExtracciones) {
		this.cantidadDeExtracciones = cantidadDeExtracciones;
	}
	
	

}
