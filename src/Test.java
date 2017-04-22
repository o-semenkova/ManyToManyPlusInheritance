import java.util.List;

/**
 * Created by Admin on 4/22/2017.
 */
public class Test {
    public static void main(String args[]){

        Player player = new Footballer();
        List<Player> players = player.getPlayers();
        for(Player p: players){
            System.out.println(p.toString());
        }
    }
}
