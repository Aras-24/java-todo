package bibliothek;

public class Buch extends MediumAbstrakt{
    private String autor;

    public Buch(int id,String titel, int jahr, String autor) {
        super(id,titel, jahr);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
