package pe.com.devcode.servicio;

import java.util.ArrayList;
import java.util.List;

import pe.com.devcode.models.Articulo;

public class ArticuloService {
	public List<Articulo> listarArticulos(){
		List<Articulo> listaArticulos = new ArrayList<Articulo>();
		listaArticulos.add(new Articulo(1,"PA","Pantalon1",35.0));
		listaArticulos.add(new Articulo(2,"CA","Camisa1",56.0));
		listaArticulos.add(new Articulo(3,"PA","Pantalon2",100.0));
		
		return listaArticulos;
	}
}
