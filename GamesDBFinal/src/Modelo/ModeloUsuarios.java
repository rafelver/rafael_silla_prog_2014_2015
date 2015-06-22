package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloUsuarios {
	
	   //Devolver Usuarios
		private final static String USUARIOS_LIST="SELECT * FROM usuarios";
		
		//Devolver Usuarios
		private final static String USUARIO_COL="usuario";
		
		
		//Conexion
		private Connection conexion = null;//Maneja la conexion
		private Statement instruccion = null; // instrucción de consulta
		private ResultSet conjuntoResultados = null; // maneja los resultados
		private ArrayList <String> usuarios = null; //maneja los usuarios
		
		public ModeloUsuarios(){
			//creamos la conexion
			conexion=ConexionDB.getConexion();
			//creamos el objeto usuarios que es un arraylist de strings
			usuarios = new ArrayList<String>();
		}
		
		
		//metodo por el cual devolvera un arraylist
		public ArrayList getUsuarios(){
			
			try{
			instruccion = this.conexion.createStatement();
			// consulta la base de datos
			 conjuntoResultados = instruccion.executeQuery(USUARIOS_LIST);
			 
			//guardamos los usuarios
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
			 return usuarios;
		}
		
	

	
}
