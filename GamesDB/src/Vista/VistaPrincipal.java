package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class VistaPrincipal extends JPanel {

	

	//creamos las variables privadas
	private JLabel lblAvatar,lblUsuario,lblContrasenya;
	private JComboBox comboBox; 
	private JTextField cajaContrasenya;
	private JButton btnJuegos,btnPerfil,btnLogin,btnRegistrarse;
	
	
	public VistaPrincipal() {
		//creamos el layout absoluto
				setLayout(null);
				
				//creamos las etiquetas
				lblAvatar = new JLabel("Avatar");
				lblAvatar.setBounds(10, 11, 171, 132);
				lblAvatar.setIcon(new ImageIcon("C:\\Users\\RAFAEL\\Desktop\\florida 2014\\programacion\\git2\\GamesDB\\src\\Imagenes\\avatar.jpg"));
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
	}

}
