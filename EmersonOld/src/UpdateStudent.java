import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class UpdateStudent extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UpdateStudent dialog = new UpdateStudent();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UpdateStudent() {
		setTitle("Update Students Record");
		setType(Type.UTILITY);
		setResizable(false);
		setBounds(240, 10, 784, 713);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(250, 250, 210));
			panel.setBounds(0, 0, 778, 690);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(0, 0, 778, 121);
				panel_1.setBackground(new Color(176, 196, 222));
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JLabel lblUpdateStudentRecord = new JLabel("Update Student Record");
					lblUpdateStudentRecord.setBounds(230, 54, 307, 25);
					lblUpdateStudentRecord.setHorizontalAlignment(SwingConstants.CENTER);
					lblUpdateStudentRecord.setForeground(new Color(72, 61, 139));
					lblUpdateStudentRecord.setFont(new Font("Tahoma", Font.BOLD, 20));
					panel_1.add(lblUpdateStudentRecord);
				}
			}
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(new Color(250, 250, 210));
			panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_1.setBounds(43, 132, 411, 547);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel label = new JLabel("Roll No :");
			label.setForeground(new Color(72, 61, 139));
			label.setFont(new Font("Tahoma", Font.BOLD, 12));
			label.setBounds(72, 44, 61, 14);
			panel_1.add(label);
			
			JLabel label_1 = new JLabel("Name :");
			label_1.setForeground(new Color(72, 61, 139));
			label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			label_1.setBounds(72, 90, 61, 14);
			panel_1.add(label_1);
			
			JLabel label_2 = new JLabel("Marks :");
			label_2.setForeground(new Color(72, 61, 139));
			label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			label_2.setBounds(72, 135, 46, 14);
			panel_1.add(label_2);
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setColumns(10);
			textField.setBounds(154, 39, 153, 26);
			panel_1.add(textField);
			
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(154, 85, 153, 26);
			panel_1.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(154, 130, 153, 26);
			panel_1.add(textField_2);
			
			JButton button = new JButton("Update Now");
			button.setForeground(new Color(238, 232, 170));
			button.setFont(new Font("Tahoma", Font.BOLD, 12));
			button.setBackground(new Color(72, 61, 139));
			button.setBounds(154, 513, 109, 23);
			panel_1.add(button);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(new Color(238, 232, 170));
			panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
			panel_2.setBounds(544, 131, 224, 252);
			panel.add(panel_2);
			panel_2.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setBounds(0, 0, 225, 264);
				panel_2.add(lblNewLabel);
				lblNewLabel.setIcon(new ImageIcon("F:\\New folder\\MyFirstProject\\src\\images\\Edit-male-user.png"));
			}
		}
	}
}
