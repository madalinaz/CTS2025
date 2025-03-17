package dp.C3.SOLID.S.Before;

import java.util.Date;

public class Program {

    public static void main(String[] args) {
        Angajat a = new Angajat("Gigel",5000);
        a.setDataUltimaMajorare(new Date());

        a.aplicaPromovare();
        System.out.println(a);
    }
}
