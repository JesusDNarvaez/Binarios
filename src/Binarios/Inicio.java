package Binarios;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField C1Octal;
	private JTextField CbResultado;
	private JTextField C1Hexa;
	private JTextField CFinalHexa;
	private JTextField C1Decimal;
	private JTextField CfinalDecimal;
	public Inicio() {
		
		
		
		setTitle("Conversion de bases numericas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(7, 7, 7, 7));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 340, 311);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel PanelMenu = new JPanel();
		panel.add(PanelMenu, "name_102827719054000");
		PanelMenu.setLayout(null);
		
		JButton HBbtn = new JButton("HEXADECIMAL");
		HBbtn.setBounds(35, 106, 121, 28);
		HBbtn.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 11));
		PanelMenu.add(HBbtn);
		
		JButton DaBbtn = new JButton("DECIMAL");
		DaBbtn.setBounds(35, 145, 121, 28);
		DaBbtn.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 11));
		PanelMenu.add(DaBbtn);
		
		JButton OaBbtn = new JButton("OCTAL");
		OaBbtn.setBounds(35, 184, 121, 28);
		OaBbtn.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 11));
		PanelMenu.add(OaBbtn);
		
		JLabel lblNewLabel = new JLabel("BASES NUMERICAS ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(35, 24, 143, 23);
		lblNewLabel.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		PanelMenu.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A BINARIO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(131, 42, 82, 23);
		lblNewLabel_1.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		PanelMenu.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(210, 57, 130, 134);
		PanelMenu.add(lblNewLabel_2);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(191, 0, 182, 255);
		PanelMenu.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/R.jpg")));
		lblNewLabel_9.setBounds(0, 0, 340, 255);
		PanelMenu.add(lblNewLabel_9);
		
		JPanel PanelDecimal = new JPanel();
		panel.add(PanelDecimal, "name_102846457552300");
		PanelDecimal.setLayout(null);
		
		JLabel lblDecimalABinario = new JLabel(" Conversion de Decimal a binario");
		lblDecimalABinario.setForeground(Color.WHITE);
		lblDecimalABinario.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		lblDecimalABinario.setBounds(90, 22, 164, 23);
		PanelDecimal.add(lblDecimalABinario);
		
		C1Decimal = new JTextField();
		C1Decimal.setBounds(121, 85, 86, 20);
		PanelDecimal.add(C1Decimal);
		C1Decimal.setColumns(10);
		
		CfinalDecimal = new JTextField();
		CfinalDecimal.setBounds(121, 135, 86, 20);
		PanelDecimal.add(CfinalDecimal);
		CfinalDecimal.setColumns(10);
		
		JButton btnCalDB = new JButton("Calcular");
		btnCalDB.setFont(new Font("Perpetua", Font.PLAIN, 11));
		btnCalDB.setBounds(110, 189, 108, 23);
		PanelDecimal.add(btnCalDB);
		
		JLabel lblNewLabel_7 = new JLabel("DECIMAL");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
		lblNewLabel_7.setBounds(134, 71, 65, 14);
		PanelDecimal.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("BINARIO");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
		lblNewLabel_8.setBounds(134, 123, 55, 14);
		PanelDecimal.add(lblNewLabel_8);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(100, 54, 136, 124);
		PanelDecimal.add(lblNewLabel_12);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/OIP.jpg")));
		btnNewButton.setBounds(275, 202, 55, 41);
		PanelDecimal.add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/R.jpg")));
		lblNewLabel_11.setBounds(0, 0, 340, 253);
		PanelDecimal.add(lblNewLabel_11);
		
		JPanel PanelHD = new JPanel();
		panel.add(PanelHD, "name_102867730365300");
		PanelHD.setLayout(null);
		
		JLabel lblHexadecimalABinario = new JLabel("Conversion de Hexadecimal a binario");
		lblHexadecimalABinario.setForeground(Color.WHITE);
		lblHexadecimalABinario.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		lblHexadecimalABinario.setBounds(66, 23, 198, 23);
		PanelHD.add(lblHexadecimalABinario);
		
		C1Hexa = new JTextField();
		C1Hexa.setBounds(118, 78, 86, 20);
		PanelHD.add(C1Hexa);
		C1Hexa.setColumns(10);
		
		CFinalHexa = new JTextField();
		CFinalHexa.setBounds(118, 134, 86, 20);
		PanelHD.add(CFinalHexa);
		CFinalHexa.setColumns(10);
		
		JButton btnCalHB = new JButton("CALCULAR");
		btnCalHB.setFont(new Font("Perpetua", Font.PLAIN, 11));
		btnCalHB.setBounds(118, 193, 100, 23);
		PanelHD.add(btnCalHB);
		
		JLabel lblNewLabel_5 = new JLabel("BINARIO");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
		lblNewLabel_5.setBounds(128, 119, 58, 14);
		PanelHD.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("HEXADECIMAL");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
		lblNewLabel_6.setBounds(118, 65, 89, 14);
		PanelHD.add(lblNewLabel_6);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(95, 49, 128, 128);
		PanelHD.add(lblNewLabel_14);
		
		JButton btnRegreso_1 = new JButton("");
		btnRegreso_1.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/OIP.jpg")));
		btnRegreso_1.setForeground(Color.WHITE);
		btnRegreso_1.setBackground(Color.WHITE);
		btnRegreso_1.setBounds(275, 216, 55, 35);
		PanelHD.add(btnRegreso_1);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/R.jpg")));
		lblNewLabel_13.setBounds(0, 0, 340, 256);
		PanelHD.add(lblNewLabel_13);
		
		JPanel PanelOctal = new JPanel();
		panel.add(PanelOctal, "name_120377585612400");
		PanelOctal.setLayout(null);
		
		JLabel lblOctalABinario = new JLabel("Conversion de Octal a binario");
		lblOctalABinario.setForeground(Color.WHITE);
		lblOctalABinario.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		lblOctalABinario.setBounds(107, 23, 145, 23);
		PanelOctal.add(lblOctalABinario);
		
		C1Octal = new JTextField();
		C1Octal.setBounds(133, 77, 86, 20);
		PanelOctal.add(C1Octal);
		C1Octal.setColumns(10);
		
		CbResultado = new JTextField();
		CbResultado.setBounds(133, 129, 86, 20);
		PanelOctal.add(CbResultado);
		CbResultado.setColumns(10);
		
		JButton btnCalOB = new JButton("CALCULAR");
		btnCalOB.setFont(new Font("Perpetua", Font.PLAIN, 11));
		btnCalOB.setBounds(130, 178, 89, 23);
		PanelOctal.add(btnCalOB);
		
		JLabel lblNewLabel_3 = new JLabel("OCTAL");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
		lblNewLabel_3.setBounds(152, 57, 46, 14);
		PanelOctal.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BINARIO");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Perpetua Titling MT", Font.BOLD, 11));
		lblNewLabel_4.setBounds(152, 108, 55, 14);
		PanelOctal.add(lblNewLabel_4);
		
		JButton btnRegreso = new JButton("");
		btnRegreso.setForeground(Color.WHITE);
		btnRegreso.setBackground(Color.WHITE);
		btnRegreso.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/OIP.jpg")));
		btnRegreso.setBounds(275, 216, 55, 35);
		PanelOctal.add(btnRegreso);
		
		
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon(Inicio.class.getResource("/Imagenes/R.jpg")));
		lblNewLabel_15.setBounds(0, 0, 340, 258);
		PanelOctal.add(lblNewLabel_15);
		
		
		HBbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(false);
				PanelHD.setVisible(true);
				PanelOctal.setVisible(false);
				PanelDecimal.setVisible(false);
			}
		});
		
		DaBbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(false);
				PanelHD.setVisible(false);
				PanelOctal.setVisible(false);
				PanelDecimal.setVisible(true);
				
			}
		});
		
		OaBbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(false);
				PanelHD.setVisible(false);
				PanelOctal.setVisible(true);
				PanelDecimal.setVisible(false);
				
			}
		});
		
		//////////////Regreso/////////////////////
		btnRegreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(true);
				PanelHD.setVisible(false);
				PanelOctal.setVisible(false);
				PanelDecimal.setVisible(false);
				
			}
		});
		
		btnRegreso_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(true);
				PanelHD.setVisible(false);
				PanelOctal.setVisible(false);
				PanelDecimal.setVisible(false);
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PanelMenu.setVisible(true);
				PanelHD.setVisible(false);
				PanelOctal.setVisible(false);
				PanelDecimal.setVisible(false);
				
			}
		});
		
		///////////////////Calculos////////////////////////////////////
		
		btnCalDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(C1Decimal.getText());
				DecimalB op = new DecimalB();
				op.opDB(a);
				CfinalDecimal.setText(String.valueOf(op.getresultado()));
				
			}
		}); 
		
		btnCalHB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a = (C1Hexa.getText());
				HexadecimalB op = new HexadecimalB();
				op.opDHD(a);
				CFinalHexa.setText(String.valueOf(op.getresultado()));
				
			}
		});
		
		btnCalOB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double a = Double.parseDouble(C1Octal.getText());
				OctalB op = new OctalB();
				op.opDO(a);
				CbResultado.setText(String.valueOf(op.getresultado()));
				
				
			}
		});
		
		
	}
	
}
