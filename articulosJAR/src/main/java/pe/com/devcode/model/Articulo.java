package pe.com.devcode.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor

public class Articulo {
	
	private int id;
	private String codigo;
	private String nombre;
	private double precio;
	
}
