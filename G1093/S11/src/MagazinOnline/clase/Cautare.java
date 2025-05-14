package MagazinOnline.clase;

public class Cautare implements ICautare{
    private boolean isFiltruCuloare;
    private boolean isFiltruPret;
    private boolean isFiltruMarime;
    private String culoare;
    private double pret;
    private int marime;

    public Cautare(boolean isFiltruCuloare, boolean isFiltruPret, boolean isFiltruMarime, String culoare, double pret, int marime) {
        this.isFiltruCuloare = isFiltruCuloare;
        this.isFiltruPret = isFiltruPret;
        this.isFiltruMarime = isFiltruMarime;
        this.culoare = culoare;
        this.pret = pret;
        this.marime = marime;
    }


    @Override
    public boolean isFiltruCuloare() {
        return this.isFiltruCuloare;
    }

    @Override
    public boolean isFiltruMarime() {
        return this.isFiltruMarime;
    }

    @Override
    public boolean isFiltruPret() {
        return this.isFiltruPret;
    }

    @Override
    public String getCuloare() {
        return this.culoare;
    }

    @Override
    public double getPretMinim() {
        return this.pret;
    }

    @Override
    public int getMarime() {
        return this.marime;
    }
}
