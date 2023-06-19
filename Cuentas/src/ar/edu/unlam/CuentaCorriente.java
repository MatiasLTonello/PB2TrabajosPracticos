package ar.edu.unlam;

public class CuentaCorriente extends Cuenta {
    private double limiteDescubierto;

    public CuentaCorriente(String dNI, String nombreYApellido, Double limiteDescubierto) {
		super(dNI, nombreYApellido);
		this.limiteDescubierto = limiteDescubierto;
	}


	@Override
	public Boolean extraerDinero(Double dineroAExtraer) {
		Double saldoDisponible = this.getDineroEnCuenta() + limiteDescubierto;
		if(saldoDisponible >= dineroAExtraer) {
			if(this.getDineroEnCuenta() >= dineroAExtraer) {
			Double nuevoSaldo = this.getDineroEnCuenta() - dineroAExtraer;
			this.setDineroEnCuenta(nuevoSaldo);
			return true;
			} else {
			 Double descubiertoUtilizado = dineroAExtraer - this.getDineroEnCuenta();
             Double comision = descubiertoUtilizado * 0.05;
             this.setDineroEnCuenta(0.00);
             return true;
			}
		} 
		return false;
	}

	
}
