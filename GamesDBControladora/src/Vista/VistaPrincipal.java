package Vista;

import java.util.Iterator;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import Controlador.Controladora;
import Modelo.ModeloUsuarios;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Clase Vista Principal que hereda de JPanel
public class VistaPrincipal extends JPanel {

	

	//creamos las variables privadas labels, JcomboBox y Botones
	private JLabel lblAvatar,lblUsuario,lblContrasenya;
	private JComboBox comboBox; 
	private JTextField cajaContrasenya;
	private JButton btnJuegos,btnPerfil,btnLogin,btnRegistrarse;
	
	//creamos el mUsuarios para manejar el Objeto Modelos Usuarios que Gestiona la Conexion a la base de datos
	ModeloUsuarios mUsuarios;

	
	
	//Constructor de Vista Principal
	public VistaPrincipal() {
		//creamos el layout absoluto
				setLayout(null);
				
				//creamos las etiquetas
				lblAvatar = new JLabel("Avatar");
				lblAvatar.setBounds(10, 11, 171, 132);
				lblAvatar.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/Imagenes/avatar.jpg")));
				add(lblAvatar);
				
				lblUsuario = new JLabel("Usuario");
				lblUsuario.setBounds(10, 157, 46, 14);
				add(lblUsuario);
				
				lblContrasenya = new JLabel("Contrase\u00F1a");
				lblContrasenya.setBounds(10, 213, 148, 14);
				add(lblContrasenya);
				
				//creamos el JCOMBOBOX
				comboBox = new JComboBox();
				comboBox.setBounds(10, 182, 171, 20);
				add(comboBox);

				//creamos la Caja de Texto
				cajaContrasenya = new JTextField();
				cajaContrasenya.setBounds(10, 237, 171, 20);
				add(cajaContrasenya);
				cajaContrasenya.setColumns(10);
				
				//creamos los Botones
				btnJuegos = new JButton("Juegos >");
				btnJuegos.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//Llamamos a la controladora y Visualizamos los Juegos
						Controladora.getInstance().VisualizarJuegos();
					}
				});
				btnJuegos.setBounds(191, 11, 170, 23);
				add(btnJuegos);
				
				btnPerfil = new JButton("Perfil >");
				btnPerfil.setBounds(191, 45, 170, 23);
				add(btnPerfil);

				btnLogin = new JButton("Login");
				btnLogin.setBounds(10, 268, 171, 23);
				btnLogin.setEnabled(false);
				add(btnLogin);
				
				btnRegistrarse = new JButton("Registrarse");
				btnRegistrarse.setBounds(10, 308, 171, 23);
				btnRegistrarse.setEnabled(false);
				add(btnRegistrarse);
				
				//Conexion a la Base de Datos
				//Creamos el Objeto mUsuarios
					mUsuarios=new ModeloUsuarios();
				//creamos el Iterator it que sera de tipo String y accedemos al metodo get usuarios	
				Iterator<String> it = mUsuarios.getUsuarios().iterator();
				//Creamos la condicion para añadir los usuarios al comboBox
				while ( it.hasNext() ) {
                    //Añadimos al comboBox los usuarios
					comboBox.addItem((String)it.next());
						} 
			
	}
	
}
