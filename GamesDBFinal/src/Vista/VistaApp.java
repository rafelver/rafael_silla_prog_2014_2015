package Vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JMenuItem;
import Controlador.Controladora;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JTextField;

//se crea la clase Vista app que hereda de JFrame
public class VistaApp extends JFrame {
	    //creamos las variables privadas 
		private JMenuBar menuBar;
		private JMenu mnMenuPrincipal,mnMenuJuegos,mnMenuPerfil;
		private JMenuItem mntmPrincipal,mntmListaDeJuegos,mntmPerfil;
		private JPanel contentPane,Ventanas;
		
		//creamos la variable privada Vprincipal,VistaJuegos, y VistaPerfil
		private VistaPrincipal vprincipal;
		private VistaJuegos vjuegos;
		private VistaPerfil vperfil;
		private JTextField textField;
	
		

		

		//creamos el constructor de VistaApp
	public VistaApp() {
		CerrarAplicacion();
		setBounds(100, 100, 398, 430);
		
		//Creamos el menu principal
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//Creamos los Submenus Principal,Juegos,Perfil
		mnMenuPrincipal = new JMenu("Principal");
		menuBar.add(mnMenuPrincipal);
		
		mnMenuJuegos = new JMenu("Juegos");
		menuBar.add(mnMenuJuegos);
		
		mnMenuPerfil = new JMenu("Perfil");
		menuBar.add(mnMenuPerfil);
		
		//creamos los items de Principal,Lista Juegos,Perfil
		mntmPrincipal = new JMenuItem("Principal");
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//llamamos a la controladora y al metodo VisualizarPrincipal
				Controladora.getInstance().VisualizarPrincipal();
				
			}
		});
		mnMenuPrincipal.add(mntmPrincipal);
		
		mntmListaDeJuegos = new JMenuItem("Lista  Juegos");
		mntmListaDeJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//llamamos a la controladora y al metodo VisualizarJuegos
				Controladora.getInstance().VisualizarJuegos();
			}
		});
		mnMenuJuegos.add(mntmListaDeJuegos);
		
		mntmPerfil = new JMenuItem("Perfil");
		mntmPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//llamamos a la controladora y al metodo VisualizarPerfil
				Controladora.getInstance().VisualizarPerfil();
			}
		});
		mnMenuPerfil.add(mntmPerfil);
		
		//creamos el contenedor principal que es de borderlayout
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//creamos el contenedor Ventanas
		Ventanas = new JPanel();
		contentPane.add(Ventanas, BorderLayout.CENTER);
		Ventanas.setLayout(new CardLayout(0, 0));
		
		//se crea el objeto vprincipal que sera de tipo Jpanel
		vprincipal=new VistaPrincipal();
		//se crea el objeto vjuegos que sera de tipo Jpanel
		vjuegos=new VistaJuegos();
		//se crea el objeto vperfil que sera de tipo Jpanel
		vperfil=new VistaPerfil();
		
		//se añaden a ventanas las diferentes ventanas
		Ventanas.add(vprincipal, "VentanaPrincipal");
		Ventanas.add(vjuegos,"VentanaJuegos");
		Ventanas.add(vperfil,"VentanaPerfil");
		
		textField = new JTextField();
		textField.setEditable(false);
		contentPane.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		
}

	//se crea el metodo ventana Principal
public void VentanaPrincipal(){
	CardLayout c= (CardLayout) Ventanas.getLayout();
	c.show(Ventanas, "VentanaPrincipal");
	}
//se crea el metodo ventana Juegos
public void VentanaJuegos(ArrayList juegos){
	vjuegos.ponerJuegos(juegos);
	CardLayout c= (CardLayout) Ventanas.getLayout();
	c.show(Ventanas, "VentanaJuegos");
}
//se crea el metodo ventana Perfil
public void VentanaPerfil(){
	CardLayout c= (CardLayout) Ventanas.getLayout();
	c.show(Ventanas, "VentanaPerfil");
	}
//se crea el metodo para mostrar el mensaje
public  void mostrarMensaje(String mensaje){
      this.textField.setText(mensaje);
}


//metodo para cerrar aplicacion
public void CerrarAplicacion(){
	try {
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				confirmarSalida();
		
			}
		});
		
	} catch (Exception e){
		e.printStackTrace();
	}
}

//metodo confirmar salida
public void confirmarSalida(){
	int opcion = JOptionPane.showConfirmDialog(this, "¿Esta Seguro de Cerrar la Aplicación?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
	if(opcion==JOptionPane.YES_OPTION){
		JOptionPane.showMessageDialog(null, "Gracias Por Utilizar GAMESDB","Gracias",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}if(opcion==JOptionPane.NO_OPTION){
     setVisible(true);     
	}
}


}
