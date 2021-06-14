package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadoraT extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JTextField caja;
	
	double primero;
	double segundo;
	String ope;
	boolean b = false;
	
	public String sc(double a){
		String rt ="";
		rt = Double.toString(a);
		if(a%1==0) {
			rt = rt.substring(0, rt.length()-2);
		}
		return rt;
	}
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadoraT frame = new calculadoraT();
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
	
	public calculadoraT() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 341, 430);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caja.setText(null);
				b = false;
			}
		});
		btnNewButton.setBounds(10, 111, 68, 45);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(250, 128, 114));
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("x\u00B2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==true) {
					primero = Double.parseDouble(caja.getText());
					caja.setText(sc(primero*primero));
				}
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 18));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(SystemColor.menu);
		btnNewButton_1.setBounds(88, 111, 68, 45);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Mod");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==true) {
					primero = Double.parseDouble(caja.getText());
					caja.setText("");
					ope = "Mod";
				}
			}
		});
		btnNewButton_2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 12));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(SystemColor.menu);
		btnNewButton_2.setBounds(166, 111, 68, 45);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("\u00F7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==true) {
					primero = Double.parseDouble(caja.getText());
					caja.setText("");
					ope = "/";
				}	
			}
		});
		btnNewButton_3.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 22));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(SystemColor.menu);
		btnNewButton_3.setBounds(244, 111, 68, 45);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_4.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(SystemColor.menu);
		btnNewButton_4.setBounds(10, 167, 68, 45);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_5.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(SystemColor.menu);
		btnNewButton_5.setBounds(88, 167, 68, 45);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("9");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_6.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_6.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(SystemColor.menu);
		btnNewButton_6.setBounds(166, 167, 68, 45);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("\u00D7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==true) {
					primero = Double.parseDouble(caja.getText());
					caja.setText("");
					ope = "*";
				}
			}
		});
		btnNewButton_7.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 22));
		btnNewButton_7.setBorder(null);
		btnNewButton_7.setBackground(SystemColor.menu);
		btnNewButton_7.setBounds(244, 167, 68, 45);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_8.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_8.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_8.setBorder(null);
		btnNewButton_8.setBackground(SystemColor.menu);
		btnNewButton_8.setBounds(10, 223, 68, 45);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("5");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_9.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_9.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBackground(SystemColor.menu);
		btnNewButton_9.setBounds(88, 223, 68, 45);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_10.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_10.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_10.setBorder(null);
		btnNewButton_10.setBackground(SystemColor.menu);
		btnNewButton_10.setBounds(166, 223, 68, 45);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==true){
					primero = Double.parseDouble(caja.getText());
					caja.setText("");
					ope = "-";
				}	
			}
		});
		btnNewButton_11.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 22));
		btnNewButton_11.setBorder(null);
		btnNewButton_11.setBackground(SystemColor.menu);
		btnNewButton_11.setBounds(244, 223, 68, 45);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("1");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_12.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_12.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_12.setBorder(null);
		btnNewButton_12.setBackground(SystemColor.menu);
		btnNewButton_12.setBounds(11, 279, 68, 45);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("2");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_13.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_13.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_13.setBorder(null);
		btnNewButton_13.setBackground(SystemColor.menu);
		btnNewButton_13.setBounds(89, 279, 68, 45);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("3");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_14.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_14.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_14.setBorder(null);
		btnNewButton_14.setBackground(SystemColor.menu);
		btnNewButton_14.setBounds(167, 279, 68, 45);
		contentPane.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("+");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==true) {
					primero = Double.parseDouble(caja.getText());
					caja.setText("");
					ope = "+";
				}	
			}
		});
		btnNewButton_15.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 22));
		btnNewButton_15.setBorder(null);
		btnNewButton_15.setBackground(SystemColor.menu);
		btnNewButton_15.setBounds(245, 279, 68, 45);
		contentPane.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("0");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = caja.getText()+btnNewButton_16.getText();
				caja.setText(EnterNumber );
				b = true;
			}
		});
		btnNewButton_16.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_16.setBorder(null);
		btnNewButton_16.setBackground(SystemColor.menu);
		btnNewButton_16.setBounds(11, 335, 145, 45);
		contentPane.add(btnNewButton_16);
		
		btnNewButton_18 = new JButton(".");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==false) {
					if(!(caja.getText().contains("."))) {
						caja.setText(caja.getText()+"0.");
					}
				}else {
					if(!(caja.getText().contains("."))) {
						caja.setText(caja.getText()+".");
					}
				}
			}
		});
		btnNewButton_18.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 21));
		btnNewButton_18.setBorder(null);
		btnNewButton_18.setBackground(SystemColor.menu);
		btnNewButton_18.setBounds(167, 335, 68, 45);
		contentPane.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("=");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b==true) {
					segundo = Double.parseDouble(caja.getText());
					if (ope == "+") {
						caja.setText(sc(primero+segundo));
					}else if(ope == "-"){
						caja.setText(sc(primero-segundo));
					}else if(ope == "*"){
						caja.setText(sc(primero*segundo));
					}else if(ope == "/"){
						if(segundo == 0) {
							caja.setText("No se puede dividir");
						}else {
							caja.setText(sc(primero/segundo));
						}		
					}else if(ope == "Mod"){
						caja.setText(sc(primero%segundo));
					}
				}		
			}
		});
		btnNewButton_19.setForeground(new Color(0, 0, 0));
		btnNewButton_19.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 22));
		btnNewButton_19.setBorder(null);
		btnNewButton_19.setBackground(new Color(250, 128, 114));
		btnNewButton_19.setBounds(245, 335, 68, 45);
		contentPane.add(btnNewButton_19);
		
		caja = new JTextField();
		caja.setBackground(SystemColor.controlHighlight);
		caja.setBorder(null);
		caja.setHorizontalAlignment(SwingConstants.RIGHT);
		caja.setFont(new Font("Arial", Font.PLAIN, 20));
		caja.setBounds(10, 38, 302, 62);
		contentPane.add(caja);
		caja.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(10, 13, 160, 14);
		contentPane.add(lblNewLabel);
		
	}
}
