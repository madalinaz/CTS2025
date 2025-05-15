package S10_Adapter.clase;

public class AdapterXYZ2Emag implements IEvaluareClient {
    private CalculReducereEmag calculReducereEmag;

    public AdapterXYZ2Emag() {
        this.calculReducereEmag = new CalculReducereEmag();
    }

    @Override
    public double acordaDiscount(double suma) {
        // Arata ca XYZ, dar are logica de Emag
        System.out.println("Se pare ca calculeaza XYZ dar ...");
        return calculReducereEmag.getReducere(new Client("John Doe", suma));
    }
}
