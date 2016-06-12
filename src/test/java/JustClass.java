import java.sql.*;

public class JustClass {
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/juicynet";
    private static final String user = "root";
    private static final String password = "root";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName(driver);
            System.out.println("MySQL JDBC Driver Registered!");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection!");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()){
                System.out.println(resultSet.getRow());
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection is closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
