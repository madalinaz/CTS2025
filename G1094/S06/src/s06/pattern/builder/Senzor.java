package s06.pattern.builder;

public class Senzor implements  AbstractAirQualitySenzor{
    private boolean areNivelPM2_5;
    private boolean areNivelPM10;
    private boolean areNivelTemperatura;
    private boolean areNivelUmiditate;

    @Override
    public void afisareDetalii(MostraAer mostraAer) {
        System.out.println("Mostra aer cu urmatoarele calitati: ");
        if(areNivelUmiditate)
            System.out.println("Umiditate: " +mostraAer.getUmiditate());
        if(areNivelPM2_5)
            System.out.println("PM 2.5: " +mostraAer.getNivelPM2_5());
        if(areNivelPM10)
            System.out.println("PM 10: " +mostraAer.getNivelPM10());
        if(areNivelTemperatura)
            System.out.println("Temperatura: " +mostraAer.getTemperatura());
    }

    Senzor(boolean areNivelPM2_5, boolean areNivelPM10, boolean areNivelTemperatura, boolean areNivelUmiditate) {
        this.areNivelPM2_5 = areNivelPM2_5;
        this.areNivelPM10 = areNivelPM10;
        this.areNivelTemperatura = areNivelTemperatura;
        this.areNivelUmiditate = areNivelUmiditate;
    }

    @Override
    public String toString() {
        return "Senzor{" +
                "areNivelPM2_5=" + areNivelPM2_5 +
                ", areNivelPM10=" + areNivelPM10 +
                ", areNivelTemperatura=" + areNivelTemperatura +
                ", areNivelUmiditate=" + areNivelUmiditate +
                '}';
    }
}
