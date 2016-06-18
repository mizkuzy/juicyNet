package javacode;

import java.sql.*;

public class JustClass {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/juicynet";
    private static final String user = "root";
    private static final String password = "root";
    //TODO как автоматически генерить айдишники?

    /*    public static void main(String[] args) {
            try (Connection connection= DriverManager.getConnection(url, user, password);
                 Statement statement = connection.createStatement()){

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(driver);
            System.out.println("MySQL JDBC Driver Registered!");
            connection.setAutoCommit(false);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection!");
            statement = connection.createStatement();

            /*statement.execute("create table user(" +
                    "id integer primary key auto_increment, " +
                    "name varchar(100));");*/
            /**
             * create entry
             */
            /*statement.execute("INSERT INTO users(iduser, name, surname, login, pswd) " +
                    "VALUES (3,'hatasha','lepet','nata','pswd')," +
                    "(4,'sasha','gulkin','sas','pswd')");*/
            String sqlStatement = "INSERT INTO users(iduser, name, surname, login, pswd) " +
                    "VALUES (?,?,?,?,?)";
            preparedStatement = connection
                    .prepareStatement(sqlStatement);
            int i = 0;
            int lastID = 4;
            preparedStatement.setInt(++i, ++lastID);
            preparedStatement.setString(++i, "misha");
            preparedStatement.setString(++i, "shushu");
            preparedStatement.setString(++i, "shumi");
            preparedStatement.setString(++i, "pswd");
            preparedStatement.addBatch();
            /**
             * if statement only one you can use preparedStatement.executeUpdate()
             */
            //preparedStatement.executeUpdate();

            i = 0;
            preparedStatement.setInt(++i, ++lastID);
            preparedStatement.setString(++i, "agata");
            preparedStatement.setString(++i, "rudkova");
            preparedStatement.setString(++i, "heyho");
            preparedStatement.setString(++i, "pswd");
            preparedStatement.addBatch();

            System.out.println(preparedStatement.executeBatch().length);

            /**
             * get all entries from table
             */
            resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                System.out.print("Row " + resultSet.getRow());
                System.out.print(" " + resultSet.getString(2));
                System.out.print(" " + resultSet.getString(3));
                System.out.println(" " + resultSet.getString(4));
            }
            connection.commit();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connection is closed");
                }
                if (statement != null) {
                    statement.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
