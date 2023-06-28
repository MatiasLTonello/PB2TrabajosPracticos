package ar.edu.unlam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {
	  private HashSet<Cuenta> cuentas;
	  private List<Transaccion> transacciones;
	  private String nombreBanco;

	  public Banco(String nombre) {
		  this.setNombreBanco(nombre);
	        cuentas = new HashSet<>();
	        transacciones = new ArrayList<>();
	    }

	  public boolean agregarCuenta(Cuenta cuenta) {
		  return cuentas.add((Cuenta)cuenta);
		}

    public void realizarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, Double monto) throws SaldoInsuficienteException, CuentaInexistenteException {
        if (!cuentas.contains(cuentaOrigen) || !cuentas.contains(cuentaDestino)) {
            throw new CuentaInexistenteException("Una de las cuentas no existe. No se puede realizar la transferencia.");
        }

        cuentaOrigen.transferirDinero(cuentaDestino, monto);

        Transaccion transaccion = new Transaccion(TipoDeTransaccion.TRANSFERENCIA, cuentaOrigen.getCBU(), cuentaDestino.getCBU(), monto);
        transacciones.add(transaccion);
    }

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}


}