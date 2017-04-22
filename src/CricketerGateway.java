import java.sql.*;

/**
 * Created by Admin on 4/22/2017.
 */
public class CricketerGateway {

    public ResultSet getAllCricketers() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = con.createStatement();
        ResultSet cricketers = statement.executeQuery("SELECT * from cricketer");

        return cricketers;
    }
}
