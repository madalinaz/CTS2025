package s05.program;
import s05.clase.*;


public class Main {
    public static void main(String[] args) {
        IFactory fabrica = FabricaProdus.getInstance(10);
        IProdus p1 = fabrica.creareProdus(TipProdus.PIZZA, "Pizza");
        IProdus p2 = fabrica.creareProdus(TipProdus.BURGER, "Burger");
        IProdus p3 = fabrica.creareProdus(TipProdus.BURGER, "Burger2");
        IProdus p4 = fabrica.creareProdus(TipProdus.PIZZA, "Pizza2");

        p1.getDescriere();
        p2.getDescriere();
        p3.getDescriere();
        p4.getDescriere();
    }
}