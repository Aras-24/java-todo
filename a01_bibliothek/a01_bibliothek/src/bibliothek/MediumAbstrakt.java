package bibliothek;

import java.util.Objects;

public class MediumAbstrakt  implements Ausleihbar{
    private int id;
    private String titel;
    private int jahr;
    private boolean ausgeliehen = false;

    public MediumAbstrakt(int id, String titel, int jahr) {
        this.id = id;
        this.titel = titel;
        this.jahr = jahr;
    }

    public String getTitel() {
        return titel;
    }

    public int getJahr() {
        return jahr;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MediumAbstrakt that = (MediumAbstrakt) o;
        return id == that.id && jahr == that.jahr && ausgeliehen == that.ausgeliehen && Objects.equals(titel, that.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titel, jahr, ausgeliehen);
    }

    @Override
    public void ausleihen() {
        if (!ausgeliehen) {
            ausgeliehen = true;
            System.out.println(titel + " wurde ausgeliehen.");
        } else {
            System.out.println(titel + " ist bereits ausgeliehen.");
        }

    }

    @Override
    public void zurueckgeben() {
        ausgeliehen = false;
        System.out.println(titel + " wurde zurückgegeben.");
    }

    @Override
    public boolean istAusgeliehen() {
        return ausgeliehen;
    }
}
