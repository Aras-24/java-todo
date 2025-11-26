package bibliothek;

public class Mitarbeiter extends Person{
    public String position;
    public Mitarbeiter(String firstName, String lastName, String adress, String position) {
        super(firstName, lastName, adress);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
