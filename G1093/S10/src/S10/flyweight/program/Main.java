package S10.flyweight.program;


import S10.flyweight.clase.Canvas;
import S10.flyweight.clase.ElementeGraficeFactory;
import S10.flyweight.clase.TipGrafic;

public class Main {
    public static void main(String[] args) {
        ElementeGraficeFactory.getElementGrafic(TipGrafic.ASTEROID).deseneaza(10,10);
        Canvas canvas=new Canvas();
        canvas.addElementGrafic(TipGrafic.AVION, 10, 20);
        canvas.addElementGrafic(TipGrafic.AVION, 10, 30);
        canvas.addElementGrafic(TipGrafic.AVION, 20, 10);
        canvas.afisareCoordonate();
    }
}
