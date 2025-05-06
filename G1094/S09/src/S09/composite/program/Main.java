package S09.composite.program;


import S09.composite.clase.INod;
import S09.composite.clase.Item;
import S09.composite.clase.NodStructura;

public class Main {
    public static void main(String[] args) {
        INod meniu=new NodStructura("meniu2");
        INod nod1=new NodStructura("aperitiv");
        INod nod2=new NodStructura("fel principal");
        INod nod3=new Item("rulou cu sunca",300,true);
        INod nod4=new Item("friptura",550,true);
        INod nod5=new Item("piure",275,true);
        INod nod6=new Item("bruscheta",350,true);
        meniu.addNod(nod1);
        meniu.addNod(nod2);
        nod1.addNod(nod3);
        nod2.addNod(nod4);
        nod2.addNod(nod5);
        nod1.addNod(nod6);
        System.out.println(meniu.getNrCalorii());
        System.out.println(meniu.isBio());
    }
}
