
public class ConversorDolares {

	public static void main(String[] args) {
		
		//se crea la variable valorConversion con valor = 1.25
		float valorConversion;		
		valorConversion=1.25f;
		//se llama al constructor de ventanaConversor y se le pasa el valor de valorConversion
		VentanaConversor frame = new VentanaConversor(valorConversion);
		frame.setVisible(true);

	}

}