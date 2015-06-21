

import Vista.VistaApp;
import Modelo.ConexionDB;


public class GamesDBApp {

	public static void main(String[] args) {
		
		//Nos conectamos a la base de Datos
		ConexionDB UsuariosDB;
		UsuariosDB=ConexionDB.getInstance("localhost","usuarios","root","");
		if (UsuariosDB.connectDB()==true){ 
			System.out.println("CONECTADOS CON EXITO");
			}
		   else System.out.println("ERROR EN LA CONEXION");
		
		//Visualizamos VistaApp
		VistaApp frame = new VistaApp();
		frame.setVisible(true);
	
	}
	
	}
	

		
