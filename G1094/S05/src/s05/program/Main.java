package s05.program;

import s05.clase.*;
import s05.exceptii.ExceptieId;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //fara factory
        Preparat preparat1 = new Burger(12,"Burger tip A","vita");
        Preparat preparat2 = new Pizza(13,"pizzaA",23,false);
        Preparat preparat3=new Pizza(13,"pizzaB",30,true);
        preparat1.afisare();
        preparat2.afisare();
        preparat3.afisare();

        //cu factory
        //PreparatFactory factory = new PreparatFactory();
        PreparatFactory factorySingleton = PreparatFactory.getInstance(2);
        Preparat preparat4 = null;
        Preparat preparat5 = null;
        Preparat preparat6 = null;
        try {
            preparat4 = factorySingleton.crearePreparat(TipPreparat.BURGER,14,"BurgerT");
            preparat5 = factorySingleton.crearePreparat(TipPreparat.BURGER,15,"BurgerC");
            preparat6 = factorySingleton.crearePreparat(TipPreparat.BURGER,16,"BurgerC");
            preparat4.afisare();
            preparat5.afisare();
        } catch (ExceptieId e) {
            System.out.println("Obj nu au putut fi create");
        }

        PreparatFactory factorySingleton2 = PreparatFactory.getInstance(7);

        try {
            preparat6 = factorySingleton2.crearePreparat(TipPreparat.BURGER,16,"BurgerC");
            preparat6.afisare();
        } catch (ExceptieId e) {
            System.out.println("Obj nu au putut fi create");
        }

    }
}