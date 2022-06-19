package productos;

import java.util.Objects;

public class Producto implements Comparable<Producto>{
	//private static int identificador;
	
	// ATRIBUTOS
	
	private String nombre;
	private float precio;
	private int stock;
	private int id;
	
	// CONSTRUCTORES
	
	public Producto() {
		nombre = " ";
		precio = 0;
		stock = 0;
		id = 0;
		//identificador++;
	}
	
	public Producto(String nombre, float precio, int stock, int id) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.id = id;
		//identificador++;
	}
	
	// METODOS
	
	public String getNombre() {
		return nombre;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public int getId() {
		return id;
	}
	
	/*public static void setIdentificador(int identificador) {
		Producto.identificador = identificador;
	}*/
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void agregarStock(int stock) {
		this.stock = stock;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public int compareTo(Producto o) {

		if(precio == o.getPrecio()) {
			return 0;
		}
		else if(precio < o.getPrecio()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", id=" + id + "]";
	}

}
