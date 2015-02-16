
public class Datos {

	//se crean las Constantes
	final static float valorDolar=0.80f;
	final static float valorLibra=1.5f;
	final static float valorYen=2.1f;
	final static float valorEuro=1f;
	final static String dolares="Dolares";
	final static String libras="Libras";
	final static String euros="Euros";
	final static String yen="Yen";
	
	//se guardan las constantes en las arrays
	private String nombreDivisa[]={dolares,libras,euros,yen};
	private float valorDivisa[]={valorDolar,valorLibra,valorEuro,valorYen};
	
	//este es el constructor datos
	public Datos() {
		
		}
	
	//se crea 
	public String[] getNombreDivisa(){
		return this.nombreDivisa;
	}
	
	public float[] getValorDivisa(){
		return this.valorDivisa;
	}
	
	}
	
	
	
	

