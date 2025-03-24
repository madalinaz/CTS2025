package S05.program;

import S05.clase.*;


public class Main {
    public static void main(String[] args) {
        IFactory factory = PreparatFactory.getInstance(3);
        Preparat paste = factory.crearePreparat(TipPreparat.PASTE,"paste tip A");
        Preparat pizza1 = factory.crearePreparat(TipPreparat.PIZZA,"pizza tip AA");
        Preparat pizza2 = factory.crearePreparat(TipPreparat.PIZZA,"pizza tip AA");
        paste.afisare();
        pizza1.afisare();
        pizza2.afisare();
        Preparat pizza3 = factory.crearePreparat(TipPreparat.PIZZA,"pizza tip AA");
        IFactory factory2 = PreparatFactory.getInstance(5);
        Preparat pizza4 = factory2.crearePreparat(TipPreparat.PIZZA,"pizza tip AA");
        pizza4.afisare();

    }
}