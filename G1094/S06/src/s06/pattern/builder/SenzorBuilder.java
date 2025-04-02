package s06.pattern.builder;

public class SenzorBuilder implements AbstractBuilder{
    //private Senzor senzor;

    private boolean areNivelPM2_5;
    private boolean areNivelPM10;
    private boolean areNivelTemperatura;
    private boolean areNivelUmiditate;

    //zona obligatorie este manifestata in constructor
    public SenzorBuilder(){

    }

    //setteri in format builder pentru fiecare camp optional


    public SenzorBuilder setAreNivelPM2_5(boolean areNivelPM2_5) {
        this.areNivelPM2_5 = areNivelPM2_5;
        return this;
    }

    public SenzorBuilder setAreNivelPM10(boolean areNivelPM10) {
        this.areNivelPM10 = areNivelPM10;
        return this;
    }

    public SenzorBuilder setAreNivelTemperatura(boolean areNivelTemperatura) {
        this.areNivelTemperatura = areNivelTemperatura;
        return this;
    }

    public SenzorBuilder setAreNivelUmiditate(boolean areNivelUmiditate) {
        this.areNivelUmiditate = areNivelUmiditate;
        return this;
    }

    private void resetare(){
        this.areNivelPM2_5=false;
        this.areNivelPM10=false;
        this.areNivelTemperatura=false;
        this.areNivelUmiditate=false;
    }

    @Override
    public Senzor build() {
        Senzor senzor = new Senzor(areNivelPM2_5,areNivelPM10,areNivelTemperatura,areNivelUmiditate);
        resetare();
        return senzor;
    }
}
