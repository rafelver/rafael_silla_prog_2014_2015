package Controlador;


import Modelo.ConexionDB;
import Vista.VistaApp;

public class Controladora {

	//Instancia Unica  
	private static Controladora instance=null;
	
	//Atributos de la base de datos
	ConexionDB UsuariosDB;
	
	
	//Ventana Principal
	private VistaApp vapp;
	
	
	public Controladora() {
		//nos conectamos a la base de datos
		UsuariosDB=ConexionDB.getInstance("localhost","usuarios","root","");
		if (UsuariosDB.connectDB()==true){ 
			System.out.println("CONECTADOS CON EXITO");
			}else {
				System.out.println("ERROR EN LA CONEXION");
			}
		//visualizamos la ventana principal
		this.Visualizar();
	} 
	
	
	//Implementar SingleTon
	public static Controladora getInstance() {
	      if(instance == null) {
	         instance = new Controladora();
	      }
	      return instance;
	}
	
	//Se lanza la vista principal
	public void Visualizar(){
		//Lanzamos ventana principal
		vapp = new VistaApp();
		//Visualizamos la vista principal
		vapp.setVisible(true);
	}
	
	//metodo para visualizar la ventana principal el cual llamara al metodo que hay en VistaApp
	public void VisualizarPrincipal(){
		vapp.VentanaPrincipal();
	}
	
	//metodo para visualizar la ventana Juegos el cual llamara al metodo que hay en VistaApp
	public void VisualizarJuegos(){
		vapp.VentanaJuegos();
	}

	
}
