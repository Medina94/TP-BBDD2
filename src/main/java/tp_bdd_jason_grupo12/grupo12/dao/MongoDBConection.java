package tp_bdd_jason_grupo12.grupo12.dao;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

import tp_bdd_jason_grupo12.grupo12.Cliente;

public class MongoDBConection{
	private DB dataBases;
	private DBCollection collectionDataBases;
	private BasicDBObject objectDB = new BasicDBObject();
	private Gson gson = new GsonBuilder().setPrettyPrinting().create();
	/**
	 * Conexion a mongoDB
	 * @return
	 */
	public MongoClient conectarMongoDB() {
		MongoClient mongoDB = null;
		try {
			mongoDB = new MongoClient("localhost", 27017);
		}catch (Exception e) {
			System.out.println("Error con conexion con MongoDB. Error: "+e.toString());
		}
		return mongoDB;
	}

	/**
	 * Constructor
	 */
	public MongoDBConection(String dataBases) {
		MongoClient mongoDB = conectarMongoDB();
		if(mongoDB != null) {
			this.dataBases = mongoDB.getDB(dataBases);
			//this.collectionDataBases = getDataBases().getCollection(collectionDB);
		}
	}
	public DB getDataBases() {
		return dataBases;
	}

	public void setDataBases(DB dataBases) {
		this.dataBases = dataBases;
	}

	public DBCollection getCollectionDataBases() {
		return collectionDataBases;
	}

	public void setCollectionDataBases(DBCollection collectionDataBases) {
		collectionDataBases = collectionDataBases;
	}

	public BasicDBObject getObjectDB() {
		return objectDB;
	}

	public void setObjectDB(BasicDBObject objectDB) {
		this.objectDB = objectDB;
	}
	
	@SuppressWarnings("deprecation")
	public boolean altaCliente(String collectionDB, Cliente cliente) {
		this.collectionDataBases = getDataBases().getCollection(collectionDB);
		objectDB = BasicDBObject.parse(gson.toJson(cliente));//(BasicDBObject) JSON.parse(gson.toJson(cliente));
		getCollectionDataBases().insert(objectDB);
		return true;
	}
	 
	public boolean altaJson() {
		// TODO Auto-generated method stub
		return false;
	}
	 
	public boolean altaSucursal() {
		// TODO Auto-generated method stub
		return false;
	}
	 
	public boolean altaMedicamento() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean altaVentas() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
