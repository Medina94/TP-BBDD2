package tp_bdd_jason_grupo12.grupo12;

public class Empleado {
	
	//atributos
	private int idEmpleado;
	private String nombre;
	private String apellido;
	private String dni;
	private int idDomicilio;
	private int idObraSocial;
	
	//constructor
	public Empleado(int idEmpleado, String nombre, String apellido, String dni, int idDomicilio, int idObraSocial) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.idDomicilio = idDomicilio;
		this.idObraSocial = idObraSocial;
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

	public int getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public int getIdObraSocial() {
		return idObraSocial;
	}

	public void setIdObraSocial(int idObraSocial) {
		this.idObraSocial = idObraSocial;
	}
	

}
