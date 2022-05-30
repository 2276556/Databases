public class DatabaseHandler {
    private static final String DB url = "url here"
    private static Connection conn = null;
    private static Statement = null;
}

public DatabaseHandler() {
    createConnection();
}

private void createConnection() {
    try {
        Class.forName("class name here");
        conn = DriverManager.getConnection(DB_url);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
