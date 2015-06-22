package Vista;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

import Modelo.Juego;
import Modelo.ModeloJuegos;
import java.awt.FlowLayout;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

//clase Vista juegos que hereda de JPanel
public class VistaJuegos extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNombre;
    private JLabel lblNewLabel_3;
    private JLabel label;
    
    private JComboBox comboBox;
    private JComboBox comboBox_1;
    
    private JButton btnEditar;
    private JButton btnNewButton;
    private JScrollPane scrollPane;
    private ModeloJuegos mjuegos;
    private DefaultListModel listModel;
    private JList list;
    private JScrollPane scrollPane_1;
    //Juego juego;
  
	//el constructor
	public VistaJuegos() {
		setLayout(null);
		
		//labels
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(22, 26, 46, 14);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("G\u00EBnero");
		lblNewLabel_1.setBounds(130, 26, 46, 14);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Plataforma");
		lblNewLabel_2.setBounds(262, 26, 111, 14);
		add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(22, 49, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(130, 49, 86, 20);
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(254, 49, 94, 20);
		add(comboBox_1);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(216, 97, 76, 14);
		add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(216, 112, 132, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("G\u00E9nero");
		lblNewLabel_3.setBounds(216, 143, 86, 20);
		add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setBounds(216, 162, 132, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		label = new JLabel("Plataforma");
		label.setBounds(216, 198, 111, 14);
		add(label);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setBounds(216, 213, 132, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(216, 243, 132, 20);
		add(btnEditar);
		
		btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(216, 274, 132, 20);
		add(btnNewButton);
		
		listModel = new DefaultListModel();
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent listSelectionEvent) {
				Juego juego=(Juego)listModel.getElementAt(list.getSelectedIndex());
				textField_1.setText(juego.getNombre());
				textField_2.setText(juego.getGenero());
				textField_3.setText(juego.getPlataforma());
			}
		});
		
		
		scrollPane_1 = new JScrollPane(list);
	
		
		JPanel panelJlist = new JPanel();
		panelJlist.setBounds(0, 80, 206, 209);
		add(panelJlist);
		panelJlist.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelJlist.add(scrollPane_1);
		

	}
	//metodo poner Juegos
	public void ponerJuegos(ArrayList juegos){
		Iterator<Juego> it = juegos.iterator();
		listModel.removeAllElements();
		while(it.hasNext()){
			Juego juego=(Juego)it.next();
		    listModel.addElement(juego);
		    
			
		}
		
	}
}
