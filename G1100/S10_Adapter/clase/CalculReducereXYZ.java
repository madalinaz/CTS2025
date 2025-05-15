package S10_Adapter.clase;

public class CalculReducereXYZ implements IEvaluareClient {
    @Override
    public double acordaDiscount(double suma) {
        if (suma > 100) {
            return 0.25;
        }
        return 0;
    }
}
