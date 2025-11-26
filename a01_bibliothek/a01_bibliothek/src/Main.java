import bibliothek.*;

public class Main {
    public static void main(String[] args) {

        Bibliothek bib = new Bibliothek();

        Buch buch1 = new Buch(0001,"Harry Potter", 1997, "J.K. Rowling");
        Dvd dvd1 = new Dvd(0001,"Inception", 2010, 148);

        bib.mediumHinzufuegen(buch1);
        bib.mediumHinzufuegen(dvd1);

        bib.alleMedienAnzeigen();

        Kunde kunde = new Kunde("Aras", "Adaib","Wieland 42");
        Ausleihe ausleihe1 = new Ausleihe(kunde, buch1);

        ausleihe1.starten();
        ausleihe1.beenden();
    }
}

