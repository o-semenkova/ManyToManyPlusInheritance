import java.sql.*;

/**
 * Created by Admin on 4/22/2017.
 */
public class FootballerGateway {

    public ResultSet getAllFootballers() throws SQLException, ClassNotFoundException {
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
        ResultSet footballers = statement.executeQuery("SELECT * from footballer");

        return footballers;
    }
}
