package bibliothek;

public class Dvd extends MediumAbstrakt{
    private int dauer;


    public Dvd(int id,String titel, int jahr, int dauer) {
        super(id,titel, jahr);
        this.dauer = dauer;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }
}
