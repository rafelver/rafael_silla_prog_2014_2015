package Vista;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;

import javax.swing.JMenuItem;

        //Clase VistaApp
public class VistaApp extends JFrame {
	    //creamos las variables privadas 
		private JMenuBar menuBar;
		private JMenu mnMenuPrincipal,mnMenuJuegos,mnMenuPerfil;
		private JMenuItem mntmPrincipal,mntmListaDeJuegos,mntmPerfil;
		private JPanel contentPane,Ventanas;
		
		//creamos la variable privada Vprincipal
		private VistaPrincipal vprincipal;
		

		

		//creamos el constructor de VistaApp
	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		mnMenuPrincipal.add(mntmPrincipal);
		
		mntmListaDeJuegos = new JMenuItem("Lista  Juegos");
		mnMenuJuegos.add(mntmListaDeJuegos);
		
		mntmPerfil = new JMenuItem("Perfil");
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
		
		//se añaden a ventanas las diferentes ventanas
		Ventanas.add(vprincipal, "VentanaPrincipal");
		
		

}
}
