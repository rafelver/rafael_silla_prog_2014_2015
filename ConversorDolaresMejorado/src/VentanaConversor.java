import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class VentanaConversor extends JFrame {

	//se crea las variables privadas
	private JPanel contentPane;
	private JTextField cajaEuros;
	private JTextField cajaDolares;
	private JTextField cajaMensaje;

	//este es el constructor de la ventana
	public VentanaConversor(float valorConversion) {
		setResizable(false);
		setTitle("Ventana Conversi\u00F3n Dolares");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//se crean los Jlabel
		JLabel lbltexto = new JLabel("INTRODUCIR UN VALOR EN EUROS ENTRE 0 Y 500 \u20AC");
		lbltexto.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lbltexto.setBounds(10, 11, 308, 14);
		contentPane.add(lbltexto);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEuros.setBounds(10, 34, 46, 14);
		contentPane.add(lblEuros);
		
		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDolares.setBounds(10, 89, 46, 14);
		contentPane.add(lblDolares);
		
		JLabel lblMensaje = new JLabel("Mensaje De Control");
		lblMensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMensaje.setBounds(10, 157, 337, 14);
		contentPane.add(lblMensaje);
		
		//se crean las cajas de texto
		cajaEuros = new JTextField();
		cajaEuros.setBounds(10, 59, 86, 20);
		contentPane.add(cajaEuros);
		cajaEuros.setColumns(10);
				
		cajaDolares = new JTextField();
		cajaDolares.setBounds(10, 114, 86, 20);
		contentPane.add(cajaDolares);
		cajaDolares.setColumns(10);
		
		cajaMensaje = new JTextField();
		cajaMensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
		cajaMensaje.setForeground(Color.RED);
		cajaMensaje.setEditable(false);
		cajaMensaje.setBounds(10, 189, 337, 20);
		contentPane.add(cajaMensaje);
		cajaMensaje.setColumns(10);
		
		//se crea el boton convertir
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(128, 113, 89, 23);
		contentPane.add(btnConvertir);
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//aqui es donde empieza la Excepcion
				try {
				     //se crea la variable float que es local al boton
					  float euros;
					  //se le pasa a la variable euros el contenido de cajaEuros
				      euros=Float.parseFloat(cajaEuros.getText());
				      //aqui empieza la condicion que tiene que ser mayor o igual a 0 y menor o igual a 500
				      if(euros>=0 && euros<=500){
				    	  //si es verdadera la condicion se multiplica euros por valor Conversion y se saca el mensaje
					      cajaDolares.setText(String.valueOf(euros*valorConversion));
					      cajaMensaje.setText("TODO OK");
					      //si es falsa la condicion se saca el mensaje
				      }else{
					      cajaMensaje.setText("LOS EUROS TIENEN QUE ESTAR ENTRE 0 Y 500 €");
				   }
				//aqui se muestra el mensaje si se pone un valor no valido
				}catch (Exception e1){
					cajaMensaje.setText("Se ha producido un Error en la conversión");
				}
				
			}
		});
		
		
		
		
		
	}
}
