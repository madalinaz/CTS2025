package S10.flyweight.program;


import S10.flyweight.clase.FlyweightFactory;
import S10.flyweight.clase.Joc;
import S10.flyweight.clase.TipElement;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory.getElement(TipElement.BARCA).desenare(10, 10);

        //utilizand clasa Joc care retine pozitiile obiectelor adaugate in joc
        Joc joc = new Joc();
        joc.adaugaElement(TipElement.BARCA, 10, 10);
        joc.adaugaElement(TipElement.NAVA, 10, 20);
        joc.adaugaElement(TipElement.NAVA, 10, 15);
        joc.adaugaElement(TipElement.SUBMARIN, 20, 10);
        joc.adaugaElement(TipElement.BARCA, 20, 40);

        joc.afisareCanvas();
        joc.lanseazaBullet(10);
        System.out.println("\nNumar punte castigate: "+ joc.getNumarPuncte());

    }

}
