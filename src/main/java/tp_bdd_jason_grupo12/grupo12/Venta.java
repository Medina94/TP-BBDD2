package tp_bdd_jason_grupo12.grupo12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {

	// atributos
	private int idVenta;
	private int nroTicket;
	private Sucursal sucursal;
	private Empleado empleado;
	private List<Producto> productos = new ArrayList<>();
	private LocalDate fecha;
	private double total;

	// constructor
	public Venta(int idVenta, int nroTicket, double total, Empleado empleado, List<Producto> productos, Sucursal sucursal, LocalDate fecha) {
		super();
		this.idVenta = idVenta;
		this.nroTicket = nroTicket;
		this.total = total;
		this.sucursal = sucursal;
		this.empleado = empleado;
		this.productos = productos;
		this.fecha = fecha;
	}

	public Venta() {
		super();
	}

	// getters and setters
	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public int getNroTicket() {
		return nroTicket;
	}

	public void setNroTicket(int nroTicket) {
		this.nroTicket = nroTicket;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
}
