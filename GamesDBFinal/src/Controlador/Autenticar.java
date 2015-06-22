package Controlador;

//clase que autentificara al usuario
public class Autenticar {
	
	//Atributo privado boolean isAuth que es falso
	private boolean isAuth=false;

	//Constructor 
	public Autenticar() {
		
	}
	
	//metodo el cual devolvera el valor del atributo 
	public boolean estaLogado(){
		return this.isAuth;
	}
	
	//metodo para comprobar el usuario y convierte el atributo en verdadero
	public boolean comprobarUser(){
		this.isAuth=true;
		
		return this.isAuth;
	}

}
