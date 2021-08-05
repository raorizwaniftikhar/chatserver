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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PreMedicalFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreMedicalFrame frame = new PreMedicalFrame();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PreMedicalFrame() {
		setResizable(false);
		setBounds(100, 10, 1112, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 1106, 687);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(0, 0, 1107, 150);
		panel.add(panel_1);
		
		JLabel lblPreMedicalGroup = new JLabel("Pre Medical Group");
		lblPreMedicalGroup.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreMedicalGroup.setForeground(new Color(72, 61, 139));
		lblPreMedicalGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPreMedicalGroup.setBounds(345, 25, 424, 25);
		panel_1.add(lblPreMedicalGroup);
		
		JRadioButton rdbtnPart = new JRadioButton("Part 1");
		rdbtnPart.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnPart.setBackground(new Color(176, 196, 222));
		rdbtnPart.setForeground(new Color(72, 61, 139));
		rdbtnPart.setBounds(355, 57, 109, 23);
		panel_1.add(rdbtnPart);
		
		JRadioButton rdbtnPart_1 = new JRadioButton("Part 2");
		rdbtnPart_1.setForeground(new Color(72, 61, 139));
		rdbtnPart_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnPart_1.setBackground(new Color(176, 196, 222));
		rdbtnPart_1.setBounds(694, 57, 109, 23);
		panel_1.add(rdbtnPart_1);
		
		ButtonGroup selec = new ButtonGroup();
		selec.add(rdbtnPart);
		selec.add(rdbtnPart_1);
		
		JLabel lblChoose = new JLabel("Choose:");
		lblChoose.setForeground(new Color(72, 61, 139));
		lblChoose.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChoose.setBounds(60, 98, 70, 25);
		panel_1.add(lblChoose);
		
		JLabel lblSubject = new JLabel("Subject");
		lblSubject.setForeground(new Color(72, 61, 139));
		lblSubject.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSubject.setBounds(122, 98, 70, 25);
		panel_1.add(lblSubject);
		
		JLabel lblSection = new JLabel("Section");
		lblSection.setForeground(new Color(72, 61, 139));
		lblSection.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSection.setBounds(345, 100, 70, 21);
		panel_1.add(lblSection);
		
		JLabel lblSession = new JLabel("Session");
		lblSession.setForeground(new Color(72, 61, 139));
		lblSession.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSession.setBounds(560, 98, 70, 25);
		panel_1.add(lblSession);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(238, 232, 170));
		comboBox.setForeground(new Color(72, 61, 139));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setBounds(180, 98, 145, 25);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(new Color(72, 61, 139));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_1.setBackground(new Color(238, 232, 170));
		comboBox_1.setBounds(405, 98, 145, 25);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setForeground(new Color(72, 61, 139));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_2.setBackground(new Color(238, 232, 170));
		comboBox_2.setBounds(624, 98, 145, 25);
		panel_1.add(comboBox_2);
		
		JLabel label_2 = new JLabel("Program :");
		label_2.setForeground(new Color(72, 61, 139));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(784, 98, 63, 25);
		panel_1.add(label_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(new Color(72, 61, 139));
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_3.setBackground(new Color(238, 232, 170));
		comboBox_3.setBounds(857, 98, 145, 25);
		panel_1.add(comboBox_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(238, 232, 170));
		panel_2.setBounds(0, 150, 174, 537);
		panel.add(panel_2);
		
		JLabel label = new JLabel("Quick Search...");
		label.setFont(new Font("Segoe Print", Font.BOLD, 12));
		label.setBounds(10, 11, 137, 26);
		panel_2.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe Print", Font.BOLD, 12));
		textField.setColumns(10);
		textField.setBounds(10, 48, 137, 31);
		panel_2.add(textField);
		
		JLabel label_1 = new JLabel("Search By");
		label_1.setBackground(new Color(238, 232, 170));
		label_1.setFont(new Font("Segoe Print", Font.BOLD, 12));
		label_1.setBounds(10, 90, 137, 14);
		panel_2.add(label_1);
		
		JRadioButton radioButton = new JRadioButton("Roll No");
		radioButton.setSelected(true);
		radioButton.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton.setBackground(new Color(238, 232, 170));
		radioButton.setBounds(10, 111, 109, 23);
		panel_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Name");
		radioButton_1.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_1.setBackground(new Color(238, 232, 170));
		radioButton_1.setBounds(10, 137, 109, 23);
		panel_2.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Father Name");
		radioButton_2.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_2.setBackground(new Color(238, 232, 170));
		radioButton_2.setBounds(10, 163, 109, 23);
		panel_2.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Blood");
		radioButton_3.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_3.setBackground(new Color(238, 232, 170));
		radioButton_3.setBounds(10, 189, 109, 23);
		panel_2.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("City");
		radioButton_4.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_4.setBackground(new Color(238, 232, 170));
		radioButton_4.setBounds(10, 215, 109, 23);
		panel_2.add(radioButton_4);
		
		
		ButtonGroup se = new ButtonGroup();

		se.add(radioButton);
		se.add(radioButton_1);
		se.add(radioButton_2);
		se.add(radioButton_3);
		se.add(radioButton_4);
	}
}
