package ar.edu.unlam;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(String cBU, String nombreDelPropietario) {
		super(cBU, nombreDelPropietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirarDinero(Double monto) throws SaldoInsuficienteException {
		if(monto <= this.saldo) {
			this.saldo -= monto;
			 Transaccion transaccion = new Transaccion(TipoDeTransaccion.EXTRACCION, this.CBU, null, monto);
			 this.agregarTransaccion(transaccion);
		} else {
			throw new SaldoInsuficienteException("No podes retirar mas guita de la que tenes");
		}
		
	}

}
