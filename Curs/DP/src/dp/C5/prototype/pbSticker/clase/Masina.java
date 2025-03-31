package dp.C5.prototype.pbSticker.clase;

public class Masina implements  IMasina{
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModelMasina() {
        return this.model;
    }

    @Override
    public int getAnFabricatie() {
        return this.anFabricatie;
    }

    public String getCodUnic(){
        return this.model + "-" + this.anFabricatie;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
