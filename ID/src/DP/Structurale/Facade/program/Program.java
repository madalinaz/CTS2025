package DP.Structurale.Facade.program;

import DP.Structurale.Facade.*;

public class Program {
    public static void main(String[] args) {

        ColectieBucatari colectieBucatari= new ColectieBucatari();
        colectieBucatari.addBucatar(new Bucatar("Gigel1",true));
        colectieBucatari.addBucatar(new Bucatar("Gigel2",false));
        colectieBucatari.addBucatar(new Bucatar("Gigel3",false));
        colectieBucatari.addBucatar(new Bucatar("Gigel4",true));

        ColectieOspatari colectieOspatari= new ColectieOspatari();
        colectieOspatari.addOspatar(new Ospatar("Costel1",true));
        colectieOspatari.addOspatar(new Ospatar("Costel2",false));
        colectieOspatari.addOspatar(new Ospatar("Costel3",false));
        colectieOspatari.addOspatar(new Ospatar("Costel4",true));

        //fara Facade
        //clientul cauta daca e okai data de "12/12/2020"
        String data = "12/12/2020";
        int nrPersoanePetrecere=100;
        int contorBucatari = colectieBucatari.getNumarBucatariLiberiData(data);
        int contorOspatari = colectieOspatari.getNrOspatariData(data);
        if(contorOspatari>=nrPersoanePetrecere/5 && contorBucatari>=nrPersoanePetrecere/20){
            System.out.println("Se poate tine petrecerea atunci");
        } else{
            System.out.println("NU se poate tine petrecerea atunci");
        }

        //cu Facade
        Facade facade = new Facade();
        facade.addBucatar(new Bucatar("Gigel1",true));
        facade.addBucatar(new Bucatar("Gigel2",true));
        facade.addBucatar(new Bucatar("Gigel3",false));
        facade.addBucatar(new Bucatar("Gigel4",true));
        facade.addBucatar(new Bucatar("Gigel5",true));
        facade.addOspatar(new Ospatar("Costel1",true));
        System.out.println(facade.verificaDisponibilitateData("12/12/2020",100));
    }
}
