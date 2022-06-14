package tp_bdd_jason_grupo12.grupo12;

public class Obrasocial {

	//atributos
	private int idObraSocial;
	private String nombre;
	private int nroAfiliado;
	
	//constructor
	public Obrasocial(int idObraSocial, String nombre, int nroAfiliado) {
		super();
		this.idObraSocial = idObraSocial;
		this.nombre = nombre;
		this.nroAfiliado = nroAfiliado;
	}
	
	public Obrasocial() {
		super();
	}
	
	//getters and setters
	public int getIdObraSocial() {
		return idObraSocial;
	}
	public void setIdObraSocial(int idObraSocial) {
		this.idObraSocial = idObraSocial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNroAfiliado() {
		return nroAfiliado;
	}
	public void setNroAfiliado(int nroAfiliado) {
		this.nroAfiliado = nroAfiliado;
	}
	
	
	
	
}
