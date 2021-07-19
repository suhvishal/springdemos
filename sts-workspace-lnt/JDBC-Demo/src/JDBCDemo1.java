import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","suhroot123");
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
