package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloUsuarios {
	
	    //Creamos el acceso al la tabla usuarios
		private final static String USUARIOS_LIST="SELECT * FROM usuarios";
		
		//creamos el acceso a la columna del nombre del usuario
		private final static String USUARIO_COL="usuario";
		
		
		//Conexion
		private Connection conexion = null;//Maneja la conexion
		private Statement instruccion = null; // instrucción de consulta
		private ResultSet conjuntoResultados = null; // maneja los resultados
		
		//creamos el arrayList de usuarios el cual almacenara el nombre de los usuarios
		private ArrayList <String> usuarios = null;
		
		//Constructor del modelo usuarios
		public ModeloUsuarios(){
			//establecemos la conexion con la base de datos
			conexion=ConexionDB.getConexion();
			//creamos el Objeto usuarios que sera una arraylist de Strings
			usuarios = new ArrayList<String>();
		}
		
		
		public ArrayList getUsuarios(){
			
			try{
			 //Creamos la consulta a la base de datos
			 instruccion = this.conexion.createStatement();
			 conjuntoResultados = instruccion.executeQuery(USUARIOS_LIST);
			 
			//Añadimos a la ArrayList la columna del Nombre Usuarios
			 while(conjuntoResultados.next() ){
				 usuarios.add(conjuntoResultados.getString(USUARIO_COL));
			 }
			 
			}
			catch ( SQLException excepcionSql )
	        {
		         excepcionSql.printStackTrace();
		        
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
			//Devolvemos la ArrayList usuarios
			 return usuarios;
		}
		
	

	
}
