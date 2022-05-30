public class Main {
    public static void main(String[] args) {
        DatabaseHandler handler = new DatabaseHandler();

        public DatabaseHandler () {
            createConnection();
            createMemberTable();
        }

        private void createMemberTable  {
            String TABLE_NAME = "MEMBER";
            try {
                stat = conn.createStatement();
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
                    stmt.execute(statement);
                }
            }
            catch (SQLException e) {
                System.out.println(e.getMessage() + "setting up database");
            }
        }
    }
}
