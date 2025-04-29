package proxy.clase;

public class Vizitator {
    private String nume;

    public Vizitator(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return "Vizitator{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
