package ar.edu.unlam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UsuarioFinal extends Usuario{
	
	private List<Figurita> stockDeFiguritas;
	private HashSet<Figurita> albumDeFiguritas;
	    
	public UsuarioFinal(String nombreDeUsuario) {
		super(nombreDeUsuario);
		stockDeFiguritas = new ArrayList<>();
		albumDeFiguritas = new HashSet<>();
	}

	@Override
	public Boolean agregarFigurita(Figurita figurita) {
		return stockDeFiguritas.add(figurita);
	}
	
	public Integer getCantidadDeStockDeFiguritas() {
		return this.stockDeFiguritas.size();
	}
	
	public Boolean pegarFigurita(Figurita figurita) {
        if (albumDeFiguritas.contains(figurita)) {
        	return false;
        }
       return albumDeFiguritas.add(figurita);
    }

}
