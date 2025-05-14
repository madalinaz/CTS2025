package MagazinOnline.clase.strategy;

import MagazinOnline.clase.Cautare;
import MagazinOnline.clase.ICautare;

import java.util.Scanner;

public class StrategieCautareManuala implements IStrategy {
    @Override
    public ICautare getCautare() {
        int marime=0;
        String culoare=null;
        double pret=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Se aplica filtrul de culoare? false/true");
        boolean isCuloare= Boolean.parseBoolean(sc.nextLine());
        System.out.println("Se aplica filtrul de pret? false/true");
        boolean isPret=Boolean.parseBoolean(sc.nextLine());
        System.out.println("Se aplica filtrul de marime? false/true");
        boolean isMarime=Boolean.parseBoolean(sc.nextLine());
        if(isMarime) {
            System.out.println("Ce marime?");
            marime = Integer.parseInt(sc.nextLine());
        }
        if(isCuloare) {
            System.out.println("Ce culoare?");
            culoare = sc.nextLine();
        }
        if(isPret) {
            System.out.println("Ce pret?");
            pret = Double.parseDouble(sc.nextLine());
        }
        Cautare cautare=new Cautare(isCuloare,isPret,isMarime,culoare,pret,marime);
        return cautare;
    }
}
