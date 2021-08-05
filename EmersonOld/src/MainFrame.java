import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import java.sql.*;
import javax.swing.JTabbedPane;
public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setResizable(false);
		setTitle("Students Record");
		setBounds(100, 10, 1128, 716);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 250, 210));
		panel.setBounds(0, 0, 1122, 688);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1122, 160);
		panel_1.setBackground(new Color(176, 196, 222));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(238, 232, 170));
		menuBar.setBounds(0, 0, 1128, 26);
		panel_1.add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				LogInFrame lf = new LogInFrame();
				lf.setVisible(true);
				

			}
		});
		mnFile.add(mntmExit);
		
		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);
		
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnEdit);
		
		JMenuItem menuItem_1 = new JMenuItem("Add New Student");
		mnEdit.add(menuItem_1);
		
		JSeparator separator = new JSeparator();
		mnEdit.add(separator);
		
		JMenuItem menuItem_2 = new JMenuItem("Update Student");
		mnEdit.add(menuItem_2);
		
		JSeparator separator_1 = new JSeparator();
		mnEdit.add(separator_1);
		
		JMenuItem menuItem_3 = new JMenuItem("Remove Student");
		mnEdit.add(menuItem_3);
		
		JMenu mnSearch = new JMenu("Search");
		mnSearch.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnSearch);
		
		JMenuItem menuItem = new JMenuItem("Search Student");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SearchStudent ss = new SearchStudent();
				ss.setVisible(true);
			}
		});
		mnSearch.add(menuItem);
		
		JMenu mnSetting = new JMenu("Setting");
		mnSetting.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnSetting);
		
		JMenu mnAbout = new JMenu("About");
		mnAbout.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnAbout);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnHelp);
		
		JLabel lblStudentRecordHere = new JLabel("Students Record Here");
		lblStudentRecordHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentRecordHere.setForeground(new Color(72, 61, 139));
		lblStudentRecordHere.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStudentRecordHere.setBounds(349, 48, 424, 25);
		panel_1.add(lblStudentRecordHere);
		
		JButton button_2 = new JButton("Students Results");
		button_2.setForeground(new Color(72, 61, 139));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBackground(new Color(238, 232, 170));
		button_2.setBounds(933, 109, 153, 40);
		panel_1.add(button_2);
		button_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton button_1 = new JButton("Search Student");
		button_1.setForeground(new Color(72, 61, 139));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(new Color(238, 232, 170));
		button_1.setBounds(762, 108, 153, 40);
		panel_1.add(button_1);
		button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton button_3 = new JButton("Update Student");
		button_3.setForeground(new Color(72, 61, 139));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setBackground(new Color(238, 232, 170));
		button_3.setBounds(590, 108, 153, 40);
		panel_1.add(button_3);
		button_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton button_4 = new JButton("Add New Student");
		button_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddStudent ad = new AddStudent();
				ad.setVisible(true);
			}
		});
		button_4.setForeground(new Color(72, 61, 139));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setBackground(new Color(238, 232, 170));
		button_4.setBounds(405, 108, 163, 40);
		panel_1.add(button_4);
		
		JButton button = new JButton("Show All Students");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setForeground(new Color(72, 61, 139));
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(new Color(238, 232, 170));
		button.setBounds(231, 108, 153, 41);
		panel_1.add(button);
		button.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton button_5 = new JButton("Home");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_5.setForeground(new Color(72, 61, 139));
		button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_5.setBackground(new Color(238, 232, 170));
		button_5.setBounds(56, 109, 153, 41);
		panel_1.add(button_5);
		button_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(891, 171, 221, 261);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(new Color(238, 232, 170));
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 221, 261);
		panel_3.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("student_icon.png"));
		
		JButton btnPre = new JButton("PRE_MEDICAL GROUP");
		btnPre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PreMedicalFrame pm = new PreMedicalFrame();
				pm.setVisible(true);
				
			}
		});
		btnPre.setForeground(new Color(72, 61, 139));
		btnPre.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPre.setBackground(new Color(238, 232, 170));
		btnPre.setBounds(57, 240, 200, 120);
		panel.add(btnPre);
		btnPre.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btnIcsGroup = new JButton("ICS GROUP");
		btnIcsGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IcsFrame ics = new IcsFrame();
				ics.setVisible(true);
			}
		});
		btnIcsGroup.setForeground(new Color(72, 61, 139));
		btnIcsGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIcsGroup.setBackground(new Color(238, 232, 170));
		btnIcsGroup.setBounds(57, 448, 200, 120);
		panel.add(btnIcsGroup);
		btnIcsGroup.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btnPreengineeringGroup = new JButton("PRE-ENGINEERING GROUP");
		btnPreengineeringGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PreEngineeringFrame pe = new PreEngineeringFrame();
				pe.setVisible(true);
			}
		});
		btnPreengineeringGroup.setForeground(new Color(72, 61, 139));
		btnPreengineeringGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPreengineeringGroup.setBackground(new Color(238, 232, 170));
		btnPreengineeringGroup.setBounds(330, 240, 200, 120);
		panel.add(btnPreengineeringGroup);
		btnPreengineeringGroup.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btnIcomGroup = new JButton("I.COM GROUP");
		btnIcomGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IcomFrame icom = new IcomFrame();
				icom.setVisible(true);
			}
		});
		btnIcomGroup.setForeground(new Color(72, 61, 139));
		btnIcomGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIcomGroup.setBackground(new Color(238, 232, 170));
		btnIcomGroup.setBounds(330, 448, 200, 120);
		panel.add(btnIcomGroup);
		btnIcomGroup.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JButton btnGeneralScienceGroup = new JButton("GENERAL SCIENCE GROUP");
		btnGeneralScienceGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeneralScienceFrame gs = new GeneralScienceFrame();
				gs.setVisible(true);
			}
		});
		btnGeneralScienceGroup.setForeground(new Color(72, 61, 139));
		btnGeneralScienceGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGeneralScienceGroup.setBackground(new Color(238, 232, 170));
		btnGeneralScienceGroup.setBounds(585, 240, 200, 120);
		panel.add(btnGeneralScienceGroup);
		btnGeneralScienceGroup.setCursor(new Cursor(Cursor.HAND_CURSOR));
	
		JButton btnArtsGroup = new JButton("ARTS GROUP");
		btnArtsGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArtsFrame arts = new ArtsFrame();
				arts.setVisible(true);
			}
		});
		btnArtsGroup.setForeground(new Color(72, 61, 139));
		btnArtsGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnArtsGroup.setBackground(new Color(238, 232, 170));
		btnArtsGroup.setBounds(585, 448, 200, 120);
		panel.add(btnArtsGroup);
		btnArtsGroup.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel label = new JLabel("INTERMIDIATE PROGRAMS ( MORNING/EVENING )");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(72, 61, 139));
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(151, 184, 555, 25);
		panel.add(label);
		
	}
}

