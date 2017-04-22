import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 4/22/2017.
 */
public class GameMapper {

    private FootballerGateway footballerGateway = new FootballerGateway();
    private CricketerGateway cricketerGateway = new CricketerGateway();

    public synchronized List<Player> getAllPlayers() throws ClassNotFoundException {
        List<Player> players = new ArrayList<Player>();
        ResultSet rsFootballers;
        ResultSet rsCricketers;
        try {
            rsFootballers = footballerGateway.getAllFootballers();
            while (rsFootballers.next()) {

                int id = rsFootballers.getInt("id");
                String club = rsFootballers.getString("club");

                Footballer footballer = new Footballer();
                footballer.setId(id);
                footballer.setClub(club);

                players.add(footballer);
            }
        } catch (SQLException e) {
        }

        try {
            rsCricketers = cricketerGateway.getAllCricketers();
            while (rsCricketers.next()) {

                int id = rsCricketers.getInt("id");
                int ba = rsCricketers.getInt("battling_average");

                Cricketer cricketer = new Cricketer();
                cricketer.setId(id);
                cricketer.setBattingAverage(ba);

                players.add(cricketer);
            }
        } catch (SQLException e) {
        }
        return players;
    }
}
