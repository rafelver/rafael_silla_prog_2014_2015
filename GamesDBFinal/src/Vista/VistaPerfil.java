package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import Modelo.ModeloPerfil;

public class VistaPerfil extends JPanel {
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JComboBox comboBox;
	private JLabel lblAvatar;
	ModeloPerfil perfil;

	
	public VistaPerfil() {
		setLayout(null);
		
		lblNewLabel = new JLabel("Seleccionar Avatar");
		lblNewLabel.setBounds(207, 70, 138, 14);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\RAFAEL\\Desktop\\florida 2014\\programacion\\avatar.jpg"));
		lblNewLabel_1.setBounds(22, 48, 149, 173);
		add(lblNewLabel_1);
		
		btnNewButton = new JButton("Cambiar");
		btnNewButton.setBounds(208, 146, 89, 23);
		add(btnNewButton);
		
		perfil = new ModeloPerfil();
		
		comboBox = new JComboBox();
		comboBox.setBounds(208, 102, 82, 20);
		add(comboBox);
		for(int i=0;i<perfil.getNombre().length;i++){
		comboBox.addItem(perfil.getNombre()[i]);
		}
		
		JLabel lblAvatar = new JLabel("Avatar");
		lblAvatar.setBounds(68, 23, 46, 14);
		add(lblAvatar);

	}
}
