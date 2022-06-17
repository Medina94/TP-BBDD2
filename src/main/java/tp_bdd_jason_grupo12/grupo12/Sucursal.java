package tp_bdd_jason_grupo12.grupo12;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
	
	//atributos
	private int idSucursal;
	private Domicilio domicilio;
	private List<Empleado> empleados = new ArrayList<>();
	private List<Venta> ventas = new ArrayList<>();
	
	//constructor
	public Sucursal(int idSucursal, Domicilio domicilio, List<Empleado> empleados, List<Venta> ventas) {
		super();
		this.idSucursal = idSucursal;
		this.domicilio = domicilio;
		this.empleados = empleados;
		this.ventas = ventas;
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

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}
	

}
