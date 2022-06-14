package tp_bdd_jason_grupo12.grupo12;
import java.io.File;
import java.io.PrintWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.BasicDBObject;

public class Main {

	public static void main(String[] args) {
		
		//CREAMOS OBJETOS CON DATOS.
		Empleado empleado1 = new Empleado();
		Cliente cliente1 = new Cliente();
		Obrasocial os1 = new Obrasocial();
		Laboratorio lab1 = new Laboratorio();
		Producto prod1 = new Producto();
		
		empleado1.setIdEmpleado(1);
		empleado1.setNombre("Pablo212");
		empleado1.setApellido("Garcia");
		empleado1.setDni("39373690");
		empleado1.setIdDomicilio(1);
		empleado1.setIdObraSocial(1);
		
		cliente1.setIdCliente(1);
		cliente1.setNombre("Agustin");
		cliente1.setApellido("Corno");
		cliente1.setDni("38383838");
		cliente1.setIdDomicilio(333);
		cliente1.setIdObraSocial(2);
		
		os1.setIdObraSocial(1);
		os1.setNombre("Swiss Medical");
		os1.setNroAfiliado(1000);
		
		lab1.setIdLaboratorio(1);
		lab1.setNombre("Skarsgard");
		
		prod1.setIdProducto(1);
		prod1.setDescripcion("Paracetamol");
		prod1.setPrecio(2000);
		prod1.setIdLaboratorio(1);
		
		//CONVERTIR OBJETOS A JSON
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonStringEmpleado1 = gson.toJson(empleado1);
		String jsonStringCliente1 = gson.toJson(cliente1);
		String jsonStringOs1 = gson.toJson(os1);
		String jsonStringLab1 = gson.toJson(lab1);
		String jsonStringProd1 = gson.toJson(prod1);
		
		System.out.println(jsonStringEmpleado1);
		System.out.println(jsonStringCliente1);
		System.out.println(jsonStringOs1);
		System.out.println(jsonStringLab1);
		System.out.println(jsonStringProd1);
		System.out.println("*********");
		BasicDBObject db = BasicDBObject.parse(gson.toJson(empleado1));
		System.out.println(db.toString());
		//GUARDAR JSON
		try (PrintWriter pw = new PrintWriter(new File("grupo12.json"))) {
			pw.write(jsonStringEmpleado1);
			pw.write(jsonStringCliente1);
			pw.write(jsonStringOs1);
			pw.write(jsonStringLab1);
			pw.write(jsonStringProd1);
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
