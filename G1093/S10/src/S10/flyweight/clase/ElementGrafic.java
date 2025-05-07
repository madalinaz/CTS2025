package S10.flyweight.clase;

public class ElementGrafic implements IElementGrafic{
    private TipGrafic tipGrafic;
    private String detaliiDesenare;

    public ElementGrafic(TipGrafic tipGrafic, String detaliiDesenare) {
        this.tipGrafic = tipGrafic;
        this.detaliiDesenare = detaliiDesenare;
    }

    public String getDetaliiDesenare() {
        return detaliiDesenare;
    }

    @Override
    public void deseneaza(int x, int y) {
        System.out.println("Se deseneaza "+this.tipGrafic+ " la coordonatele "+ x+"  "+ y);
    }
}
