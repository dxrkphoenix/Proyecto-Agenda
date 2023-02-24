package entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ampliacion23 extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField telefono;
	private JTextField correo;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ampliacion23 frame = new ampliacion23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ampliacion23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TITULO = new JLabel("NUEVO USUARIO");
		TITULO.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		TITULO.setBounds(150, 11, 188, 37);
		contentPane.add(TITULO);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(44, 68, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña:");
		lblNewLabel_1.setBounds(44, 103, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Idioma:");
		lblNewLabel_2.setBounds(44, 143, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Correo electrónico: ");
		lblNewLabel_3.setBounds(44, 190, 103, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Teléfono:");
		lblNewLabel_4.setBounds(44, 231, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Comunicación:");
		lblNewLabel_5.setBounds(44, 271, 94, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Observaciones:");
		lblNewLabel_6.setBounds(44, 346, 94, 14);
		contentPane.add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(139, 346, 268, 56);
		contentPane.add(textArea);
		
		nombre = new JTextField();
		nombre.setBounds(149, 65, 105, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		telefono = new JTextField();
		telefono.setBounds(150, 228, 104, 20);
		contentPane.add(telefono);
		telefono.setColumns(10);
		
		correo = new JTextField();
		correo.setBounds(150, 187, 188, 20);
		contentPane.add(correo);
		correo.setColumns(10);
		
		JRadioButton elegirtel = new JRadioButton("Teléfono");
		elegirtel.setBounds(150, 267, 109, 23);
		contentPane.add(elegirtel);
		
		JRadioButton elegircorreo = new JRadioButton("Correo electrónico");
		elegircorreo.setBounds(150, 297, 148, 23);
		contentPane.add(elegircorreo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "English", "Deutch"}));
		comboBox.setBounds(150, 139, 109, 22);
		contentPane.add(comboBox);
		
		password = new JPasswordField();
		password.setBounds(150, 100, 105, 20);
		contentPane.add(password);
		
		
		//agrupa botones de selección.
		ButtonGroup group = new ButtonGroup();
		group.add(elegirtel);
		group.add(elegircorreo);
		
		
		
		//botones de interacción
		JButton guardar = new JButton("Guardar");
		guardar.setBounds(65, 432, 120, 23);
		contentPane.add(guardar);
		
		JButton borrar = new JButton("Borrar datos");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nombre.setText("");
				password.setText("");
				correo.setText("");
				telefono.setText("");
				textArea.setText("");
				
			}
		});
		borrar.setBounds(288, 432, 120, 23);
		contentPane.add(borrar);
		
	}
}
