package pe.com.devcode.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Articulo {
	
	private @NonNull int id;
	private @NonNull String codigo;
	private @NonNull String nombre;
	private @NonNull double precio;
	
}
