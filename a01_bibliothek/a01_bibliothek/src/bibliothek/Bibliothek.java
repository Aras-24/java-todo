package bibliothek;
import java.util.ArrayList;

public class Bibliothek {

    private ArrayList<MediumAbstrakt> medien = new ArrayList<>();

    public void mediumHinzufuegen(MediumAbstrakt m) {
        medien.add(m);
    }

    public void alleMedienAnzeigen() {
        for (MediumAbstrakt m : medien) {
            System.out.println(m.getTitel() + " (" + m.getJahr() + ")");
        }
    }
}
