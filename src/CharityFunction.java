import java.util.Objects;

/**
 * Created by Admin on 4/22/2017.
 */
public class CharityFunction {

    private int id;
    private String name;

    public CharityFunction(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public CharityFunction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharityFunction)) return false;
        CharityFunction that = (CharityFunction) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "CharityFunction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
