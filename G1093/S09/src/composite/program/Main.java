package composite.program;

import composite.clase.Angajat;
import composite.clase.INod;
import composite.clase.NodStructura;

public class Main {
    public static void main(String[] args) {
        INod angajat=new Angajat("Marcel", 1500);
        INod angajat1=new Angajat("Marcel2", 2500);
        INod angajat2=new Angajat("Marcel3", 3000);

        INod dep1=new NodStructura("Departament Principal");
        INod dep2=new NodStructura("Departament Secundar 1");
        INod dep3=new NodStructura("Departament Secundar 2");

        dep1.addNod(dep2);
        dep1.addNod(dep3);
        dep2.addNod(angajat);
        dep2.addNod(angajat1);
        dep3.addNod(angajat2);
        dep1.displayInfo();

        System.out.println(dep1.getSalariu());
    }
}