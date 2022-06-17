package tp_bdd_jason_grupo12.grupo12;

public class Empleado {
	
	//atributos
	private int idEmpleado;
	private String nombre;
	private String apellido;
	private String dni;
	private Domicilio domicilio;
	private	Obrasocial obraSocial;
	
	//constructor
	public Empleado(int idEmpleado, String nombre, String apellido, String dni, Domicilio domicilio, Obrasocial obraSocial) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.obraSocial = obraSocial;
	}
	
	public Empleado() {
		super();
	}

	//getters and setters
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Obrasocial getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(Obrasocial obraSocial) {
		this.obraSocial = obraSocial;
	}
	
}
