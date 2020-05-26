package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;

public class SuppliersFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SuppliersFrame frame = new SuppliersFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SuppliersFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 197, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(7, 195, 180, 53);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(7, 69, 180, 53);
		panel.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(7, 133, 180, 53);
		panel.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(288, 151, 352, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(288, 245, 352, 205);
		
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Suppliers");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(404, 45, 84, 22);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(669, 156, 197, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Related suppliers");
		lblNewLabel_1.setBounds(292, 220, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Search suppliers");
		lblNewLabel_1_1.setBounds(288, 131, 114, 14);
		contentPane.add(lblNewLabel_1_1);
		
	}
}
