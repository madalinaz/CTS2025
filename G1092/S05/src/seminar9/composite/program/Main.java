package seminar9.composite.program;

import seminar9.composite.clase.Colet;
import seminar9.composite.clase.INod;
import seminar9.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        INod container = new Structura(10);
        INod cutie = new Structura(23);
        INod cutie2 = new Structura(2);
        INod subcutie = new Structura(5);

        INod colet1 = new Colet(5, false);
        INod colet2 = new Colet(5, false);
        INod colet3 = new Colet(5, false);
        INod colet4 = new Colet(5, false);
        INod colet5 = new Colet(5, false);

        container.adaugaNod(cutie);
        container.adaugaNod(cutie2);
        cutie.adaugaNod(subcutie);
        cutie2.adaugaNod(colet1);
        cutie2.adaugaNod(colet2);
        cutie2.adaugaNod(colet3);
        subcutie.adaugaNod(colet4);
        subcutie.adaugaNod(colet5);

        System.out.println(container.getGreutate());

    }
}
