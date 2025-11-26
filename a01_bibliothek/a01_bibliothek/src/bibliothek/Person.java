package bibliothek;

public class Person {
    public String firstName;
    public String lastName;
    public String Adress;

    public Person(String firstName, String lastName, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        Adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }
}
