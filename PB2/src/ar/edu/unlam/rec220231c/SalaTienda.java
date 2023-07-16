package ar.edu.unlam.rec220231c;

import java.util.*;

public class SalaTienda extends Sala implements iTienda {

	
	List<Venta> ventas;
	public SalaTienda(String nombre) {
		super(nombre);
		this.ventas = new ArrayList<Venta>();

	}
	
	@Override
	public void registrarVenta(Venta venta) {
		ventas.add(venta);
	}
	@Override
	public Double obtenerTotalDeVenta() {
		Double totalDeVentas = 0.00;
		for(Venta venta: ventas) {
			totalDeVentas += venta.getMonto();
		}
		return totalDeVentas;
	}

	public Integer getCantidadDeVentas() {
		return ventas.size();
	}
	
}
