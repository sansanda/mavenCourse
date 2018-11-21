package pe.com.devcode.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Articulo {
	private int id;
	private String codigo;
	private String nombre;
	private double precio;
}
