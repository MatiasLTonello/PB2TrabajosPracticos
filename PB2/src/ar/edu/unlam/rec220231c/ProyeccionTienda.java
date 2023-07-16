package ar.edu.unlam.rec220231c;


// Las peliculas se asignan dentro de las salas deProyeccion
//Las ventas se asiganas en las salas de tienda

public class ProyeccionTienda extends Sala implements IProyectable,iTienda{
	
	

	
	
	
	public ProyeccionTienda(String nombreSala, Sala salaTienda, Sala salaProyeccion) {
		super(nombreSala);
	}

	@Override
	public void registrarVenta(Venta venta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double obtenerTotalDeVenta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void asiganarPelicula(Pelicula pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pelicula obtenerPeliculaQueSeProyecta() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	

}
