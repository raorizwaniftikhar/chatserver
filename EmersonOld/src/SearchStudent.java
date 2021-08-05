import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

public class SearchStudent extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SearchStudent dialog = new SearchStudent();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SearchStudent() {
		setTitle("Search Students");
		setType(Type.UTILITY);
		setResizable(false);
		setBounds(200, 10, 784, 695);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(250, 250, 210));
			panel.setBounds(0, 0, 778, 674);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(0, 0, 778, 124);
				panel_1.setBackground(new Color(176, 196, 222));
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JLabel lblSearchStudent = new JLabel("Search Student");
					lblSearchStudent.setHorizontalAlignment(SwingConstants.CENTER);
					lblSearchStudent.setForeground(new Color(72, 61, 139));
					lblSearchStudent.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblSearchStudent.setBounds(68, 58, 584, 25);
					panel_1.add(lblSearchStudent);
				}
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(250, 250, 210));
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setBounds(37, 147, 411, 497);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel label = new JLabel("Search by Roll No :");
			label.setForeground(new Color(72, 61, 139));
			label.setFont(new Font("Tahoma", Font.BOLD, 12));
			label.setBounds(10, 22, 123, 14);
			panel_1.add(label);
			
			JLabel label_1 = new JLabel("Select Class :");
			label_1.setForeground(new Color(72, 61, 139));
			label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			label_1.setBounds(316, 23, 85, 14);
			panel_1.add(label_1);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setForeground(new Color(72, 61, 139));
			comboBox.setBackground(Color.WHITE);
			comboBox.setBounds(317, 48, 84, 20);
			panel_1.add(comboBox);
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setColumns(10);
			textField.setBounds(10, 48, 146, 31);
			panel_1.add(textField);
			
			JButton button = new JButton("Search Now");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			button.setForeground(new Color(238, 232, 170));
			button.setFont(new Font("Tahoma", Font.BOLD, 12));
			button.setBackground(new Color(72, 61, 139));
			button.setBounds(142, 463, 123, 23);
			panel_1.add(button);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(238, 232, 170));
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_2.setBounds(502, 147, 266, 265);
			panel.add(panel_2);
			panel_2.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("");
				lblNewLabel.setBounds(0, 0, 266, 267);
				panel_2.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("F:\\New folder\\MyFirstProject\\src\\images\\Search-Male-User.png"));
			}
		}
	}
}
