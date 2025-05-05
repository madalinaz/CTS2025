package S10.flyweight.clase;

public class FormaGeometrica implements IDesenare{
    private String denumire;
    private String detaliiObiectGrafic;

    public FormaGeometrica(String denumire, String detaliiObiectGrafic) {
        this.denumire = denumire;
        this.detaliiObiectGrafic = detaliiObiectGrafic;
    }

    @Override
    public void desenare(int x, int y) {
        System.out.println("s-a printat " + this.denumire + " la (" + x + ", " + y + ")");
    }
}
