import java.util.Objects;

public class Actor extends Person{
    int height;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height && name.equals(actor.name) && surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }

    public Actor(String name, String surname, Gender gender, int height){
        super (name, surname, gender);
        this.height = height;
    }
}
