package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainViewFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainViewFrame frame = new MainViewFrame();
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
	public MainViewFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Users");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu = new JMenu("Suppliers");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SuppliersFrame frame = new SuppliersFrame();
				frame.setVisible(true);
				System.out.println("menuclicked");
			}
		});
		
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_5 = new JMenu("Manufacturers");
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_2 = new JMenu("Medicine");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Compound");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_6 = new JMenu("Inventory");
		menuBar.add(mnNewMenu_6);
		
		JMenu mnNewMenu_4 = new JMenu("Billing");
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	


}
