package entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class piso extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					piso frame = new piso();
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
	public piso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDireccin = new JLabel("Dirección");
		lblDireccin.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblDireccin.setBounds(167, 96, 104, 14);
		contentPane.add(lblDireccin);
		
		JLabel numeroPiso = new JLabel("1");
		numeroPiso.setBounds(296, 62, 85, 14);
		contentPane.add(numeroPiso);
		
		JLabel direccion = new JLabel("-");
		direccion.setBounds(296, 96, 128, 14);
		contentPane.add(direccion);
		
		
		
		JButton boton4 = new JButton("4");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(numeroPiso.getText());
				if (pisoactual == 4)
					direccion.setText("Piso actual");
				else
					if (pisoactual<4)
						direccion.setText("Sube");
					else
						direccion.setText("Baja");
						
				numeroPiso.setText("4");
			}
		});
		boton4.setBounds(47, 58, 52, 23);
		contentPane.add(boton4);
		
		JLabel piso = new JLabel("Piso");
		piso.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		piso.setBounds(167, 62, 85, 14);
		contentPane.add(piso);
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(numeroPiso.getText());
				if (pisoactual == 3)
					direccion.setText("Piso actual");
				else
					if (pisoactual<3)
						direccion.setText("Sube");
					else
						direccion.setText("Baja");
						
				numeroPiso.setText("3");
			}
		});
		boton3.setBounds(47, 92, 52, 23);
		contentPane.add(boton3);
		
		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(numeroPiso.getText());
				
				if (pisoactual == 2)
					direccion.setText("Piso actual");
				else
					if (pisoactual<2)
						direccion.setText("Sube");
					else
						direccion.setText("Baja");
						
				
				
				numeroPiso.setText("2");
			}
		});
		boton2.setBounds(47, 126, 52, 23);
		contentPane.add(boton2);
		
		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(numeroPiso.getText());
				
				
				if(pisoactual>1)
					direccion.setText("Baja");
				
				else
					direccion.setText("Piso actual");
				numeroPiso.setText("1");
			}
		});
		boton1.setBounds(47, 160, 52, 23);
		contentPane.add(boton1);
		
		JButton boton5 = new JButton("5");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoactual = Integer.parseInt(numeroPiso.getText());
				if (pisoactual == 5)
					direccion.setText("Piso actual");
				else
					direccion.setText("Sube");
						
				numeroPiso.setText("5");
			}
		});
		boton5.setBounds(47, 24, 52, 23);
		contentPane.add(boton5);
		
		
		

	}
}
