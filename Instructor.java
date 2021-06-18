public class Instructor extends User{

    private String bolum;
    private String telefon;

    public Instructor(int id, String name, String bolum, String telefon) {
        super(id, name);
        this.bolum = bolum;
        this.telefon = telefon;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
