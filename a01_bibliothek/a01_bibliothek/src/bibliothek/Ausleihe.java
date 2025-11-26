package bibliothek;

public class Ausleihe {
    public Kunde kunde;
    public MediumAbstrakt medium;

    public Ausleihe(Kunde kunde, MediumAbstrakt medium) {
        this.kunde = kunde;
        this.medium = medium;
    }

    public void starten() {
        System.out.println(kunde.getFirstName() + kunde.getLastName() + " leiht " + medium.getTitel() + " aus.");
        medium.ausleihen();
    }

    public void beenden() {
        System.out.println(kunde.getFirstName() + kunde.getLastName() + " gibt " + medium.getTitel() + " zurück.");
        medium.zurueckgeben();
    }
}
