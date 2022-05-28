import java.sql.DriverManager;  
import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class SelectTable {  
   
    private Connection connect() {  
        String url = "jdbc:sqlite:C://sqlite/db/test1.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
    public void selectAll(){  
        String sql = "SELECT * FROM Movies";  
        try {  
            Connection conn = this.connect();  
            Statement st  = conn.createStatement();  
            ResultSet rs  = st.executeQuery(sql);  
            while (rs.next()) {  
                System.out.println(rs.getInt("Mov_id") +  "\t" +  rs.getString("Movie_name") + "\t" + rs.getString("Actress") + "\t" +  rs.getInt("Year_released") + "\t" +  rs.getString("Director_name") + "\t");  
            }  
        } 
        catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  

    public static void main(String[] args) {  
        SelectTable app = new SelectTable();  
        app.selectAll();  
    }  
   
}  