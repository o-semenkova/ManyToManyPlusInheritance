import java.util.Objects;

/**
 * Created by Admin on 4/22/2017.
 */
public class Footballer extends Player {

    private int id;
    private String club;

    public Footballer(int id, String name, int id1, String club) {
        super(id, name);
        this.id = id1;
        this.club = club;
    }

    public Footballer() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Footballer)) return false;
        if (!super.equals(o)) return false;
        Footballer that = (Footballer) o;
        return id == that.id &&
                Objects.equals(club, that.club);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, club);
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "id=" + id +
                ", club='" + club + '\'' +
                '}';
    }
}
