import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaConversor extends JFrame {

	private JPanel contentPane;
	private JTextField cajaEuros;
	private JTextField cajaDolares;
	//se crea una variable del tipo float para que desaparezca el error de la constante en jdk 1.7
	private float valorPaso;
	 
	
	
	public VentanaConversor( float valorConversion) {
		//a la variable anterior creada se le pasa valorConversion
		valorPaso=valorConversion;
		setTitle("Ventana Conversi\u00F3n Dolares");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 166);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(10, 11, 46, 14);
		contentPane.add(lblEuros);
		
		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setBounds(10, 59, 46, 14);
		contentPane.add(lblDolares);
		
		cajaEuros = new JTextField();
		cajaEuros.setBounds(10, 28, 86, 20);
		contentPane.add(cajaEuros);
		cajaEuros.setColumns(10);
		
		cajaDolares = new JTextField();
		cajaDolares.setColumns(10);
		cajaDolares.setBounds(10, 84, 86, 20);
		contentPane.add(cajaDolares);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			    
			   //se crea la variable euros y se guarda el contenido de la caja euros
			   float euros;
			   euros=Float.parseFloat(cajaEuros.getText());
			   //en la caja dolares se muestra el resultado de multiplicar los euros por el valor de conversion 
			   //en este caso sera valorPaso para que no de error y tengamos que poner un a constante
			   cajaDolares.setText(String.valueOf(euros*valorPaso));
			
				
			}
		});
		btnConvertir.setBounds(124, 83, 89, 23);
		contentPane.add(btnConvertir);
	}
}
