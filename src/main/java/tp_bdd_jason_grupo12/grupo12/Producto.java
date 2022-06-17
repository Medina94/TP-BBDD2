package tp_bdd_jason_grupo12.grupo12;

public class Producto {
	
	//atributos
	private int idProducto;
	private String descripcion;
	private double precio;
	private Laboratorio laboratorio;
	
	//constructor
	public Producto(int idProducto, String descripcion, double precio, Laboratorio laboratorio) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.laboratorio = laboratorio;
	}
	
	public Producto() {
		super();
	}
	
	//getters and setters
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

}
