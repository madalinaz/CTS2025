package dp.C5.prototype.pbSticker.clase;

public class Sticker implements  Cloneable{
    private String listaDimensiuni;
    private String culoare;

    Sticker(Masina m){
        //fara "simulare" api prin singleton
        System.out.println("Apel surse externe pentru "+m.getCodUnic());
        this.listaDimensiuni = "lista dimensiuni " + m.getCodUnic();

        //cu singleton
        //this.listaDimensiuni=API.getInstance().getListaDimensiuni(m.getCodUnic());
        this.culoare="Default";
    }

    @Override
    public String toString() {
        return "Sticker{" +
                "listaDimensiuni='" + listaDimensiuni + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }

    @Override
    protected Sticker clone() throws CloneNotSupportedException {
        Sticker clona = (Sticker) super.clone();
        clona.listaDimensiuni = new String(this.listaDimensiuni);
        //clona.culoare = new String(this.culoare);
        clona.culoare = culoare;
        return clona;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
}
