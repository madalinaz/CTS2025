package S10.flyweight.clase;

public class Element implements IElement{
    private TipElement tipElement;
    private String bitmapElement;

    public Element(TipElement tipElement, String bitmapElement) {
        this.tipElement = tipElement;
        this.bitmapElement = bitmapElement;
    }

    @Override
    public void desenare(int x, int y) {
        System.out.println("Se deseneaza " + tipElement + " la coordonatele " + x + ", " + y);
    }
}
