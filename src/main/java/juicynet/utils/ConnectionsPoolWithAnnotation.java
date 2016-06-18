package juicynet.utils;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//todo не работает
public class ConnectionsPoolWithAnnotation {

    @Resource(name="jdbc/juicynet")
    private static DataSource ds;

    public static Connection getConnection() throws SQLException{
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  null;
    }

    public static CharSequence getTestDatesWithAnnot() throws SQLException {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        StringBuilder stringBuilder = new StringBuilder();
        while (rs.next()) {
            stringBuilder.append(rs.getRow()).append(" ")
                    .append(rs.getString(2)).append(" ")
                    .append(rs.getString(3))
                    .append("\r\n");
        }
        rs.close();
        stmt.close();
        return stringBuilder;
    }
}
