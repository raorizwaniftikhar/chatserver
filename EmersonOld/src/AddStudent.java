import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class AddStudent extends JFrame {

	
	private final JPanel contentPanel = new JPanel();
	private JTextField StudentNameField;
	private JTextField contactField;
	private JTextField RollNoField;
	private JTextField fatherOcupationField;
	private JTextField fatherPhoneNo;
	private JTextField matricRegField;
	private JTextField matricRollField;
	private JTextField matricSchoolName;
	private JTextField fatherNameField;
	private JTextField fatherCnicField;
	private JTextField voucherField;
	private JTextField feeField;
	private JTextField concessionField;
	private JTextField CnicField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField domicileField;
	
	JComboBox comboBoxSubject1,comboBoxSubject2,comboBoxSubject3;

	String gender,religion,hafiz,doner,marital,hostel,dob,Day,Month,Year;
	ButtonGroup gender1 = new ButtonGroup();
	JComboBox comboBoxDay;
	JComboBox comboBoxMonth;
	JComboBox comboBoxYear;
	ButtonGroup religion1 = new ButtonGroup();
	JComboBox comboBoxBloodGroup ;
	JCheckBox chckbxDoner;
	JRadioButton rdbtnMale ,rdbtnFeMale;
	ButtonGroup maritalGroup = new ButtonGroup();
	ButtonGroup Doner= new ButtonGroup();
	ButtonGroup h = new ButtonGroup();
	ButtonGroup hs = new ButtonGroup();
	JRadioButton rdbtnSingle ,rdbtnMarried , rdbtnMuslim, rdbtnNonMuslim , rdbtnhafizYes , rdbtnhafizNo , rdbtnhostelyes , rdbtnhostelno, rdbtnDoner,rdbtnNotDoner ;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		AddStudent dialog = new AddStudent();
		try {
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddStudent() {
		setTitle("Add New Students");
		setType(Type.UTILITY);
		setResizable(false);
		setBounds(200, 10, 784, 695);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		JPanel panel_2 = new JPanel();

		
			JPanel panel = new JPanel();
			panel.setBackground(new Color(250, 250, 210));
			panel.setBounds(0, 0, 778, 671);
			contentPanel.add(panel);
			panel.setLayout(null);
			
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(0, 0, 778, 108);
				panel_1.setBackground(new Color(176, 196, 222));
				panel.add(panel_1);
				panel_1.setLayout(null);
				
					JLabel lblAddNewStudent = new JLabel("Student Registration Form");
					lblAddNewStudent.setForeground(new Color(72, 61, 139));
					lblAddNewStudent.setFont(new Font("Tahoma", Font.BOLD, 20));
					lblAddNewStudent.setHorizontalAlignment(SwingConstants.CENTER);
					lblAddNewStudent.setBounds(183, 38, 424, 25);
					panel_1.add(lblAddNewStudent);
				
			
			
			String[] day = {"DAY","1","2","3","4","5","6","7",
					        "8","9","10","11","12","13","14",
					        "15","16","17","18","19","20","21"
					        ,"22","23","24","25","26","27","28"
					        ,"29","30","31"};
			
			String[] month = {"MONTH","JAN","FEB","MAR","APR","MAY","JUN","JUL",
			        "AUG","SEP","OCT","NOV","DEC"};
				String[] year = {"YEAR","2016","2015","2014","2013","2012","2011","2010",
				        "2009","2008","2007","2006","2005","2004","2003",
				        "2002","2001","2000","1999","1998","1997","1996"
				        ,"1995","1994","1993","1992","1991","1990"};
			
				
				
				
				JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
				tabbedPane.setBackground(new Color(250, 250, 210));
				tabbedPane.setBounds(0, 114, 778, 557);
				panel.add(tabbedPane);
				
				JPanel panel_11 = new JPanel();
				panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_11.setBackground(new Color(250, 250, 210));
				tabbedPane.addTab("Student Personal Record", null, panel_11, "Student Personal Record");
	          	panel_11.setLayout(null);
				
				JLabel label_1 = new JLabel("Student Name :");
				label_1.setBounds(40, 90, 106, 14);
				label_1.setForeground(new Color(72, 61, 139));
				label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_11.add(label_1);
				
				StudentNameField = new JTextField();
				StudentNameField.setBounds(149, 81, 221, 34);
				//StudentNameField.setEditable(false);
				StudentNameField.setColumns(10);
				panel_11.add(StudentNameField);
				
				contactField = new JTextField();
				contactField.setBounds(149, 170, 221, 31);
			//	contactField.setEditable(false);
				contactField.setColumns(10);
				panel_11.add(contactField);
				
				JLabel lblStudentCnic = new JLabel("CNIC / B-Form :");
				lblStudentCnic.setBounds(40, 134, 100, 14);
				lblStudentCnic.setForeground(new Color(72, 61, 139));
				lblStudentCnic.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_11.add(lblStudentCnic);
				
				JLabel label_4 = new JLabel("Contact No:");
				label_4.setBounds(40, 177, 92, 14);
				label_4.setForeground(new Color(72, 61, 139));
				label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_11.add(label_4);
				
				 comboBoxDay = new JComboBox(day);
				comboBoxDay.setBounds(149, 212, 60, 20);
				comboBoxDay.setForeground(new Color(25, 25, 112));
				comboBoxDay.setBackground(Color.WHITE);
				panel_11.add(comboBoxDay);
				
				JLabel label_6 = new JLabel("DOB :");
				label_6.setBounds(40, 214, 65, 14);
				label_6.setForeground(new Color(72, 61, 139));
				label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_11.add(label_6);
				
				 comboBoxMonth = new JComboBox(month);
				comboBoxMonth.setBounds(218, 212, 77, 20);
				comboBoxMonth.setForeground(new Color(72, 61, 139));
				comboBoxMonth.setBackground(Color.WHITE);
				panel_11.add(comboBoxMonth);
				
				 comboBoxYear = new JComboBox(year);
				comboBoxYear.setBounds(305, 212, 65, 20);
				comboBoxYear.setForeground(new Color(72, 61, 139));
				comboBoxYear.setBackground(Color.WHITE);
				panel_11.add(comboBoxYear);
				
				JLabel label_7 = new JLabel("Gender :");
				label_7.setBounds(40, 281, 85, 14);
				label_7.setForeground(new Color(72, 61, 139));
				label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_11.add(label_7);
				
				
				
				JLabel lblChooseBloodGroup = new JLabel("Blood Group:");
				lblChooseBloodGroup.setBounds(40, 332, 92, 14);
				lblChooseBloodGroup.setForeground(new Color(72, 61, 139));
				lblChooseBloodGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_11.add(lblChooseBloodGroup);
				
				JLabel lblRollNo = new JLabel("Roll No :");
				lblRollNo.setBounds(40, 45, 100, 14);
				lblRollNo.setForeground(new Color(72, 61, 139));
				lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_11.add(lblRollNo);
				
				RollNoField = new JTextField();
				RollNoField.setBounds(149, 36, 221, 34);
				//RollNoField.setEditable(false);
				RollNoField.setColumns(10);
				panel_11.add(RollNoField);
				
				
			 comboBoxBloodGroup = new JComboBox(new Object[]{null,"A+","A-","B+","B-","AB+","AB-","O+","O-"});
				comboBoxBloodGroup.setBounds(149, 330, 92, 20);
				comboBoxBloodGroup.setForeground(new Color(72, 61, 139));
				comboBoxBloodGroup.setBackground(Color.WHITE);
				panel_11.add(comboBoxBloodGroup);
				
				JLabel lblHafizequran = new JLabel("Hafiz-E-Quran :");
				lblHafizequran.setBounds(40, 306, 106, 14);
				lblHafizequran.setForeground(new Color(72, 61, 139));
				lblHafizequran.setFont(new Font("Tahoma", Font.BOLD, 12));
				panel_11.add(lblHafizequran);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
				panel_4.setBounds(513, 36, 221, 212);
				panel_11.add(panel_4);
				panel_4.setLayout(null);
				
				JLabel lblStudentPictureHere = new JLabel("Student Picture Here");
				lblStudentPictureHere.setBounds(48, 100, 125, 14);
				panel_4.add(lblStudentPictureHere);
				  
		
				
				JButton buttonNext = new JButton("Next >>");
			/*	buttonNext.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						if(e.getSource()==buttonNext){
							genderselected();
							religionselected();
							hafizselected();
							bloodselected();
							MaritalStatusselected();
							//dateOfBirthselected();
							if(new DataBaseCode().add(RollNoField.getText(),StudentNameField.getText(), CnicField.getText(), contactField.getText(), dob, religion, gender, hafiz, comboBoxBloodGroup.getSelectedItem().toString(), doner, marital, domicileField.getText(), hostel)){
								
							}
						}
					}
				});
			*/
				buttonNext.setForeground(new Color(72, 61, 139));
				buttonNext.setFont(new Font("Tahoma", Font.BOLD, 12));
				buttonNext.setBackground(new Color(176, 196, 222));
				buttonNext.setBounds(645, 457, 89, 34);
				panel_11.add(buttonNext);
				
				JLabel lblHostel = new JLabel("Hostel :");
				lblHostel.setForeground(new Color(72, 61, 139));
				lblHostel.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblHostel.setBounds(40, 467, 77, 14);
				panel_11.add(lblHostel);
				
				JLabel lblDomicile = new JLabel("Domicile:");
				lblDomicile.setForeground(new Color(72, 61, 139));
				lblDomicile.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblDomicile.setBounds(40, 430, 85, 14);
				panel_11.add(lblDomicile);
				
				JLabel lblMaritalStatus = new JLabel("Marital Status :");
				lblMaritalStatus.setForeground(new Color(72, 61, 139));
				lblMaritalStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblMaritalStatus.setBounds(40, 390, 106, 14);
				panel_11.add(lblMaritalStatus);
				
				CnicField = new JTextField();
				//CnicField.setEditable(false);
				CnicField.setColumns(10);
				CnicField.setBounds(149, 125, 221, 34);
				panel_11.add(CnicField);
				
				JLabel lblReligion = new JLabel("Religion  :");
				lblReligion.setForeground(new Color(72, 61, 139));
				lblReligion.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblReligion.setBounds(40, 254, 85, 14);
				panel_11.add(lblReligion);
				
				ButtonGroup ge = new ButtonGroup();
				
				rdbtnMale = new JRadioButton("Male");
				rdbtnMale.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnMale.setBackground(new Color(250, 250, 210));
				rdbtnMale.setForeground(new Color(72, 61, 139));
				rdbtnMale.setBounds(149, 278, 60, 23);
				panel_11.add(rdbtnMale);
				
			 rdbtnFeMale = new JRadioButton("Female");
				rdbtnFeMale.setForeground(new Color(72, 61, 139));
				rdbtnFeMale.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnFeMale.setBackground(new Color(250, 250, 210));
				rdbtnFeMale.setBounds(248, 278, 97, 23);
				panel_11.add(rdbtnFeMale);
				
				ge.add(rdbtnMale);
				ge.add(rdbtnFeMale);
				
				rdbtnSingle = new JRadioButton("Single");
				rdbtnSingle.setForeground(new Color(72, 61, 139));
				rdbtnSingle.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnSingle.setBackground(new Color(250, 250, 210));
				rdbtnSingle.setBounds(149, 387, 65, 23);
				panel_11.add(rdbtnSingle);
				
				 rdbtnMarried = new JRadioButton("Married");
				rdbtnMarried.setForeground(new Color(72, 61, 139));
				rdbtnMarried.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnMarried.setBackground(new Color(250, 250, 210));
				rdbtnMarried.setBounds(248, 387, 97, 23);
				panel_11.add(rdbtnMarried);
				ButtonGroup me = new ButtonGroup();

				me.add(rdbtnSingle);
				me.add(rdbtnMarried);
				
				domicileField = new JTextField();
				domicileField.setColumns(10);
				domicileField.setBounds(149, 428, 111, 24);
				panel_11.add(domicileField);
				
				 rdbtnhafizYes = new JRadioButton("Yes");
				rdbtnhafizYes.setForeground(new Color(72, 61, 139));
				rdbtnhafizYes.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnhafizYes.setBackground(new Color(250, 250, 210));
				rdbtnhafizYes.setBounds(149, 303, 60, 23);
				panel_11.add(rdbtnhafizYes);
				
				 rdbtnhafizNo = new JRadioButton("No");
				rdbtnhafizNo.setForeground(new Color(72, 61, 139));
				rdbtnhafizNo.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnhafizNo.setBackground(new Color(250, 250, 210));
				rdbtnhafizNo.setBounds(248, 303, 60, 23);
				panel_11.add(rdbtnhafizNo);
				
			
				 rdbtnMuslim = new JRadioButton("Muslim");
				rdbtnMuslim.setForeground(new Color(72, 61, 139));
				rdbtnMuslim.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnMuslim.setBackground(new Color(250, 250, 210));
				rdbtnMuslim.setBounds(149, 250, 77, 23);
				panel_11.add(rdbtnMuslim);
				
				 rdbtnNonMuslim = new JRadioButton("Non Muslim");
				rdbtnNonMuslim.setForeground(new Color(72, 61, 139));
				rdbtnNonMuslim.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnNonMuslim.setBackground(new Color(250, 250, 210));
				rdbtnNonMuslim.setBounds(248, 251, 122, 23);
				panel_11.add(rdbtnNonMuslim);
				religion1.add(rdbtnMuslim);
				religion1.add(rdbtnNonMuslim);
				
				rdbtnDoner = new JRadioButton("Donner");
				rdbtnDoner.setForeground(new Color(72, 61, 139));
				rdbtnDoner.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnDoner.setBackground(new Color(250, 250, 210));
				rdbtnDoner.setBounds(149, 353, 92, 23);
				panel_11.add(rdbtnDoner);
				
				rdbtnNotDoner = new JRadioButton("Not Donner");
				rdbtnNotDoner.setForeground(new Color(72, 61, 139));
				rdbtnNotDoner.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnNotDoner.setBackground(new Color(250, 250, 210));
				rdbtnNotDoner.setBounds(248, 354, 111, 23);
				panel_11.add(rdbtnNotDoner);
				Doner.add(rdbtnDoner);
				Doner.add(rdbtnNotDoner);
				
				h.add(rdbtnhafizYes);
				h.add(rdbtnhafizNo);
				
				rdbtnhostelyes = new JRadioButton("Yes");
				rdbtnhostelyes.setForeground(new Color(72, 61, 139));
				rdbtnhostelyes.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnhostelyes.setBackground(new Color(250, 250, 210));
				rdbtnhostelyes.setBounds(149, 464, 60, 23);
				panel_11.add(rdbtnhostelyes);
				
			 rdbtnhostelno = new JRadioButton("No");
				rdbtnhostelno.setForeground(new Color(72, 61, 139));
				rdbtnhostelno.setFont(new Font("Tahoma", Font.BOLD, 12));
				rdbtnhostelno.setBackground(new Color(250, 250, 210));
				rdbtnhostelno.setBounds(248, 464, 60, 23);
				panel_11.add(rdbtnhostelno);
				
				hs.add(rdbtnhostelyes);
				hs.add(rdbtnhostelno);
				panel_2.setBackground(new Color(250, 250, 210));
				tabbedPane.addTab("Parents/Guardian  Information", null, panel_2, null);
				panel_2.setLayout(null);
				
				fatherOcupationField = new JTextField();
				//fatherOcupationField.setEditable(false);
				fatherOcupationField.setColumns(10);
				fatherOcupationField.setBounds(157, 70, 221, 34);
				panel_2.add(fatherOcupationField);
				
				fatherPhoneNo = new JTextField();
				//fatherPhoneNo.setEditable(false);
				fatherPhoneNo.setColumns(10);
				fatherPhoneNo.setBounds(526, 70, 221, 34);
				panel_2.add(fatherPhoneNo);
				
				JButton btnNext = new JButton("Next >>");
				btnNext.setForeground(new Color(72, 61, 139));
				btnNext.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnNext.setBackground(new Color(176, 196, 222));
				btnNext.setBounds(658, 495, 89, 23);
				panel_2.add(btnNext);
				
				JButton buttonBack = new JButton("<< Back");
				buttonBack.setForeground(new Color(72, 61, 139));
				buttonBack.setFont(new Font("Tahoma", Font.BOLD, 12));
				buttonBack.setBackground(new Color(176, 196, 222));
				buttonBack.setBounds(560, 496, 89, 23);
				panel_2.add(buttonBack);
				
				JLabel label_2 = new JLabel("Father Name :");
				label_2.setForeground(new Color(72, 61, 139));
				label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_2.setBounds(32, 34, 100, 14);
				panel_2.add(label_2);
				
				fatherNameField = new JTextField();
				//fatherNameField.setEditable(false);
				fatherNameField.setColumns(10);
				fatherNameField.setBounds(157, 25, 221, 34);
				panel_2.add(fatherNameField);
				
				JLabel label_3 = new JLabel("Father CNIC :");
				label_3.setForeground(new Color(72, 61, 139));
				label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_3.setBounds(416, 34, 100, 14);
				panel_2.add(label_3);
				
				fatherCnicField = new JTextField();
				//fatherCnicField.setEditable(false);
				fatherCnicField.setColumns(10);
				fatherCnicField.setBounds(526, 25, 221, 34);
				panel_2.add(fatherCnicField);
				
				JLabel label_8 = new JLabel("Father Occupation :");
				label_8.setForeground(new Color(72, 61, 139));
				label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_8.setBounds(32, 82, 120, 14);
				panel_2.add(label_8);
				
				JLabel label_13 = new JLabel("Phone No :");
				label_13.setForeground(new Color(72, 61, 139));
				label_13.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_13.setBounds(416, 73, 100, 14);
				panel_2.add(label_13);
				
				JLabel lblPermanentAdress = new JLabel("Permanent Adress :");
				lblPermanentAdress.setForeground(new Color(72, 61, 139));
				lblPermanentAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPermanentAdress.setBounds(32, 129, 120, 14);
				panel_2.add(lblPermanentAdress);
				
				JEditorPane editorPanepermanentAdress = new JEditorPane();
				editorPanepermanentAdress.setBounds(157, 115, 221, 100);
				panel_2.add(editorPanepermanentAdress);
				
				JLabel lblPostalAdress = new JLabel("Postal Adress :");
				lblPostalAdress.setForeground(new Color(72, 61, 139));
				lblPostalAdress.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPostalAdress.setBounds(416, 115, 100, 14);
				panel_2.add(lblPostalAdress);
				
				JEditorPane editorPanepostalAdress = new JEditorPane();
				editorPanepostalAdress.setBounds(526, 115, 221, 100);
				panel_2.add(editorPanepostalAdress);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBackground(new Color(250, 250, 210));
				tabbedPane.addTab("Previous Academic Record", null, panel_3, null);
				panel_3.setLayout(null);
				
				JButton bttnNext = new JButton("Next >>");
				bttnNext.setForeground(new Color(72, 61, 139));
				bttnNext.setFont(new Font("Tahoma", Font.BOLD, 12));
				bttnNext.setBackground(new Color(176, 196, 222));
				bttnNext.setBounds(660, 495, 89, 23);
				panel_3.add(bttnNext);
				
				JButton btnBack = new JButton("<< Back");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnBack.setForeground(new Color(72, 61, 139));
				btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnBack.setBackground(new Color(176, 196, 222));
				btnBack.setBounds(561, 496, 89, 23);
				panel_3.add(btnBack);
				
				matricRegField = new JTextField();
				//matricRegField.setEditable(false);
				matricRegField.setColumns(10);
				matricRegField.setBounds(493, 31, 221, 23);
				panel_3.add(matricRegField);
				
				matricRollField = new JTextField();
				//matricRollField.setEditable(false);
				matricRollField.setColumns(10);
				matricRollField.setBounds(159, 31, 120, 23);
				panel_3.add(matricRollField);
				
				JLabel lblPassingYear = new JLabel("Passing Year :");
				lblPassingYear.setForeground(new Color(72, 61, 139));
				lblPassingYear.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblPassingYear.setBounds(49, 131, 100, 14);
				panel_3.add(lblPassingYear);
				
				JLabel lblTotalMarks = new JLabel("Total Marks :");
				lblTotalMarks.setForeground(new Color(72, 61, 139));
				lblTotalMarks.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblTotalMarks.setBounds(390, 84, 100, 14);
				panel_3.add(lblTotalMarks);
				
				JLabel lblObtainedMarks = new JLabel("Obtained Marks :");
				lblObtainedMarks.setForeground(new Color(72, 61, 139));
				lblObtainedMarks.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblObtainedMarks.setBounds(49, 83, 111, 14);
				panel_3.add(lblObtainedMarks);
				
				JLabel lblMatricRegistrationNo = new JLabel("Matric Reg No :");
				lblMatricRegistrationNo.setForeground(new Color(72, 61, 139));
				lblMatricRegistrationNo.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblMatricRegistrationNo.setBounds(390, 32, 134, 14);
				panel_3.add(lblMatricRegistrationNo);
				
				JLabel lblMatricRollNo = new JLabel("Matric Roll No :");
				lblMatricRollNo.setForeground(new Color(72, 61, 139));
				lblMatricRollNo.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblMatricRollNo.setBounds(49, 32, 100, 14);
				panel_3.add(lblMatricRollNo);
				
				JLabel lblSchoolname = new JLabel("School Name :");
				lblSchoolname.setForeground(new Color(72, 61, 139));
				lblSchoolname.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblSchoolname.setBounds(49, 181, 100, 14);
				panel_3.add(lblSchoolname);
				
				matricSchoolName = new JTextField();
				//matricSchoolName.setEditable(false);
				matricSchoolName.setColumns(10);
				matricSchoolName.setBounds(160, 175, 221, 29);
				panel_3.add(matricSchoolName);
				
				 
				JComboBox comboBoxPassingYear = new JComboBox(new Object[]{"2012","2013","2014","2015","2016","2017","2018","2019","2020"});
				comboBoxPassingYear.setForeground(new Color(72, 61, 139));
				comboBoxPassingYear.setBackground(Color.WHITE);
				comboBoxPassingYear.setBounds(159, 129, 120, 21);
				panel_3.add(comboBoxPassingYear);
				
				JLabel label_10 = new JLabel("Board Name :");
				label_10.setForeground(new Color(72, 61, 139));
				label_10.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_10.setBounds(390, 132, 100, 14);
				panel_3.add(label_10);
				
				JComboBox comboBoxBoardName = new JComboBox(new Object[]{});
				comboBoxBoardName.setForeground(new Color(72, 61, 139));
				comboBoxBoardName.setBackground(Color.WHITE);
				comboBoxBoardName.setBounds(493, 124, 221, 26);
				panel_3.add(comboBoxBoardName);
				
				textField = new JTextField();
				textField.setColumns(10);
				textField.setBounds(159, 81, 120, 23);
				panel_3.add(textField);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(493, 82, 120, 23);
				panel_3.add(textField_1);
				
				JPanel panel_5 = new JPanel();
				panel_5.setBackground(new Color(250, 250, 210));
				tabbedPane.addTab("New College Record ", null, panel_5, null);
				panel_5.setLayout(null);
				
				JLabel lblClass = new JLabel("Class  :");
				lblClass.setForeground(new Color(72, 61, 139));
				lblClass.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblClass.setBounds(51, 92, 63, 14);
				panel_5.add(lblClass);
				
				JButton bttnnBack = new JButton("<< Back");
				bttnnBack.setForeground(new Color(72, 61, 139));
				bttnnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
				bttnnBack.setBackground(new Color(176, 196, 222));
				bttnnBack.setBounds(566, 495, 89, 23);
				panel_5.add(bttnnBack);
				
				JButton btnFinish = new JButton("Finish");
				btnFinish.setForeground(new Color(72, 61, 139));
				btnFinish.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnFinish.setBackground(new Color(176, 196, 222));
				btnFinish.setBounds(665, 496, 89, 23);
				panel_5.add(btnFinish);
				
				JComboBox comboBoxClass = new JComboBox(new Object[]{null,"Part 1","Part 2"});
				comboBoxClass.setForeground(new Color(72, 61, 139));
				comboBoxClass.setBackground(Color.WHITE);
				comboBoxClass.setBounds(134, 89, 111, 23);
				panel_5.add(comboBoxClass);
				
				JLabel lblSubjects = new JLabel("Subjects :");
				lblSubjects.setForeground(new Color(72, 61, 139));
				lblSubjects.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblSubjects.setBounds(51, 223, 63, 14);
				panel_5.add(lblSubjects);
				
				JLabel lblProgram = new JLabel("Program :");
				lblProgram.setForeground(new Color(72, 61, 139));
				lblProgram.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblProgram.setBounds(51, 144, 63, 14);
				panel_5.add(lblProgram);
				
				
				JCheckBox chckbxMorning = new JCheckBox("Morning");
				chckbxMorning.setForeground(new Color(72, 61, 139));
				chckbxMorning.setFont(new Font("Tahoma", Font.BOLD, 12));
				chckbxMorning.setBackground(new Color(250, 250, 210));
				chckbxMorning.setBounds(134, 140, 97, 23);
				panel_5.add(chckbxMorning);
				
				JCheckBox chckbxEvening = new JCheckBox("Evening");
				chckbxEvening.setForeground(new Color(72, 61, 139));
				chckbxEvening.setFont(new Font("Tahoma", Font.BOLD, 12));
				chckbxEvening.setBackground(new Color(250, 250, 210));
				chckbxEvening.setBounds(134, 176, 78, 23);
				panel_5.add(chckbxEvening);
				
				JLabel lblSession = new JLabel("Session :");
				lblSession.setForeground(new Color(72, 61, 139));
				lblSession.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblSession.setBounds(447, 144, 70, 14);
				panel_5.add(lblSession);
				
				JLabel label_11 = new JLabel("Section :");
				label_11.setForeground(new Color(72, 61, 139));
				label_11.setFont(new Font("Tahoma", Font.BOLD, 12));
				label_11.setBounds(255, 144, 63, 14);
				panel_5.add(label_11);
				
				JLabel lblVoucherNo = new JLabel("Voucher No :");
				lblVoucherNo.setForeground(new Color(72, 61, 139));
				lblVoucherNo.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblVoucherNo.setBounds(51, 39, 78, 14);
				panel_5.add(lblVoucherNo);
				
				voucherField = new JTextField();
				//voucherField.setEditable(false);
				voucherField.setColumns(10);
				voucherField.setBounds(134, 35, 111, 24);
				panel_5.add(voucherField);
				
				JLabel lblTotalFee = new JLabel("Total Fee :");
				lblTotalFee.setForeground(new Color(72, 61, 139));
				lblTotalFee.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblTotalFee.setBounds(255, 39, 70, 14);
				panel_5.add(lblTotalFee);
				
				feeField = new JTextField();
				//feeField.setEditable(false);
				feeField.setColumns(10);
				feeField.setBounds(323, 35, 111, 24);
				panel_5.add(feeField);
				
				JLabel lblConsetion = new JLabel("Concession :");
				lblConsetion.setForeground(new Color(72, 61, 139));
				lblConsetion.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblConsetion.setBounds(447, 40, 78, 14);
				panel_5.add(lblConsetion);
				
				concessionField = new JTextField();
				//concessionField.setEditable(false);
				concessionField.setColumns(10);
				concessionField.setBounds(527, 37, 111, 24);
				panel_5.add(concessionField);
				
				JLabel lblGroup = new JLabel("Group :");
				lblGroup.setForeground(new Color(72, 61, 139));
				lblGroup.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblGroup.setBounds(323, 92, 63, 14);
				panel_5.add(lblGroup);
				String[] group={null,"Pre Medical","Pre Engineering","General Science","ICS","I.Com","Arts"};
				JComboBox comboBoxGroup = new JComboBox(group);
				comboBoxGroup.addItemListener(new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						
						if(e.getStateChange()==comboBoxGroup.getSelectedIndex()){
						comboBoxGroup.setSelectedItem("Pre Medical");
						comboBoxSubject1.setEnabled(false);
						comboBoxSubject2.setEnabled(false);
						comboBoxSubject3.setEnabled(false);
						
						}
						else{
							comboBoxSubject1.setEnabled(true);
							comboBoxSubject2.setEnabled(true);
							comboBoxSubject3.setEnabled(true);
						}
						
					}
				});
				comboBoxGroup.setForeground(new Color(72, 61, 139));
				comboBoxGroup.setBackground(Color.WHITE);
				comboBoxGroup.setBounds(444, 89, 194, 23);
				panel_5.add(comboBoxGroup);
				
				JComboBox comboBoxSession = new JComboBox(new Object[]{null,"2016-18","2017-19","2018-20","2019-21","2020-22"});
				comboBoxSession.setForeground(new Color(72, 61, 139));
				comboBoxSession.setBackground(Color.WHITE);
				comboBoxSession.setBounds(527, 141, 111, 23);
				panel_5.add(comboBoxSession);
				
				JComboBox comboBoxSection = new JComboBox(new Object[]{null,"A","B","C"});
				
				comboBoxSection.setForeground(new Color(72, 61, 139));
				comboBoxSection.setBackground(Color.WHITE);
				comboBoxSection.setBounds(328, 141, 106, 23);
				panel_5.add(comboBoxSection);
				
				String[] physics ={null,"Physics"};						//Subjects combo box data
				String[] chemistry = {null,"Chemistry"};
				String[] biology = {null,"Biology"};
				String[] math = {"Math"};
				String[] computerScience = {"Computer Science"};
				String[] icsSubject= {"Physics","Statistics","Economics"};
				String[] artsSubject1 = {null,"Economics","Islamiat","Sociology","Computer",
										"Civics","Education","Geography","Health & Phy Edu"};
				
				String[] artsSubject2 = {null,"Islamiat","Statistics","Computer",
										"Health & Phy Edu","Phychology","Economics","Library Science","Civics"}; 
				
				String[]  artsSubject3 = {null,"History","Saraiki/Punjabi","English Literature",
							"Urdu Advance","Arabic","Geography","Education",
							"Econoics","Phychology","Computer","Statistics","Islamiat",
							"Sociology","Physics","Library Science","Health & Phy Edu"};
				
			
				comboBoxSubject1 = new JComboBox(artsSubject1);
				comboBoxSubject1.setForeground(new Color(72, 61, 139));
				comboBoxSubject1.setBackground(Color.WHITE);
				comboBoxSubject1.setBounds(134, 220, 140, 23);
				panel_5.add(comboBoxSubject1);
				
				comboBoxSubject2 = new JComboBox(artsSubject2);
				comboBoxSubject2.setForeground(new Color(72, 61, 139));
				comboBoxSubject2.setBackground(Color.WHITE);
				comboBoxSubject2.setBounds(323, 220, 140, 23);
				panel_5.add(comboBoxSubject2);
				
				comboBoxSubject3 = new JComboBox(artsSubject3);
				comboBoxSubject3.setForeground(new Color(72, 61, 139));
				comboBoxSubject3.setBackground(Color.WHITE);
				comboBoxSubject3.setBounds(498, 220, 140, 23);
				panel_5.add(comboBoxSubject3);
				
			
		
	}
	//function
	
	public void genderselected(){
		if(rdbtnMale.isSelected()){
			gender = "Male";
		}
		else if(rdbtnFeMale.isSelected()){
			
			gender = "Female";
		}
	}
	
	public void religionselected(){
		if(rdbtnMuslim.isSelected()){
			religion = "Islam";
		}
		else if(rdbtnNonMuslim.isSelected()){
			
			religion = "Non Muslim";
		}
	}
	public void hafizselected(){
		if(rdbtnhafizYes.isSelected()){
			hafiz = "Yes";
		}
		else if(rdbtnhafizNo.isSelected()){
			
			hafiz = "No";
		}
	}
	public void hostelselected(){
		if(rdbtnhostelyes.isSelected()){
			hostel = "Yes";
		}
		else if(rdbtnhostelno.isSelected()){
			
			hostel= "No";
		}
	}
	public void bloodselected(){
		if(rdbtnDoner.isSelected()){
			doner = "Yes";
		}
		else if(rdbtnNotDoner.isSelected()){
			
			doner = "No";
		}
	}
	public void MaritalStatusselected(){
		if(rdbtnSingle.isSelected()){
			marital = "Single";
			
		}
		else if(rdbtnMarried.isSelected()){
			
			marital = "Married";
		}
	}

	public void dateOfBirthselected(){
		if((boolean) comboBoxDay.getSelectedItem()){
			if((boolean) comboBoxMonth.getSelectedItem() ){
			if( (boolean) comboBoxYear.getSelectedItem()){
				dob = Day+"-"+Month+"-"+Year;
				
				
		}
			}	
		}
		
	}
}
