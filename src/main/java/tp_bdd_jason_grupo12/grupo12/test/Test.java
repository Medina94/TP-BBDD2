package tp_bdd_jason_grupo12.grupo12.test;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import tp_bdd_jason_grupo12.grupo12.Cliente;
import tp_bdd_jason_grupo12.grupo12.Domicilio;
import tp_bdd_jason_grupo12.grupo12.Empleado;
import tp_bdd_jason_grupo12.grupo12.Obrasocial;
import tp_bdd_jason_grupo12.grupo12.Sucursal;
import tp_bdd_jason_grupo12.grupo12.dao.MongoDBConection;

public class Test {
	public static void main(String[] args) {
		MongoDBConection dbmon = new MongoDBConection("bbdd2");
		DBCollection col = dbmon.getDataBases().getCollection("clientes");
		
		//Domicilio
		Domicilio d = new Domicilio();
		d.setCalle("Vidal");
		d.setIdDomicilio(5);
		d.setLocalidad("Mte Grande");
		d.setNumero("2074");
		d.setProvincia("Cordoba");
		//Obra Social
		Obrasocial o = new Obrasocial();
		o.setIdObraSocial(3);
		o.setNombre("GALENO");
		o.setNroAfiliado(101012);
		//Cliente
		Empleado emp = new Empleado(1, "Cristian", "Medina", "38549121", d, o);
		Empleado emp2 = new Empleado(1, "Micaela", "Perez", "40186614", d, o);
		Empleado emp3 = new Empleado(1, "Renata", "Medina", "59271616", d, o);
		
		//dbmon.altaCliente("clientes", cliente);
		
		DBCursor cur = col.find();
		while (cur.hasNext()) {
			System.out.println(cur.next());
			//System.out.println(cur.next().toString());
		}
	}
	
//	Sucursal s1 = new Sucursal(1, d, empleados, ventas);
}
