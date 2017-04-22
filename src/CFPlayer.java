import java.util.Objects;

/**
 * Created by Admin on 4/22/2017.
 */
public class CFPlayer {

    private int cf_id;
    private int player_id;
    private String value;

    public CFPlayer(int cf_id, int player_id, String value) {
        this.cf_id = cf_id;
        this.player_id = player_id;
        this.value = value;
    }

    public CFPlayer() {
    }

    public int getCf_id() {
        return cf_id;
    }

    public void setCf_id(int cf_id) {
        this.cf_id = cf_id;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CFPlayer)) return false;
        CFPlayer cfPlayer = (CFPlayer) o;
        return cf_id == cfPlayer.cf_id &&
                player_id == cfPlayer.player_id &&
                Objects.equals(value, cfPlayer.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf_id, player_id, value);
    }

    @Override
    public String toString() {
        return "CFPlayer{" +
                "cf_id=" + cf_id +
                ", player_id=" + player_id +
                ", value='" + value + '\'' +
                '}';
    }
}
