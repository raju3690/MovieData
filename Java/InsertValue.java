import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValue {
	
	public static void main(String[] args) {
		
		String url = "jdbc:sqlite:C://sqlite/db/test1.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
			Statement st = conn.createStatement();
			System.out.println("-----------Inserting records into the table-----------");          
			String sql = "INSERT INTO Movies VALUES (1,'Dangal', 'Amir Khan', 'Fatima Shaikh', 2016, 'Nitesh Tiwari')";
			st.executeUpdate(sql);
			sql = "INSERT INTO Movies VALUES (2, 'RRR', 'Ram Charan', 'Alia Bhatt',2022,'Rajamouli')";
			st.executeUpdate(sql);
			sql = "INSERT INTO Movies VALUES (3, 'KGF', 'Yash','Srinidhi Shetty', 2022 ,'Prashanth Neel')";
			st.executeUpdate(sql);
			sql = "INSERT INTO Movies VALUES (4, 'Beast','Vijay', 'Pooja Hegde', 2022,'Nelson Dilipkumar')";
			st.executeUpdate(sql);
			System.out.println("----------Inserted records into the table--------");   	  
      } 
		catch (SQLException e) {
			e.printStackTrace();
      } 
   }
}