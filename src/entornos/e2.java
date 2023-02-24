package entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class e2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					e2 frame = new e2();
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
	public e2() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel precio = new JLabel("precio");
		precio.setFont(new Font("Tahoma", Font.BOLD, 11));
		precio.setBounds(369, 25, 75, 20);
		contentPane.add(precio);
		
		JLabel mensaje = new JLabel("Seleccione producto");
		mensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
		mensaje.setBounds(369, 57, 158, 20);
		contentPane.add(mensaje);
		
		
		
		//botones dinero
		
		
		JButton boton2 = new JButton("2€");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float saldo = Float.parseFloat(precio.getText());
				float resta = saldo - 2;
				
				String valor = String.valueOf(resta);
				precio.setText(valor);
				
				if (Float.parseFloat(valor) <0)
				{
					mensaje.setText("Se te devuelve " + (-resta) + " euros.");
				}
				else
				if (Float.parseFloat(valor) >0)
				{
					mensaje.setText("Faltan " + (resta) + " euros.");
				}
				else
					mensaje.setText("Recoja el producto");
				
			}
		});
		boton2.setBounds(494, 124, 62, 32);
		contentPane.add(boton2);
		
		
		
		JButton boton1 = new JButton("1€");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float saldo = Float.parseFloat(precio.getText());
				float resta = saldo - 1;
				
				String valor = String.valueOf(resta);
				precio.setText(valor);
				
				if (Float.parseFloat(valor) >0)
				{
					mensaje.setText("Se te devuelve " + (-resta) + " euros.");
				}
				else
				if (Float.parseFloat(valor) <0)
				{
					mensaje.setText("Faltan " + (resta) + " euros.");
				}
				else
					mensaje.setText("Recoja el producto");
			}
		});
		boton1.setBounds(494, 169, 62, 32);
		contentPane.add(boton1);
		
		
		
		JButton boton05 = new JButton("0.5€");
		boton05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double saldo = Double.parseDouble(precio.getText());
				double resta = saldo - (0.50);
				
				String valor = String.valueOf(resta);
				precio.setText(valor);
				
				if (Float.parseFloat(valor) >0)
				{
					mensaje.setText("Se te devuelve " + (-resta) + " euros.");
				}
				else
				if (Float.parseFloat(valor) <0)
				{
					mensaje.setText("Faltan " + (resta) + " euros.");
				}
				else
					mensaje.setText("Recoja el producto");
				
			}
		});
		boton05.setBounds(494, 212, 62, 32);
		contentPane.add(boton05);
		
		
		
		
		
		
		//botones productos		
		
		JButton cocacola = new JButton("New button");	//2€
		cocacola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				precio.setText("2");
				mensaje.setText("Cocacola");
				
			}
		});
		cocacola.setIcon(new ImageIcon("C:\\Users\\1º ASIR\\Downloads\\580b57fbd9996e24bc43c0eb (1).png"));
		cocacola.setBounds(172, 110, 122, 171);
		contentPane.add(cocacola);
		
		JButton fanta = new JButton("New button");		//1,50€
		fanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensaje.setText("Fanta");
				precio.setText("1.50");
			}
		});
		fanta.setIcon(new ImageIcon("C:\\Users\\1º ASIR\\Downloads\\fanta (1).png"));
		fanta.setBounds(30, 110, 122, 171);
		contentPane.add(fanta);
		
		JButton shake = new JButton("New button");
		shake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mensaje.setText("Shake");
				precio.setText("0.50");
			}
		});
		shake.setIcon(new ImageIcon("C:\\Users\\1º ASIR\\Downloads\\slider-colacao-shake (1).png"));
		shake.setBounds(312, 111, 132, 170);
		contentPane.add(shake);
		
	
		
		
		
		JLabel euro = new JLabel("€");
		euro.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 13));
		euro.setBounds(425, 24, 49, 20);
		contentPane.add(euro);
	}
}
