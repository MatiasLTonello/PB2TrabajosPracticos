package ar.edu.unlam;

public class CuentaSueldo extends Cuenta{

	public CuentaSueldo(String dNI, String nombreYApellido) {
		super(dNI, nombreYApellido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean extraerDinero(Double dineroAExtraer) {
		if(this.getDineroEnCuenta() <= dineroAExtraer) {
			Double nuevoTotal = this.getDineroEnCuenta() - dineroAExtraer;
			this.setDineroEnCuenta(nuevoTotal);
			return true;
		}
		return false;
	}



	

}
