package tp_bdd_jason_grupo12.grupo12;

public class ProductoVenta {
	
	//atributos
	private int idProducto;
	private int idVenta;
	private int cantidad;
	private int precioTotal;
	
	//constructor
	public ProductoVenta(int idProducto, int idVenta, int cantidad, int precioTotal) {
		super();
		this.idProducto = idProducto;
		this.idVenta = idVenta;
		this.cantidad = cantidad;
		this.precioTotal = precioTotal;
	}
	
	public ProductoVenta() {
		super();
	}
	
	//getters and setters
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	

}
