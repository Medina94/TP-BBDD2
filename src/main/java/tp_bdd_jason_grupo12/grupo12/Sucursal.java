package tp_bdd_jason_grupo12.grupo12;

import java.util.List;

public class Sucursal {
	
	//atributos
	private int idSucursal;
	private Domicilio domicilio;
	private List<Empleado> empleados;
	private List<Venta> ventas;
	
	//*********************
	private int idDomicilio;
	private int idEmpleado;
	
	//constructor
	public Sucursal(int idSucursal, int idDomicilio, int idEmpleado) {
		super();
		this.idSucursal = idSucursal;
		this.idDomicilio = idDomicilio;
		this.idEmpleado = idEmpleado;
	}
	
	public Sucursal() {
		super();
	}
	
	//getters and setters
	public int getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	

}
