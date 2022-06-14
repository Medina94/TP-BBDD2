package tp_bdd_jason_grupo12.grupo12;

import java.time.LocalDate;
import java.util.List;

public class Venta {
	
	//atributos
	private int idVenta;
	private int nroTicket;
	private Empleado empleado;
	private List<Producto> productos;
	private LocalDate fecha;
	//*******************
	private double total;
	private int idEmpleado;
	private int idSucursal;
	
	//constructor
	public Venta(int idVenta, int nroTicket, double total, int idEmpleado, int idSucursal) {
		super();
		this.idVenta = idVenta;
		this.nroTicket = nroTicket;
		this.total = total;
		this.idEmpleado = idEmpleado;
		this.idSucursal = idSucursal;
	}
	
	public Venta() {
		super();
	}
	
	//getters and setters
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
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public int getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	
	

}
