package ar.edu.unlam;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Cuenta {

	protected String CBU;
	protected String nombreDelPropietario;
	protected Double saldo;
	private List<Transaccion> transacciones;
	
	public Cuenta(String CBU, String nombreDelPropietario) {
		this.CBU = CBU;
		this.nombreDelPropietario = nombreDelPropietario;
		this.saldo = 0.00;
		transacciones = new ArrayList<>();
	}
	
	public String getCBU() {
		return CBU;
	}
	public void setCBU(String CBU) {
		this.CBU = CBU;
	}
	public String getNombreDelPropietario() {
		return nombreDelPropietario;
	}
		

	public void setNombreDelPropietario(String nombreDelPropietario) {
		this.nombreDelPropietario = nombreDelPropietario;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
    public void agregarDinero(Double monto) {
        saldo += monto;
        Transaccion transaccion = new Transaccion(TipoDeTransaccion.DEPOSITO, this.CBU, null , monto);
        transacciones.add(transaccion);
    }
    
    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    } 	
    
    public void transferirDinero(Cuenta cuentaDestino, Double monto) throws SaldoInsuficienteException {
        if (saldo >= monto) {
            this.retirarDinero(monto);
            cuentaDestino.agregarDinero(monto);

            Transaccion transaccionOrigen = new Transaccion(TipoDeTransaccion.DEPOSITO, this.getCBU(), cuentaDestino.getCBU(), monto);
            transacciones.add(transaccionOrigen);

            Transaccion transaccionDestino = new Transaccion(TipoDeTransaccion.DEPOSITO, this.getCBU(), cuentaDestino.getCBU(), monto);
            transacciones.add(transaccionDestino);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferir $" + monto);
        }
    }
    
    public List<Transaccion> getHistorialTransacciones() {
        return transacciones;
    }

    public abstract void retirarDinero(Double monto) throws SaldoInsuficienteException;

	@Override
	public int hashCode() {
	    return Objects.hash(CBU);
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;
	    Cuenta other = (Cuenta) obj;
	    return Objects.equals(CBU, other.CBU);
	}
	
}
