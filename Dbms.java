import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbms {

    public static void main(String[] args) {
   
        String url = "jdbc:mysql://localhost:3306/mydatabase";

        String user = "root";

        String password = "AMANTHAKUR";

        Connection connection = null;

        try {
     
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection to database successful!");

     

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Include it in your library path."+e);
          
        } catch (SQLException e) {
            System.out.println("Connection failed. Check output console.");
            e.printStackTrace();
        } finally {
        
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
