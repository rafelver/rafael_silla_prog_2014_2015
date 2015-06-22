package Controlador;

import Modelo.ConexionDB;
import Modelo.ModeloJuegos;
import Modelo.ModeloUsuarios;
import Vista.VistaApp;

public class Controladora {

	//Instancia Unica  
	private static Controladora instance=null;
	
	//Atributos de la base dedatos
	ConexionDB UsuariosDB;
	ModeloUsuarios mUsuarios;
	
	//Ventana Principal
	VistaApp vapp;
	ModeloJuegos juegos=null;
	//creamos el objeto aut
	Autenticar aut = new Autenticar();
    private boolean auth=false;
	
	
	//constructor de la controladora
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
	
	
	//Implementar SingleTon instancia unica
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
	
	
	
	
	//Visualiza la ventana principal
	public void VisualizarPrincipal(){
		//llama al metodo que hay en la vapp
		vapp.VentanaPrincipal();
	}
	//se visualizan los juegos
	public void VisualizarJuegos(){
		//se crea la condicion para mostrar los juegos
		if(auth==true){
		//si juegos es nulo se crea el objeto
		if(juegos==null) juegos = new ModeloJuegos();
		//se elimina el mensaje de Vistaapp
		vapp.mostrarMensaje("");
		//se llama al mentodo que hay en Vapp y se le pasa los juegos
		vapp.VentanaJuegos(juegos.getJuegos());
		}else{
			//si no se cumple la condicion se muestra en Vapp el mensaje de usuario no logado
			vapp.mostrarMensaje("Usuario no logado");
		}
	}
	//se visualiza el Perfil
	public void VisualizarPerfil(){
		//se crea la condicion y si se cumple llama al metodo que hay en Vapp y elimina el mensaje
		if(auth==true){
		vapp.VentanaPerfil();
		vapp.mostrarMensaje("");
		}else{
			//se visualiza el mensaje  de no logado
			vapp.mostrarMensaje("Usuario no logado");
		}
	}
   //metodo para logar al usuario
	public void logar(){
		//se lama al metodo comprobar usuario y se Visualizan los juegos
		auth = aut.comprobarUser();
		this.VisualizarJuegos();
		
	}
}
