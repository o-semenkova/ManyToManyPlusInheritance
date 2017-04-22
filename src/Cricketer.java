import java.util.Objects;

/**
 * Created by Admin on 4/22/2017.
 */
public class Cricketer extends Player {

    private int id;
    private int battingAverage;

    public Cricketer(int id, String name, int id1, int battingAverage) {
        super(id, name);
        this.id = id1;
        this.battingAverage = battingAverage;
    }

    public Cricketer() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(int battingAverage) {
        this.battingAverage = battingAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cricketer)) return false;
        if (!super.equals(o)) return false;
        Cricketer cricketer = (Cricketer) o;
        return id == cricketer.id &&
                Double.compare(cricketer.battingAverage, battingAverage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, battingAverage);
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "id=" + id +
                ", battingAverage=" + battingAverage +
                '}';
    }
}
