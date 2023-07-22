package ar.unlam.edu.ar;

public class TransporteMixto  extends MedioTransporte {
	public TransporteMixto(String patente, Integer cantidadPasajerosMaximos, Double cargaMaxima2) {
		super(patente);
		this.cantidadPasajerosMaximos = cantidadPasajerosMaximos;
		this.cargaMaxima = cargaMaxima2;
	}

	/*
	 * No se pueden agregar mas Atributos
	 */
	private Integer cantidadPasajerosMaximos;
	private Double cargaMaxima;
 

	public Integer getCantidadPasajerosMaximos() {
		return cantidadPasajerosMaximos;
	}

	public void setCantidadPasajerosMaximos(Integer cantidadPasajerosMaximos) {
		this.cantidadPasajerosMaximos = cantidadPasajerosMaximos;
	}

	public Double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(Double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}


	
	

}
