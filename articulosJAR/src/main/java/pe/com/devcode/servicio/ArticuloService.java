package pe.com.devcode.servicio;

import java.util.ArrayList;
import java.util.List;
import pe.com.devcode.model.Articulo;

public class ArticuloService {
	
	public List<Articulo> listarArticulos()
	{
		List<Articulo> listaArticulos = new ArrayList<Articulo>();
		Articulo articulo = new Articulo(1,"","",35.0);
		return listaArticulos;
	}

}
