package tp_bdd_jason_grupo12.grupo12;

public class Domicilio {
	
	//atributos
	private int idDomicilio;
	private String numero;
	private String provincia;
	private String calle;
	private String localidad;
	
	//constructor
	public Domicilio(int idDomicilio, String numero, String provincia, String calle, String localidad) {
		super();
		this.idDomicilio = idDomicilio;
		this.numero = numero;
		this.provincia = provincia;
		this.calle = calle;
		this.localidad = localidad;
	}
	
	public Domicilio() {
		super();
	}
	
	//getters and setters
	public int getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(int idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	

}
