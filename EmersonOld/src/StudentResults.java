import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class StudentResults extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentResults frame = new StudentResults();
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
	public StudentResults() {
		setTitle("Students Result");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 612, 644);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(0, 0, 612, 90);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblStudentsResult = new JLabel("Students Result");
		lblStudentsResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentsResult.setForeground(new Color(72, 61, 139));
		lblStudentsResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentsResult.setBounds(260, 31, 100, 14);
		panel_1.add(lblStudentsResult);
	}
}
