import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class LogInFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInFrame frame = new LogInFrame();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	public LogInFrame() {
		setTitle("LogIn Now");
		setResizable(false);
		setBounds(200, 200, 898, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 892, 397);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel imagelabel = new JLabel("");
		imagelabel.setBounds(140, 187, 104, 103);
		imagelabel.setIcon(new ImageIcon("adminLogin_icon.png"));
		panel.add(imagelabel);
		
		JLabel lblUsername = new JLabel("UserName :");
		lblUsername.setBounds(277, 195, 85, 14);
		lblUsername.setForeground(new Color(72, 61, 139));
		lblUsername.setBackground(new Color(72, 61, 139));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(277, 252, 85, 14);
		lblPassword.setForeground(new Color(72, 61, 139));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(372, 187, 204, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(372, 243, 204, 34);
		panel.add(passwordField);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.setBounds(372, 290, 139, 23);
		chckbxShowPassword.setForeground(new Color(72, 61, 139));
		chckbxShowPassword.setBackground(new Color(250, 250, 210));
		chckbxShowPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(chckbxShowPassword);
		
		
			
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setBounds(372, 320, 100, 30);
		btnLogin.setForeground(new Color(72, 61, 139));
		btnLogin.setBackground(new Color(173, 216, 230));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				


				 dispose();
				MainFrame framemain = new MainFrame();

				framemain.setVisible(true);
				
			

				
			}
		});
		panel.add(btnLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 892, 137);
		panel_1.setBackground(new Color(176, 196, 222));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Student-Information-System-project-in-PHP.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(108, 0, 688, 126);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 250, 210));
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(92, 148, 701, 238);
		panel.add(panel_2);
	}
}
