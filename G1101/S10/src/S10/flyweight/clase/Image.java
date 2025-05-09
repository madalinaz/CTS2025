package S10.flyweight.clase;

public class Image implements IImage{
    private String detaliiDesenareImagine; //aici sunt date mari
    public TipImagine tipImagine;

    public Image(String detaliiDesenareImagine, TipImagine tipImagine) {
        this.detaliiDesenareImagine = detaliiDesenareImagine;
        this.tipImagine = tipImagine;
    }

    @Override
    public void desenare(int x, int y) {
        System.out.println("Se deseneaza " + this.tipImagine + " la (" + x + ", " + y + ")");
    }
}
