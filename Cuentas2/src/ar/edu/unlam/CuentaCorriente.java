package ar.edu.unlam;

public class CuentaCorriente extends Cuenta {

	private Double descubierto;
	public CuentaCorriente(String cBU, String nombreDelPropietario, Double descubierto) {
		super(cBU, nombreDelPropietario);
		// TODO Auto-generated constructor stub
		this.setDescubierto(descubierto);
	}

	 @Override
	    public void retirarDinero(Double monto) throws SaldoInsuficienteException {
	        if (monto <= saldo) {
	            saldo -= monto;
	        } else if (monto <= saldo + descubierto) {
	            Double descubiertoUtilizado = monto - saldo;
	            Double comisionDescubierto = descubiertoUtilizado * 0.05;
	            saldo -= descubiertoUtilizado + comisionDescubierto;
	            saldo -= descubiertoUtilizado;
	            Transaccion transaccion = new Transaccion(TipoDeTransaccion.EXTRACCION, this.CBU, null, monto);
	            this.agregarTransaccion(transaccion);
	        } else {
	            throw new SaldoInsuficienteException("Saldo insuficiente, incluso con el descubierto.");
	        }
	    }




	public Double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(Double descubierto) {
		this.descubierto = descubierto;
	}

	
}
