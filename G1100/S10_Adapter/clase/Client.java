package S10_Adapter.clase;

public class Client {
    private String nume;
    private double totalAchizitie;

    public Client(String nume, double totalAchizitie) {
        this.nume = nume;
        this.totalAchizitie = totalAchizitie;
    }

    public String getNume() {
        return nume;
    }

    public double getTotalAchizitie() {
        return totalAchizitie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", totalAchizitie=").append(totalAchizitie);
        sb.append('}');
        return sb.toString();
    }
}
