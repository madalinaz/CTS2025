package s06.pattern.builder;

public class MostraAer {
    private float nivelPM2_5;
    private float nivelPM10;
    private float temperatura;
    private float umiditate;

    public MostraAer(float nivelPM2_5, float nivelPM10, float temperatura, float umiditate) {
        this.nivelPM2_5 = nivelPM2_5;
        this.nivelPM10 = nivelPM10;
        this.temperatura = temperatura;
        this.umiditate = umiditate;
    }

    public float getNivelPM2_5() {
        return nivelPM2_5;
    }

    public float getNivelPM10() {
        return nivelPM10;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public float getUmiditate() {
        return umiditate;
    }

    @Override
    public String toString() {
        return "MostraAer{" +
                "nivelPM2_5=" + nivelPM2_5 +
                ", nivelPM10=" + nivelPM10 +
                ", temperatura=" + temperatura +
                ", umiditate=" + umiditate +
                '}';
    }
}
