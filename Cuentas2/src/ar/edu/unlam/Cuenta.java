package ar.edu.unlam;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuenta {

	protected String CBU;
	protected String nombreDelPropietario;
	protected Double saldo;
	private List<Transaccion> transacciones;
	
	public Cuenta(String cBU, String nombreDelPropietario) {
		this.CBU = cBU;
		this.nombreDelPropietario = nombreDelPropietario;
		this.saldo = 0.00;
		this.transacciones = new ArrayList<>();
	}
	
	public String getCBU() {
		return CBU;
	}
	public void setCBU(String cBU) {
		CBU = cBU;
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
//        Transaccion transaccion = new Transaccion("deposito", cbu, cbu, monto);
//        transacciones.add(transaccion);
    }

    public abstract void retirarDinero(Double monto) throws SaldoInsuficienteException;

//    public void transferir(Double monto, Cuenta destino) {
//        if (saldo >= monto) {
//            saldo -= monto;
//            destino.agregarDinero(monto);
//            Transaccion transaccion = new Transaccion("transferencia", cbu, destino.getCbu(), monto);
//            transacciones.add(transaccion);
//        } else {
//            throw new SaldoInsuficienteException("Saldo insuficiente en la cuenta " + cbu);
//        }
//    }
	
}
