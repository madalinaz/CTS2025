package s06.program;

import s06.pattern.builder.AbstractBuilder;
import s06.pattern.builder.MostraAer;
import s06.pattern.builder.Senzor;
import s06.pattern.builder.SenzorBuilder;
import s06.pattern.prototype.AbstractPersonaj;
import s06.pattern.prototype.PrototypeCollection;
import s06.pattern.prototype.TipPersonaj;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Builder
        SenzorBuilder builder = new SenzorBuilder();
        Senzor senzor1 = builder.build();
        Senzor senzor2 = builder.setAreNivelPM2_5(true).setAreNivelUmiditate(true).build();
        Senzor senzor3 = builder.setAreNivelTemperatura(true).build();

        MostraAer mostraAer = new MostraAer(75,35,28,70);
        senzor1.afisareDetalii(mostraAer);
        senzor2.afisareDetalii(mostraAer);
        senzor3.afisareDetalii(mostraAer);

        //PROTOTYPE factory in versiune lazy
        try {
            AbstractPersonaj animal = PrototypeCollection.getPrototip(TipPersonaj.ANIMAL);
            AbstractPersonaj animal2 = PrototypeCollection.getPrototip(TipPersonaj.ANIMAL);
            AbstractPersonaj vrajitor1 = PrototypeCollection.getPrototip(TipPersonaj.VRAJITOR);
            AbstractPersonaj vrajitor2 = PrototypeCollection.getPrototip(TipPersonaj.VRAJITOR);
            AbstractPersonaj vrajitor3 = PrototypeCollection.getPrototip(TipPersonaj.VRAJITOR);
            vrajitor3.ataca(animal2);
            System.out.println(vrajitor2);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}