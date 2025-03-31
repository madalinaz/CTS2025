package week4_SingletonRegistry.program;

import week4_SingletonRegistry.clase.Dish;
import week4_SingletonRegistry.clase.Oven;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========== INITIAL OVENS ===========");
        for (int i = 0; i < 4; i++) {
            System.out.println(Oven.getOvenById(i));
        }

        Dish pizza = new Dish("Pizza", 25, 350);
        Dish cake = new Dish("Cake", 40, 180);
        Dish bread = new Dish("Bread", 30, 220);
        Dish pie = new Dish("Pie", 20, 200);
        Dish tart = new Dish("Tart", 35, 160);
        Dish steak = new Dish("Steak", 50, 450);


        System.out.println("\n=========== ADDING DISHES ===========");
        try {
            Oven.addDish(pizza);
            System.out.println("[SUCCESS]: Pizza assigned.");
        } catch (RuntimeException e) {
            System.out.println("[FAILED]: " + e.getMessage());
        }

        try {
            Oven.addDish(cake);
            System.out.println("[SUCCESS]: Cake assigned.");
        } catch (RuntimeException e) {
            System.out.println("[FAILED]: " + e.getMessage());
        }

        try {
            Oven.addDish(bread);
            System.out.println("[SUCCESS]: Bread assigned.");
        } catch (RuntimeException e) {
            System.out.println("[FAILED]: " + e.getMessage());
        }

        try {
            Oven.addDish(pie);
            System.out.println("[SUCCESS]: Pie assigned.");
        } catch (RuntimeException e) {
            System.out.println("[FAILED]: " + e.getMessage());
        }

        try {
            Oven.addDish(tart);
            System.out.println("[SUCCESS]: Tart assigned.");
        } catch (RuntimeException e) {
            System.out.println("[FAILED]: " + e.getMessage());
        }

        try {
            Oven.addDish(steak); // Invalid Input
            System.out.println("[SUCCESS]: Steak assigned.");
        } catch (RuntimeException e) {
            System.out.println("[FAILED]: " + e.getMessage());
        }

        System.out.println("\n=========== FINAL OVENS ===========");
        for (int i = 0; i < 4; i++) {
            System.out.println(Oven.getOvenById(i));
        }
    }
}
