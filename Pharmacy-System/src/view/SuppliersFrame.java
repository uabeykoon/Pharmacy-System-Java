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
import java.util.ArrayList;

import javax.swing.JComboBox;

public class SuppliersFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private ArrayList<String> menuItems= new ArrayList<>();
	private String[] mItemStrings = new String[menuItems.size()];

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
		
		JButton btnNewButton = new JButton("Add New Supplier");
		btnNewButton.setBounds(7, 69, 180, 53);
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(288, 151, 370, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(288, 245, 370, 205);
		
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Suppliers");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(404, 45, 84, 22);
		contentPane.add(lblNewLabel);
		
//dropdown list initialization		
		addItemsToMenu();
		JComboBox comboBox = new JComboBox(menuItems.toArray(mItemStrings));
		comboBox.setBounds(669, 151, 197, 33);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Related suppliers");
		lblNewLabel_1.setBounds(292, 220, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Search suppliers");
		lblNewLabel_1_1.setBounds(288, 131, 114, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("View Supplier");
		btnNewButton_2.setBounds(288, 474, 180, 53);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Edit Supplier");
		btnNewButton_1.setBounds(478, 474, 180, 53);
		contentPane.add(btnNewButton_1);
		
	}
	
//add item to array list to display 	
	public void addItemsToMenu(){
		this.menuItems.add("By Name");
		this.menuItems.add("By TP Number");
	}
		
	
}
