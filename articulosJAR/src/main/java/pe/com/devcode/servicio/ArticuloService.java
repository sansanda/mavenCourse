package pe.com.devcode.servicio;

import java.util.ArrayList;
import java.util.List;
import pe.com.devcode.model.Articulo;

public class ArticuloService {
	
	public List<Articulo> listarArticulos()
	{
		List<Articulo> listaArticulos = new ArrayList<Articulo>();
		listaArticulos.add(new Articulo(1,"Pantalones","Pantalon1",35.0));
		listaArticulos.add(new Articulo(2,"Pantalones","Pantalon2",40.0));
		listaArticulos.add(new Articulo(3,"Pantalones","Pantalon3",45.0));
		
		return listaArticulos;
		
	}

}
