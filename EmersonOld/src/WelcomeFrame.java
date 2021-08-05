import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class WelcomeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeFrame frame = new WelcomeFrame();
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
	public WelcomeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1128, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 1112, 678);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(555, 5, 1, 1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(176, 196, 222));
		panel.add(panel_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(238, 232, 170));
		menuBar.setBounds(0, 0, 1128, 26);
		panel_1.add(menuBar);
		
		JLabel label = new JLabel("Students Record Here");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(349, 48, 424, 25);
		panel_1.add(label);
		
		JButton button = new JButton("Remove Student");
		button.setForeground(new Color(72, 61, 139));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(new Color(238, 232, 170));
		button.setBounds(933, 109, 153, 40);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Search Student");
		button_1.setForeground(new Color(72, 61, 139));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(new Color(238, 232, 170));
		button_1.setBounds(762, 108, 153, 40);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Update Student");
		button_2.setForeground(new Color(72, 61, 139));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBackground(new Color(238, 232, 170));
		button_2.setBounds(590, 108, 153, 40);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Add New Student");
		button_3.setForeground(new Color(72, 61, 139));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBackground(new Color(238, 232, 170));
		button_3.setBounds(405, 108, 163, 40);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("Show All Students");
		button_4.setForeground(new Color(72, 61, 139));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setBackground(new Color(238, 232, 170));
		button_4.setBounds(231, 108, 153, 41);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("Home");
		button_5.setForeground(new Color(72, 61, 139));
		button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_5.setBackground(new Color(238, 232, 170));
		button_5.setBounds(56, 109, 153, 41);
		panel_1.add(button_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBounds(0, 0, 1112, 200);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLogo = new JLabel("logo");
		lblLogo.setIcon(new ImageIcon("D:\\images.jpg"));
		lblLogo.setBounds(906, 0, 221, 200);
		panel_2.add(lblLogo);
		
		JLabel lblInfoSystem = new JLabel("");
		lblInfoSystem.setIcon(new ImageIcon("D:\\studdent info2.png"));
		lblInfoSystem.setBounds(21, 11, 743, 178);
		panel_2.add(lblInfoSystem);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 600, 1112, 77);
		panel.add(panel_3);
	}
}
