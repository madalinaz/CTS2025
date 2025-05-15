package S10_FlyWeight.models;

// Forma geometrica se deseneaza la anumite coordonate
public class FormaGeometrica implements IDesenare {
    private TipForma tipForma;
    private String detaliiDesenare;

    public FormaGeometrica(TipForma tipForma, String detaliiDesenare) {
        this.tipForma = tipForma;
        this.detaliiDesenare = detaliiDesenare;
    }

    @Override
    public void desenare(int x, int y) {
        System.out.println("S-a desenat " + tipForma.toString() + " la coordonatele: " + x + ", " + y);
    }
}
