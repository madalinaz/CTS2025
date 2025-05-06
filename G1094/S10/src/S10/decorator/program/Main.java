package S10.decorator.program;


import S10.decorator.clase.Comanda;
import S10.decorator.clase.DecoratorReducere;
import S10.decorator.clase.IComanda;
import S10.decorator.clase.Produs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //inainte de decorator

        List<Produs> lista = new ArrayList<>();
        lista.add(new Produs("Frigider",900));
        lista.add(new Produs("Cuptor",10));

        IComanda comanda = new Comanda(1, lista);

        comanda.printare();

        //dupa decorator
        IComanda comandaDecorata = new DecoratorReducere(comanda);
        comandaDecorata.printare();

        IComanda comandaDecorata2 = new DecoratorReducere(comanda);
        comandaDecorata.printare();

        DecoratorReducere.setPragMinim(1100);

        IComanda comandaDecorata3 = new DecoratorReducere(comanda);
        comandaDecorata.printare();





    }
};