package proyectoPokedex;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class index extends JFrame {
	
	// panelImage panel = new panelImage();
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	
	 String NPKM;
	 String TPKM;
	 int RPKM;
	 int APKM;
	 int DPKM;
	 int AEPKM;
	 int DEPKM;
	
	
	/*
	pokemon poke = new pokemon (NPKM,TPKM,RPKM,APKM,DPKM,AEPKM,DEPKM);
	pkm.add(poke);
	*/
	
	
	
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 334);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		//boton para cambiar a la ventana de añadir nuevo pokemon
		JButton nuevo = new JButton("+");
		nuevo.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		nuevo.setBounds(502, 246, 52, 38);
		nuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadir abrir = new añadir();
				abrir.setVisible(true);
				setVisible(false);

				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(nuevo);
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	//arraylist
		ArrayList <String> imagenes = new ArrayList();
		ArrayList <pokemon> pkm = new ArrayList();
		
		
		
		
		JLabel titulo = new JLabel("·  P O K E D E X   R E G I O N A L   K A N T O  ·");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBackground(new Color(255, 255, 255)); //(Color.white);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		titulo.setBounds(10, 11, 544, 14);
		contentPane.add(titulo);
		
	//BOTÓN ACTUALIZAR
		JButton actualizarLista = new JButton("Actualizar");
		actualizarLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		actualizarLista.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		actualizarLista.setBounds(318, 246, 163, 38);
		contentPane.add(actualizarLista);
		
		JLabel NombrePKM = new JLabel("N");
		NombrePKM.setHorizontalAlignment(SwingConstants.CENTER);
		NombrePKM.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		NombrePKM.setBounds(21, 148, 235, 14);
		contentPane.add(NombrePKM);
		
		JLabel TipoPKM = new JLabel("N");
		TipoPKM.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		TipoPKM.setBounds(70, 173, 74, 14);
		contentPane.add(TipoPKM);
		
		JLabel RutaPKM = new JLabel("N");
		RutaPKM.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		RutaPKM.setBounds(218, 173, 52, 14);
		contentPane.add(RutaPKM);
		
		JLabel informacion = new JLabel("__________ ESTADÍSTICAS __________");
		informacion.setHorizontalAlignment(SwingConstants.CENTER);
		informacion.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		informacion.setBounds(10, 210, 260, 14);
		contentPane.add(informacion);
		
		JLabel AtaquePKM = new JLabel("N");
		AtaquePKM.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		AtaquePKM.setBounds(104, 235, 40, 14);
		contentPane.add(AtaquePKM);
		
		JLabel AtaqueEPKM = new JLabel("N");
		AtaqueEPKM.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		AtaqueEPKM.setBounds(104, 260, 40, 14);
		contentPane.add(AtaqueEPKM);
		
		JLabel DefensaPKM = new JLabel("N");
		DefensaPKM.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		DefensaPKM.setBounds(250, 235, 40, 14);
		contentPane.add(DefensaPKM);
		
		JLabel DefensaEPKM = new JLabel("N");
		DefensaEPKM.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		DefensaEPKM.setBounds(250, 260, 40, 14);
		contentPane.add(DefensaEPKM);
		
		JLabel info = new JLabel("Ataque:");
		info.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		info.setBounds(24, 235, 63, 14);
		contentPane.add(info);
		
		JLabel lblAtaqueE = new JLabel("Ataque E.:");
		lblAtaqueE.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblAtaqueE.setBounds(24, 260, 70, 14);
		contentPane.add(lblAtaqueE);
		
		JLabel lblDefensa = new JLabel("Defensa:");
		lblDefensa.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblDefensa.setBounds(161, 235, 63, 14);
		contentPane.add(lblDefensa);
		
		JLabel lblDefensaE = new JLabel("Defensa E.:");
		lblDefensaE.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblDefensaE.setBounds(161, 260, 79, 14);
		contentPane.add(lblDefensaE);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblTipo.setBounds(31, 173, 40, 14);
		contentPane.add(lblTipo);
		
		JLabel lblRuta = new JLabel("Ruta:");
		lblRuta.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblRuta.setBounds(172, 173, 52, 14);
		contentPane.add(lblRuta);
		
		JButton botonImagen = new JButton("???");
		botonImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == botonImagen) {
			        JFileChooser chooser = new JFileChooser();
			        chooser.showOpenDialog(null);
			        File file = chooser.getSelectedFile();
			        String filename = file.getAbsolutePath();
			        
					ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage());
			        botonImagen.setIcon(imageIcon);
			        imagenes.add(filename); //arraylist
			        
			        
			    }
			}
		});
		botonImagen.setForeground(new Color(128, 128, 128));
		botonImagen.setBounds(95, 57, 89, 80);
		contentPane.add(botonImagen);
		}
	
		
		public void recibir(String NPKM,String TPKM,int RPKM, int APKM,int AEPKM,int DPKM,int DEPKM)
		{
			
		}
}
