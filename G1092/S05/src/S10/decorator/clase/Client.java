package S10.decorator.clase;

public class Client {
    private String nume;
    private String gen;

    public Client(String nume, String gen) {
        this.nume = nume;
        this.gen = gen;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}
