package ar.edu.unlam;

public class CuentaAhorro extends Cuenta {

	private Integer cantidadDeExtracciones;
	public CuentaAhorro(String cBU, String nombreDelPropietario) {
		super(cBU, nombreDelPropietario);
		this.cantidadDeExtracciones = 0;
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public void retirarDinero(Double monto) throws SaldoInsuficienteException  {
	    if (monto <= saldo) {
	        if (cantidadDeExtracciones < 5) {
	            saldo -= monto;
	            cantidadDeExtracciones++;
	        } else {
	            if (monto + 6 <= saldo) {
	                saldo -= (monto + 6);
	                cantidadDeExtracciones++;
	            }
	        }
	    } else {
	        throw new SaldoInsuficienteException("Saldo insuficiente para retirar $" + monto);
	    }
	}
	
	public Integer getCantidadDeExctracciones() {
		return this.cantidadDeExtracciones;
	}

}
