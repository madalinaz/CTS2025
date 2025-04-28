package S09_Composite.program;

import S09_Composite.models.Colet;
import S09_Composite.models.INod;
import S09_Composite.models.NodStructura;

public class Main {
    public static void main(String[] args) {
        INod container = new NodStructura(10);
        INod cutie1 = new NodStructura(10);
        INod cutie2 = new NodStructura(15);
        INod colet1 = new Colet(20, false);
        INod colet2 = new Colet(8, true);

        container.addNod(cutie1);
        container.addNod(cutie2);
        cutie1.addNod(colet1);
        cutie1.addNod(colet2);

        System.out.println(container.esteFragil());
        System.out.println("Greutate Container: " + container.getGreutate());
    }
}
