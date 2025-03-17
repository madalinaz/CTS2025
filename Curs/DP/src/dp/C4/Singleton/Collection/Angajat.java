package dp.C4.Singleton.Collection;

public class Angajat {
    private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
