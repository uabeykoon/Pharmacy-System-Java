package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;

import javax.sound.midi.VoiceStatus;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;

public class SuppliersFrame extends JFrame {

	private JPanel contentPane;
	private ArrayList<String> menuItems= new ArrayList<>();
	private String[] mItemStrings = new String[menuItems.size()];
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
		
		JButton btnNewButton = new JButton("Add New Supplier");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSupplierFrame frame = new AddSupplierFrame();
				//onClickAddSupplier();
			}
		});
		btnNewButton.setBounds(10, 137, 180, 53);
		panel.add(btnNewButton);
		
//dropdown list initialization		
		addItemsToMenu();
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		contentPane.add(layeredPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(201, 0, 685, 565);
		layeredPane.add(panel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(238, 146, 370, 33);
		contentPane.add(textField);
		
		table = new JTable();
		table.setBounds(238, 240, 370, 205);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Suppliers");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(354, 40, 84, 22);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox(new Object[]{});
		comboBox.setBounds(619, 146, 197, 33);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Related suppliers");
		lblNewLabel_1.setBounds(242, 215, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Search suppliers");
		lblNewLabel_1_1.setBounds(238, 126, 114, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("View Supplier");
		btnNewButton_2.setBounds(238, 469, 180, 53);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Edit Supplier");
		btnNewButton_1.setBounds(428, 469, 180, 53);
		contentPane.add(btnNewButton_1);
		
	}
	
//add item to array list to display 	
	public void addItemsToMenu(){
		this.menuItems.add("By Name");
		this.menuItems.add("By TP Number");
	}
	public void onClickAddSupplier() {
		System.out.println("ssss");
		AddSupplierFrame frame = new AddSupplierFrame();
	}
}
