package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ModeloJuegos {

	      //Se selecciona la tabla juegos
			private final static String JUEGOS_LIST="SELECT * FROM juegos";
			//se selecciona las filas de la tabla juegos
			private final static String ID_COL="id";
			private final static String NOMBRE_COL="nombre";
		    private final static String GENERO_COL="genero";
			private final static String PLATA_COL="plataforma";
			private final static String DESCRI_COL="descripcion";
			
			//Conexion
			private Connection conexion = null;//Maneja la conexion
			private Statement instruccion = null; // instrucción de consulta
			private ResultSet conjuntoResultados = null; // maneja los resultados
			
			//se crea el arraylist de juego y se indica que es nulo
			private ArrayList <Juego> juegos = null;
	
			//constructor
	public ModeloJuegos() {
		//se maneja la conexion
		conexion=ConexionDB.getConexion();
		//se crea el objeto arraylist
		juegos = new ArrayList<Juego>();
	}
	
	
	//metodo que devuelve una arraylist
	public ArrayList getJuegos(){
		
		try{
		instruccion = this.conexion.createStatement();
		// consulta la base de datos
		 conjuntoResultados = instruccion.executeQuery(JUEGOS_LIST);
		 juegos.clear();
		 //añadimos al arraylist las columnas de la tabla juegos pero hacemos con el objeto juego
		 while(conjuntoResultados.next() ){
			  Juego juego=new Juego(conjuntoResultados.getInt(ID_COL),
					               conjuntoResultados.getString(NOMBRE_COL),
					               conjuntoResultados.getString(GENERO_COL),
					               conjuntoResultados.getString(PLATA_COL),
					               conjuntoResultados.getString(DESCRI_COL));
			 juegos.add(juego);
			 
			
		 }
		 return juegos;
		}
		catch ( SQLException excepcionSql )
        {
	         excepcionSql.printStackTrace();
	         return juegos;
	     } 
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();
		
			}
			catch ( SQLException excepcionSql )
	        {
		         excepcionSql.printStackTrace();
		         
		     } 
		}
		
	}

}
