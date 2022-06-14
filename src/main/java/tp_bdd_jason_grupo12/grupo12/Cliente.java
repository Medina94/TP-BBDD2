package tp_bdd_jason_grupo12.grupo12;

public class Cliente {
	
	//atributos
	private int idCliente;
	private String nombre;
	private String apellido;
	private String dni;
	private Obrasocial obraSocial;
	private Domicilio domicilio;
	//***************
	private int idDomicilio;
	private int idObraSocial;
	
	//constructor
	public Cliente(int idCliente, String nombre, String apellido, String dni, int idDomicilio, int idObraSocial) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.idDomicilio = idDomicilio;
		this.idObraSocial = idObraSocial;
	}
	
	public Cliente() {
		super();
	}
	
	//getters and setters
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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

	public Obrasocial getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(Obrasocial obraSocial) {
		this.obraSocial = obraSocial;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	

}
