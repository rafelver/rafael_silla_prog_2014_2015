package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModeloUsuarios {
	
	//Devolver Usuarios
		private final static String USUARIOS_LIST="SELECT * FROM usuarios";
		
		//Se crea los atributos
		private final static String USUARIO_COL="usuario";
		
		
		//Conexion
		private Connection conexion = null;//Maneja la conexion
		private Statement instruccion = null; // instrucción de consulta
		private ResultSet conjuntoResultados = null; // maneja los resultados
		private ArrayList <String> usuarios = null;
		
		//Constructor del Modelo Usuarios
		public ModeloUsuarios(){
			conexion=ConexionDB.getConexion();
			usuarios = new ArrayList<String>();
		}
		
		
		//Metodo por el cual se devuelve una array con el nombre de los usuarios
		public ArrayList getUsuarios(){
			try{
			instruccion = this.conexion.createStatement();
			// consulta la base de datos
			 conjuntoResultados = instruccion.executeQuery(USUARIOS_LIST);
			 
			 //Listaremos por pantalla los datos
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
					conexion.close();
				}
				catch ( SQLException excepcionSql )
		        {
			         excepcionSql.printStackTrace();
			         
			     } 
			}
			 return usuarios;
		}
	
}
