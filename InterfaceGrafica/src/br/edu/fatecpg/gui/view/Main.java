package br.edu.fatecpg.gui.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_num1;
	private JTextField txt_num2;
	private JTextField txt_nome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bem Vindo");
		lblNewLabel.setFont(new Font("Ani", Font.BOLD, 12));
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(500, 12, 74, 15);
		contentPane.add(lblNewLabel);
		
		txt_num1 = new JTextField();
		txt_num1.setBounds(282, 90, 114, 19);
		contentPane.add(txt_num1);
		txt_num1.setColumns(10);
		
		JButton btn_calc = new JButton("Calcular");
		btn_calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txt_num1.getText());
				int num2 = Integer.parseInt(txt_num2.getText());
				JOptionPane.showMessageDialog(btn_calc, num1+num2);
			}
		});
		btn_calc.setBounds(282, 154, 117, 25);
		contentPane.add(btn_calc);
		
		JLabel lblOrewiujo = new JLabel("Bem Vindo");
		lblOrewiujo.setBounds(26, 0, 335, 25);
		contentPane.add(lblOrewiujo);
		
		txt_num2 = new JTextField();
		txt_num2.setBounds(282, 39, 114, 19);
		contentPane.add(txt_num2);
		txt_num2.setColumns(10);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(45, 37, 114, 19);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);
		
		JButton btn_ola = new JButton("DIga Ola");
		btn_ola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txt_nome.getText();
				lblOrewiujo.setText("Bem vindo" + nome);
			}
		});
		btn_ola.setBounds(45, 154, 117, 25);
		contentPane.add(btn_ola);
		
		JLabel label = new JLabel("");
		label.setBounds(12, 12, 70, 15);
		contentPane.add(label);
	}
}
