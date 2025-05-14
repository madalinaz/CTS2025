package MagazinOnline.clase;

public class Pantof {
    private int marime;
    private String culoare;
    private double pret;

    public Pantof(int marime, String culoare, double pret) {
        this.marime = marime;
        this.culoare = culoare;
        this.pret = pret;
    }

    public int getMarime() {

        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "marime='" + marime + '\'' +
                ", culoare='" + culoare + '\'' +
                ", pret=" + pret +
                '}';
    }
}
