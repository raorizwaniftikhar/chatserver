import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class GeneralScienceFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralScienceFrame frame = new GeneralScienceFrame();
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
	public GeneralScienceFrame() {
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 1112, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setLayout(null);
		panel.setBounds(0, 0, 1106, 688);
		contentPane.add(panel);
		
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
		
		JLabel label_5 = new JLabel("Search By");
		label_5.setFont(new Font("Segoe Print", Font.BOLD, 12));
		label_5.setBackground(new Color(238, 232, 170));
		label_5.setBounds(10, 90, 137, 14);
		panel_2.add(label_5);
		
		JRadioButton radioButton_2 = new JRadioButton("Roll No");
		radioButton_2.setSelected(true);
		radioButton_2.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_2.setBackground(new Color(238, 232, 170));
		radioButton_2.setBounds(10, 111, 109, 23);
		panel_2.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Name");
		radioButton_3.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_3.setBackground(new Color(238, 232, 170));
		radioButton_3.setBounds(10, 137, 109, 23);
		panel_2.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Father Name");
		radioButton_4.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_4.setBackground(new Color(238, 232, 170));
		radioButton_4.setBounds(10, 163, 109, 23);
		panel_2.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Blood");
		radioButton_5.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_5.setBackground(new Color(238, 232, 170));
		radioButton_5.setBounds(10, 189, 109, 23);
		panel_2.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("City");
		radioButton_6.setFont(new Font("Segoe Print", Font.BOLD, 12));
		radioButton_6.setBackground(new Color(238, 232, 170));
		radioButton_6.setBounds(10, 215, 109, 23);
		panel_2.add(radioButton_6);
		
		ButtonGroup se = new ButtonGroup();
		se.add(radioButton_2);
		se.add(radioButton_3);
		se.add(radioButton_4);
		se.add(radioButton_5);
		se.add(radioButton_6);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBounds(0, 0, 1106, 150);
		panel.add(panel_1);
		
		JLabel lblGeneralScienceGroup = new JLabel("General Science Group");
		lblGeneralScienceGroup.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeneralScienceGroup.setForeground(new Color(72, 61, 139));
		lblGeneralScienceGroup.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGeneralScienceGroup.setBounds(345, 25, 424, 25);
		panel_1.add(lblGeneralScienceGroup);
		
		JRadioButton radioButton = new JRadioButton("Part 1");
		radioButton.setForeground(new Color(72, 61, 139));
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton.setBackground(new Color(176, 196, 222));
		radioButton.setBounds(355, 57, 109, 23);
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Part 2");
		radioButton_1.setForeground(new Color(72, 61, 139));
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_1.setBackground(new Color(176, 196, 222));
		radioButton_1.setBounds(701, 57, 109, 23);
		panel_1.add(radioButton_1);
		
		ButtonGroup selec = new ButtonGroup();
		selec.add(radioButton);
		selec.add(radioButton_1);
		
		JLabel label_2 = new JLabel("Choose:");
		label_2.setForeground(new Color(72, 61, 139));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(60, 98, 70, 25);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Subject");
		label_3.setForeground(new Color(72, 61, 139));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(122, 98, 70, 25);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Section");
		label_4.setForeground(new Color(72, 61, 139));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(345, 100, 70, 21);
		panel_1.add(label_4);
		
		JLabel label_6 = new JLabel("Session");
		label_6.setForeground(new Color(72, 61, 139));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setBounds(560, 98, 70, 25);
		panel_1.add(label_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(72, 61, 139));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setBackground(new Color(238, 232, 170));
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
		
		JLabel label_7 = new JLabel("Program :");
		label_7.setForeground(new Color(72, 61, 139));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setBounds(784, 98, 63, 25);
		panel_1.add(label_7);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setForeground(new Color(72, 61, 139));
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_3.setBackground(new Color(238, 232, 170));
		comboBox_3.setBounds(857, 98, 145, 25);
		panel_1.add(comboBox_3);
	}

}
