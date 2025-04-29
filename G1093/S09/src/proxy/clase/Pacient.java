package proxy.clase;

public class Pacient {
    private String nume;
    private String dataInternare;

    public Pacient(String nume, String dataInternare) {
        this.nume = nume;
        this.dataInternare = dataInternare;
    }

    public String getNume() {
        return nume;
    }

    public String getDataInternare() {
        return dataInternare;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", dataInternare='" + dataInternare + '\'' +
                '}';
    }
}
