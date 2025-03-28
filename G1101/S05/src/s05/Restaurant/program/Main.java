package s05.Restaurant.program;

import s05.Restaurant.clase.Restaurant;
import s05.Restaurant.clase.Masa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant1 = Restaurant.getInstance();
        Restaurant restaurant2 = Restaurant.getInstance();

        if(restaurant1 == restaurant2)
            System.out.println("Obj identice");
        else
            System.out.println("Obj diferite");

        //utilizare Singleton pentru management centralizat
        restaurant1.addMasa(new Masa(1,5,true,true));
        restaurant1.addMasa(new Masa(2,5,true,true));
        restaurant1.addMasa(new Masa(3,2,true,true));
        restaurant2.addMasa(new Masa(4,5,true,true));

        System.out.println(restaurant1);
        System.out.println(restaurant1.getMasaLibera(3,true));
    }
}