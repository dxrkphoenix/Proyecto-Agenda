package proyectoPokedex;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class añadir extends JFrame {

	private JPanel contentPane;
	private JTextField introducirNombre;
	private JTextField introducirTipo;
	private JTextField introducirRuta;
	

	String NPKM=" ";
	String TPKM=" ";
	public int RPKM=0;
	public int APKM=0;
	public int DPKM=0;
	public int AEPKM=0;
	public int DEPKM=0;
	index a = new index();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					añadir frame = new añadir();
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
	
	public añadir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 433);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		cancelar.setBounds(10, 261, 110, 23);
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index cerrar = new index();
				cerrar.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(cancelar);
		
		//TITULO
				JLabel titulo = new JLabel("·  P O K E D E X   R E G I O N A L   K A N T O  ·");
				titulo.setHorizontalAlignment(SwingConstants.CENTER);
				titulo.setBackground(new Color(0, 128, 0));
				titulo.setFont(new Font("Tahoma", Font.BOLD, 11));
				titulo.setBounds(10, 14, 544, 14);
				contentPane.add(titulo);
				
				
				JLabel nombrePKM = new JLabel("NOMBRE:");
				nombrePKM.setFont(new Font("Consolas", Font.BOLD, 17));
				nombrePKM.setBounds(31, 82, 75, 23);
				contentPane.add(nombrePKM);
				
				JLabel tipoPKM = new JLabel("TIPO:");
				tipoPKM.setFont(new Font("Consolas", Font.BOLD, 17));
				tipoPKM.setBounds(31, 116, 75, 23);
				contentPane.add(tipoPKM);
				
				JLabel rutaPKM = new JLabel("RUTA:");
				rutaPKM.setFont(new Font("Consolas", Font.BOLD, 17));
				rutaPKM.setBounds(31, 150, 75, 23);
				contentPane.add(rutaPKM);
				
				introducirNombre = new JTextField();
				introducirNombre.setBounds(102, 82, 97, 20);
				contentPane.add(introducirNombre);
				introducirNombre.setColumns(10);
				
				introducirTipo = new JTextField();
				introducirTipo.setColumns(10);
				introducirTipo.setBounds(102, 116, 97, 20);
				contentPane.add(introducirTipo);
				
				introducirRuta = new JTextField();
				introducirRuta.setColumns(10);
				introducirRuta.setBounds(102, 150, 97, 20);
				contentPane.add(introducirRuta);
				
				JLabel IAtaque = new JLabel("Ataque:");
				IAtaque.setHorizontalAlignment(SwingConstants.TRAILING);
				IAtaque.setFont(new Font("Consolas", Font.BOLD, 17));
				IAtaque.setBounds(257, 169, 75, 23);
				contentPane.add(IAtaque);
				
				JLabel lAtaqueE = new JLabel("Ataque E.:");
				lAtaqueE.setHorizontalAlignment(SwingConstants.TRAILING);
				lAtaqueE.setFont(new Font("Consolas", Font.BOLD, 17));
				lAtaqueE.setBounds(222, 203, 110, 23);
				contentPane.add(lAtaqueE);
				
				JLabel IDefensa = new JLabel("Defensa:");
				IDefensa.setHorizontalAlignment(SwingConstants.TRAILING);
				IDefensa.setFont(new Font("Consolas", Font.BOLD, 17));
				IDefensa.setBounds(433, 169, 75, 23);
				contentPane.add(IDefensa);
				
				JLabel lDefensaE = new JLabel("Defensa E.:");
				lDefensaE.setHorizontalAlignment(SwingConstants.TRAILING);
				lDefensaE.setFont(new Font("Consolas", Font.BOLD, 17));
				lDefensaE.setBounds(398, 203, 110, 23);
				contentPane.add(lDefensaE);
				
				
				JTextField ata = new JTextField();
				ata.setBounds(342, 169, 63, 23);
				contentPane.add(ata);
				
				
				JTextField ataE = new JTextField();
				ataE.setBounds(342, 203, 63, 23);
				contentPane.add(ataE);
				
				JTextField def = new JTextField();
				def.setBounds(518, 169, 63, 23);
				contentPane.add(def);
				
				JTextField defE = new JTextField();
				defE.setBounds(518, 203, 63, 23);
				contentPane.add(defE);
				
				
				
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				
				
				/*
				JButton confirmar = new JButton("Confirmar");
				confirmar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
				confirmar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						//NO SE COMO SE PASAN LOS PTOS DATOS XD
						
						NPKM = introducirNombre.getText();
						TPKM = introducirRuta.getText();
						RPKM = Integer.parseInt(introducirRuta.getText());
						
						APKM = Integer.parseInt(ata.getText());  //ATAQUE
						AEPKM = Integer.parseInt(ataE.getText()); //ATAQUE ESPECIAL
						DPKM = Integer.parseInt(def.getText()); //DEFENSA
						DEPKM = Integer.parseInt(defE.getText()); //DEFENSA ESPECIAL
						
						a.recibir(APKM, DEPKM, AEPKM, DPKM, DEPKM);
						
						index cerrar = new index();
						cerrar.setVisible(true);
						setVisible(false);
					}
					
				});
				confirmar.setBounds(444, 261, 110, 23);
				contentPane.add(confirmar);
				*/
				JButton guardar = new JButton("Guardar");
				guardar.addMouseListener(new MouseAdapter() {
					
					public void mouseClicked(MouseEvent e) {
						index a = new index();
						a.setVisible(true);
						setVisible(false);
						NPKM = introducirNombre.getText();
						TPKM = introducirRuta.getText();
						RPKM = Integer.parseInt(introducirRuta.getText());
						APKM = Integer.parseInt(ata.getText());  //ATAQUE
						AEPKM = Integer.parseInt(ataE.getText()); //ATAQUE ESPECIAL
						DPKM = Integer.parseInt(def.getText()); //DEFENSA
						DEPKM = Integer.parseInt(defE.getText()); //DEFENSA ESPECIAL
						
					
						a.recibir(NPKM,TPKM,RPKM,APKM, AEPKM, DPKM, DEPKM);
					}
				});
				guardar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
				guardar.setBounds(444, 262, 110, 23);
				contentPane.add(guardar);
				
				
	}
}
