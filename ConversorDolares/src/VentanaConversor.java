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
	 
	/*
       constructor Ventana Conversor al constructor se le pasa una constante no una variable ya que causa
       un error el eclipse, este error se elimina si se ejecutan las librerias jdk 1.8, entonces si que se puede pasar
       una variable de tipo float
       */
	
	public VentanaConversor( final float valorConversion) {
		
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
			   cajaDolares.setText(String.valueOf(euros*valorConversion));
			
				
			}
		});
		btnConvertir.setBounds(124, 83, 89, 23);
		contentPane.add(btnConvertir);
	}
}
