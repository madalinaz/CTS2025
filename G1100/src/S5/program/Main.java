package S5.program;

import S5.clase.Masa;
import S5.clase.Restaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = Restaurant.getInstance();
        Restaurant restaurant2 = Restaurant.getInstance();

        if(restaurant1 == restaurant2)
            System.out.println("Referinte identice");
        else
            System.out.println("Referintele nu sunt identice");

        restaurant1.addMasa(new Masa(1,4,true));
        restaurant1.addMasa(new Masa(2,3,true));
        restaurant1.addMasa(new Masa(3,5,true));
        restaurant1.addMasa(new Masa(4,4,true));
        restaurant2.addMasa(new Masa(5,4,false));

        System.out.println(restaurant1);

        //utilizare singleton de catre "ospatar"
        System.out.println(restaurant1.getMasa(true,5));


    }
}