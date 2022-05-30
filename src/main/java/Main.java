import java.sql.*;
import java.util.concurrent.Executor;

public class Main {
    public static <createMemberTable> void main() {
        DatabaseHandler handler = new DatabaseHandler();

        Main DatabaseHandler; {
            createConnection();
            createMemberTable();
        }

        Main DataConnection; {
            String TABLE_NAME = "MEMBER";
            try {
                Connection conn = null;
                assert false;
                Statement stat = conn.createStatement();
                DatabaseMetaData dmm = conn.getMetaData ();
                ResultSet tables = dmm.getTables (null, null, TABLE_NAME, null);
                if (tables.next()) {
                    System.out.println("Table" + TABLE_NAME + "already exists");
                }
                else {
                    String statement = "CREATE TABLE" + TABLE_NAME + "("
                            + "id varchar(200) primary key, \n"
                            + "name varchar(200), \n"
                            + "email varchar(200), \n"
                            + "nickName varchar(200))";
                    System.out.println(statement);
                    Executor stmt = null;
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage() + "setting up database");
            }
        }
    }

    private static void createMemberTable() {
    }

    private static void createConnection() {
    }
}
