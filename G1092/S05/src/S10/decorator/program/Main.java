package S10.decorator.program;

import S10.decorator.clase.Bon;
import S10.decorator.clase.Client;
import S10.decorator.clase.DecoratorPrimavara;
import S10.decorator.clase.IBon;

public class Main {
    public static void main(String[] args) {
        //inainte de decorator
        IBon bon = new Bon(20, new Client("client1", "M"));

        bon.printare();
        System.out.println(bon.getTotal());
        System.out.println(bon.getClient());

        //dupa decorator
        IBon bon2 = new DecoratorPrimavara(new Bon(30, new Client("client2", "F")));
//        System.out.println("printare clasica");
        bon2.printare();

        System.out.println(bon2.getTotal());

    }

}
