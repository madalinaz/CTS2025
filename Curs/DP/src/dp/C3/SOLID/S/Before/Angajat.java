package dp.C3.SOLID.S.Before;

import java.util.Calendar;
import java.util.Date;

public class Angajat {
    static public float salariuMediuEconomie;
    private String nume;
    private float salariu;
    private int vechimeLocMunca;
    private Date dataUltimaMajorare;

    public Angajat() {
        this.nume = "Necunoscut";
        this.salariu = 0;
        this.vechimeLocMunca = 0;
        this.dataUltimaMajorare = null;
    }

    public Angajat(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
        this.vechimeLocMunca = 0;
        this.dataUltimaMajorare=null;
    }

    public void aplicaPromovare() {
        if (dataUltimaMajorare == null) {
            return;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataUltimaMajorare);
        calendar.add(Calendar.YEAR, 1);

        Date dataCurenta = new Date();
        boolean aTrecutUnAn = dataCurenta.after(calendar.getTime());

        boolean salariuSubMediaEconomie = salariu < (salariuMediuEconomie * 0.7);

        if (aTrecutUnAn && salariuSubMediaEconomie) {
            salariu *= 1.2;
            dataUltimaMajorare = new Date();
            System.out.println(nume + " a fost promovat! Salariul nou: " + salariu);
        } else {
            System.out.println("Condițiile pentru promovare nu sunt îndeplinite pentru " + nume);
        }
    }

    public void setDataUltimaMajorare(Date dataUltimaMajorare) {
        this.dataUltimaMajorare = dataUltimaMajorare;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", vechimeLocMunca=" + vechimeLocMunca +
                ", dataUltimaMajorare=" + dataUltimaMajorare +
                '}';
    }
}
