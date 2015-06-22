package Modelo;


//clase que guardara los juegos
public class Juego {

	      //Atributos
	      int id=0;
	      private String nombre="";
	      private String genero="";
	      private String plataforma="";
	      private String descripcion="";
	      
	//constructor de Juego
	public Juego(int id,String nombre,String genero,String plataforma,String descripcion) {
		this.id=id;
		this.nombre=nombre;
		this.genero=genero;
		this.plataforma=plataforma;
		this.descripcion=descripcion;
		
	}
	//metodo para devolver el nombre
	public String getNombre(){
		return this.nombre;
	}
	//metodo para devolver el genero
	public String getGenero(){
		return this.genero;
	}
	//metodo para devolver la plataforma
	public String getPlataforma(){
		return this.plataforma;
	}
	//metodo que devuelve la Descripcion
	public String getDescripcion(){
		return this.descripcion;
	}
	//metodo que devolvera el nombre por metodo toString
	public String toString(){
		return this.nombre;
	}
}
