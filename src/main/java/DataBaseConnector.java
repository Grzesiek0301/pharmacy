import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnector {

    public static Connection connection() {

        try {
            String DBURL = "jdbc:mysql://localhost:3306/Pharmacy";
            String DBUSER = "root";
            String DBPASS = "";
            String DBDRIVER = "com.mysql.jdbc.Driver";
            Class.forName(DBDRIVER);
            Connection connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            return connection;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
