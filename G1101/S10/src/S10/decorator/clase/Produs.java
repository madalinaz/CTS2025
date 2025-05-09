package S10.decorator.clase;

public class Produs {
    private TipProdus tipProdus;
    private String denumireProdus;

    public Produs(TipProdus tipProdus, String denumireProdus) {
        this.tipProdus = tipProdus;
        this.denumireProdus = denumireProdus;
    }

    public TipProdus getTipProdus() {
        return tipProdus;
    }

    public String getDenumireProdus() {
        return denumireProdus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("tipProdus=").append(tipProdus);
        sb.append(", denumireProdus='").append(denumireProdus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
