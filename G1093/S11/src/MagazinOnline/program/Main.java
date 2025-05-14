package MagazinOnline.program;

import MagazinOnline.clase.*;
import MagazinOnline.clase.facade.Facade;
import MagazinOnline.clase.strategy.Client;
import MagazinOnline.clase.strategy.IStrategy;
import MagazinOnline.clase.strategy.StrategieCautareAuto;
import MagazinOnline.clase.strategy.StrategieCautareManuala;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pantof pantof = new Pantof(38, "alb", 100);
        Pantof pantof1 = new Pantof(36, "negru", 200);
        Pantof pantof2 = new Pantof(38, "roz", 300);
        Pantof pantof3 = new Pantof(38, "roz", 350);
        Pantof pantof4 = new Pantof(38, "roz", 100);
        Pantof pantof5 = new Pantof(38, "negru", 200);
        List<Pantof> listaPantofi=new ArrayList<Pantof>();
        listaPantofi.add(pantof);
        listaPantofi.add(pantof1);
        listaPantofi.add(pantof2);
        listaPantofi.add(pantof3);
        listaPantofi.add(pantof4);
        listaPantofi.add(pantof5);

        ICautare cautare=new Cautare(true, true, true, "roz", 120, 38);

        //responsabili concreti
        AHandler h1=new FiltrareCuloare();
        AHandler h2=new FiltrarePret();
        AHandler h3=new FiltrareMarime();

        //creare lant responsabili
        h1.setNextHandler(h2);
        h2.setNextHandler(h3);

        System.out.println((h1.filtrare(listaPantofi,cautare)));



        //facade
        System.out.println("\n----------------------FACADE----------------------");
        Facade facade=new Facade(h1,h2,h3);
        facade.addPantof(pantof);
        facade.addPantof(pantof1);
        facade.addPantof(pantof2);
        facade.addPantof(pantof3);
        facade.addPantof(pantof4);
        facade.addPantof(pantof5);
        facade.filtrare(cautare);

        //strategy
        System.out.println("\n--------------STRATEGY--------------------");
        Client client=new Client("Andrei");
        IStrategy strategie=new StrategieCautareAuto();
        client.setStrategie(strategie);
       // client.getCautare();
        facade.filtrare(client.getCautare());

        Client client1=new Client("Anda");
        client1.setStrategie(new StrategieCautareManuala());
        facade.filtrare(client1.getCautare());

    }
}