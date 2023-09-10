package Assignment;

import java.sql.*;

public class JdbcEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/sample","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next());
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			con.close();
}catch(Exception e)
{
	System.out.println(e);
}
	}

	private static int getString(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
