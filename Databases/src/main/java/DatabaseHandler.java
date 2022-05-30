import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHandler<url> {
    private static final String DB = null;

    private void createConnection() {
        try {
            Class.forName("class name here");
            String DB_url = null;
            assert false;
            Connection conn = DriverManager.getConnection(DB_url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

