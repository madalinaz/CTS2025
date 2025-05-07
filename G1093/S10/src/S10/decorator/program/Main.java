package S10.decorator.program;


import S10.decorator.clase.Bon;
import S10.decorator.clase.DecoratorFebruarie;
import S10.decorator.clase.IBon;

public class Main {
    public static void main(String[] args) {
        //inainte de decorator

        IBon bon1=new Bon("10/10/2020", 460);

        bon1.printare();
        //decorator februarie
        IBon bon2=new Bon("10/10/2020", 550);
        IBon bonDecorat=new DecoratorFebruarie(bon2);

        bonDecorat.printare();

    }
}