package Vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.CardLayout;
import javax.swing.JMenuItem;
import Controlador.Controladora;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Creamos la Clase que Hereda de JFrame
public class VistaApp extends JFrame {
	    
	//creamos las variables privadas 
		private JMenuBar menuBar;
		private JMenu mnMenuPrincipal,mnMenuJuegos,mnMenuPerfil;
		private JMenuItem mntmPrincipal,mntmListaDeJuegos,mntmPerfil;
		private JPanel contentPane,Ventanas;
		
		//creamos la variable privada Vprincipal Y Vjuegos
		private VistaPrincipal vprincipal;
		private VistaJuegos vjuegos;

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
		//Accion del Menu Item
		mntmPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Llamamos a la controladora y al metodo que hay en la controladora para visualizar la Ventana Principal
				Controladora.getInstance().VisualizarPrincipal();
			}
		});
		mnMenuPrincipal.add(mntmPrincipal);
		//Menu Item Lista Juegos
		mntmListaDeJuegos = new JMenuItem("Lista  Juegos");
		//Accion del menuItem Lista JUegos
		mntmListaDeJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//LLamamos a la controladora y al metodo que hay en la controladora para Visualizar la Vista de Juegos
				Controladora.getInstance().VisualizarJuegos();
			}
		});
		mnMenuJuegos.add(mntmListaDeJuegos);
		
		//MenuItem Perfil
		mntmPerfil = new JMenuItem("Perfil");
		mnMenuPerfil.add(mntmPerfil);
		
		//creamos el contenedor principal que es de borderlayout
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		//creamos el contenedor Ventanas que es el CardLayout
		Ventanas = new JPanel();
		contentPane.add(Ventanas, BorderLayout.CENTER);
		Ventanas.setLayout(new CardLayout(0, 0));
		
		//se crea el objeto vprincipal que sera de tipo Jpanel
		vprincipal=new VistaPrincipal();
		//se crea el objeto vjuegos que sera de tipo JPanel
		vjuegos=new VistaJuegos();
		
		//se añaden a ventanas las diferentes ventanas
		Ventanas.add(vprincipal, "VentanaPrincipal");
		Ventanas.add(vjuegos,"VentanaJuegos");
		

}

	/*se crea el metodo Ventana Principal el cual manejara el cardLayout para visualizar Ventana Principal
	 * y la controladora tendra un metodo el que llamara a este metodo para visualizar la Ventana Principal
	 */
public void VentanaPrincipal(){
	CardLayout c= (CardLayout) Ventanas.getLayout();
	c.show(Ventanas, "VentanaPrincipal");
	}
/*se crea el metodo Ventana Juegos el cual manejara el cardLayout para visualizar Ventana Juegos
 * y la controladora tendra un metodo el que llamara a este metodo para visualizar la Ventana Principal
 */
public void VentanaJuegos(){
	CardLayout c= (CardLayout) Ventanas.getLayout();
	c.show(Ventanas, "VentanaJuegos");
}
}
