package ar.edu.unlam;

public class Transaccion {
    private TipoDeTransaccion TIPO_DE_TRANSACCION;
    private String cuentaOrigen;
    private String cuentaDestino;
    private Double monto;

    public Transaccion(TipoDeTransaccion TIPO_DE_TRANSACCION, String cuentaOrigen, String cuentaDestino, Double monto) {
        this.TIPO_DE_TRANSACCION = TIPO_DE_TRANSACCION;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
    }

	public TipoDeTransaccion getTIPO_DE_TRANSACCION() {
		return TIPO_DE_TRANSACCION;
	}

	public void setTIPO_DE_TRANSACCION(TipoDeTransaccion tIPO_DE_TRANSACCION) {
		TIPO_DE_TRANSACCION = tIPO_DE_TRANSACCION;
	}

	public String getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

}
