package tp_bdd_jason_grupo12.grupo12;

public class Laboratorio {
	
	//atributos
	private int idLaboratorio;
	private String nombre;
	
	//constructor
	public Laboratorio(int idLaboratorio, String nombre) {
		super();
		this.idLaboratorio = idLaboratorio;
		this.nombre = nombre;
	}
	
	public Laboratorio() {
		super();
	}
	
	//getters and setters
	public int getIdLaboratorio() {
		return idLaboratorio;
	}
	public void setIdLaboratorio(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
