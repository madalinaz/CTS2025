package S06.prototype.program;

import S06.prototype.clase.Jucator;
import S06.prototype.clase.PrototypeJucatorFactory;
import S06.prototype.clase.TipSport;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Jucator jucator1 = (Jucator) PrototypeJucatorFactory.getPrototip(TipSport.HANDBAL);
            Jucator jucator2 = (Jucator) PrototypeJucatorFactory.getPrototip(TipSport.HANDBAL);
            Jucator jucator3 = (Jucator) PrototypeJucatorFactory.getPrototip(TipSport.HANDBAL);
            Jucator jucator4 = (Jucator) PrototypeJucatorFactory.getPrototip(TipSport.HANDBAL);
            jucator1.addMedicament("Paracetamol");
            jucator1.addAntrenament("Antrenament nou");
            System.out.println(jucator1);
            System.out.println(jucator2);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}