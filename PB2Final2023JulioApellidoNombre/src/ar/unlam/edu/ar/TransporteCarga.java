package ar.unlam.edu.ar;

public class TransporteCarga extends MedioTransporte {
	
	private Double cargaMaxima;

	public TransporteCarga(String patente, Double cargaMaxima) {
		super(patente);
		this.setCargaMaxima(cargaMaxima);
	}

	public Double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

}
