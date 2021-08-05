import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DataBaseCode {

	
	Connection con= null;
	Statement st = null;
	ResultSet rs = null;
	

	DataBaseCode(){
		
		try {
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/EmersonCollege","root","");
			st = con.createStatement();
			String sql=" INSERT INTO `studentpersonalrecord`(`RollNo`, `StudentName`, `CNIC/BForm`, `ContactNo`, `DateofBirth`, `Religion`, `Gender`, `HafizEQuran`,"
					+ " `BloodGroup`, `BloodDonner`, `MaritalStatus`, `Domicile`, `Hostel`) VALUES ('5','jastdd','5454','55','1998-5-5','islam',"
					+ "'male','no','a+','yes','married','m','no')";
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args){
		new DataBaseCode();
	}
	
}
