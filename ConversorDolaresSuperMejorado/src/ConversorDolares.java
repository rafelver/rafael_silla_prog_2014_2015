
public class ConversorDolares {

	public static void main(String[] args) {
		
		//se crea la variable valorConversion como un array de 3 elementos
		float valorConversion[]=new float[3];		
		valorConversion[0]=0.80f;
		valorConversion[1]=1.5f;
		valorConversion[2]=2.1f;
		//se llama al constructor de ventanaConversor y se le pasa el valor de valorConversion
		VentanaConversor frame = new VentanaConversor(valorConversion);
		frame.setVisible(true);

	}

}