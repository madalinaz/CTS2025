package S09.Composite.program;


import S09.Composite.clase.INod;
import S09.Composite.clase.Item;
import S09.Composite.clase.NodStructura;

public class Main {
    public static void main(String[] args) {
        INod meniu = new NodStructura("Meniu nr. 2");
        INod nod1 = new NodStructura("Aperitiv");
        INod nod2 = new NodStructura("Desert");

        INod nod3 = new Item("Rulou Cascaval", 150, false);
        INod nod4 = new Item("Friptura", 340, false);
        INod nod5 = new Item("Piure", 120, true);
        INod nod6 = new Item("Tort", 520, true);

        meniu.addNod(nod1);
        meniu.addNod(nod2);
        nod1.addNod(nod3);
        nod1.addNod(nod4);
        nod1.addNod(nod5);
        nod2.addNod(nod6);
        System.out.println(meniu.getNumarCalorii());
        System.out.println(meniu.isVegan());
    }
}