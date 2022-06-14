package tp_bdd_jason_grupo12.grupo12.test;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

import tp_bdd_jason_grupo12.grupo12.Cliente;
import tp_bdd_jason_grupo12.grupo12.Domicilio;
import tp_bdd_jason_grupo12.grupo12.Obrasocial;
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
		Cliente cliente = new Cliente();
		cliente.setApellido("Medina");
		cliente.setNombre("Renata");
		cliente.setDni("59261061");
		cliente.setIdCliente(3);
		cliente.setDomicilio(d);
		cliente.setObraSocial(o);
		//dbmon.altaCliente("clientes", cliente);
		
		DBCursor cur = col.find();
		while (cur.hasNext()) {
			System.out.println(cur.next());
			//System.out.println(cur.next().toString());
		}
	}
}
