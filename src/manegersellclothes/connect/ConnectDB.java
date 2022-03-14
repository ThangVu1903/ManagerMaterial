
package manegersellclothes.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection JDBC_CONECTION() {
        final String Url = "jdbc:mysql://localhost:3306/managersellclothes";
        final String user = "root";
        final String password = "19032002az";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(Url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
      return null;
    }
    
}
