
public class ConversorDolares {
      
	public static void main(String[] args) {
		//se crea la variable float con un valor de 1.25
		float valorConversion;
		valorConversion=1.25f;
		//se le pasa al constructor el valor de la variable valorConversion que es 1.25
		VentanaConversor frame = new VentanaConversor(valorConversion);
		frame.setVisible(true);

	}

} 
