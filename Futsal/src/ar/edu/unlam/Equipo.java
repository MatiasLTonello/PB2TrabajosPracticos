package ar.edu.unlam;

public class Equipo {

	  private Jugador[] jugadores ;
	  private String nombreDelEquipo;
	  private Double valorDelEquipo;
	  private Integer cantidadDeJugadores;
	  
	  public Equipo(String nombreDelEquipo) {
		  this.nombreDelEquipo = nombreDelEquipo;
		  this.jugadores = new Jugador[25];
		  this.valorDelEquipo = 0.00;
		  this.cantidadDeJugadores= 0;
	  }

	public Boolean agregarJugador(Jugador jugador) {
		  Boolean seAgrego = false;
		        for (int i = 0; i < jugadores.length; i++) {
		            if (jugadores[i] == null) {
		                jugadores[i] = jugador;
		                seAgrego = true;
		               cantidadDeJugadores++;
		               break;
		            }
		        }
		    return seAgrego;
		}

	public String getNombreDelEquipo() {
		return nombreDelEquipo;
	}
	
	 public Integer getCantidadDeJugadoresRegistrados() {
		    return cantidadDeJugadores; // devolver el contador en lugar de jugadores.length
		  }


	public void setNombreDelEquipo(String nombreDelEquipo) {
		this.nombreDelEquipo = nombreDelEquipo;
	}
	
	

	public Double getValorDelEquipo() {
	    Double valorDelEquipo = 0.00;
	    for(int i = 0; i < cantidadDeJugadores; i++) {
	       valorDelEquipo += jugadores[i].getPrecioDelJugador();
	       }
	    return valorDelEquipo;
	}
	
	public void setValorDelEquipo(Double valorDelEquipo) {
		this.valorDelEquipo = valorDelEquipo;
	}

	public Double obtenerEdadPromedio() {
		Double edadPromedio = 0.00;
		for(int i = 0; i< cantidadDeJugadores; i++) {
			edadPromedio += jugadores[i].getEdad();
		}
		
		return edadPromedio / cantidadDeJugadores;
	}

}
