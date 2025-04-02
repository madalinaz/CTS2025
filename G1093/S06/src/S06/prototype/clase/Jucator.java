package S06.prototype.clase;

import java.util.ArrayList;
import java.util.List;

public class Jucator extends AbstractJucator{
    private List<String> listaAntrenamente;

    public Jucator(TipSport tipSport) {
        super(tipSport);
        switch (tipSport){
            case FOTBAL -> {
                System.out.println("AM APELAT LA BD PENTRU FOTBAL");
                this.listaAntrenamente=new ArrayList<>();
                this.listaAntrenamente.add("Antrenament fotbal 1");
                this.listaAntrenamente.add("Antrenament fotbal 2");
                this.listaAntrenamente.add("Antrenament fotbal 3");
                this.addMedicament("Medicament 1 fotbal");
                this.addMedicament("Medicament 2 fotbal");
                this.addMedicament("Medicament 3 fotbal");
            }
            case BASCKET -> {
                System.out.println("AM APELAT LA BD PENTRU BASKET");
                this.listaAntrenamente=new ArrayList<>();
                this.listaAntrenamente.add("Antrenament basket 1");
                this.listaAntrenamente.add("Antrenament basket 2");
                this.listaAntrenamente.add("Antrenament basket 3");
                this.addMedicament("Medicament 1 basket");
                this.addMedicament("Medicament 2 basket");
                this.addMedicament("Medicament 3 basket");
            }
            case HANDBAL -> {
                System.out.println("AM APELAT LA BD PENTRU HANDBAL");
                this.listaAntrenamente=new ArrayList<>();
                this.listaAntrenamente.add("Antrenament handbal 1");
                this.listaAntrenamente.add("Antrenament handbal 2");
                this.listaAntrenamente.add("Antrenament handbal 3");
                this.addMedicament("Medicament 1 handbal");
                this.addMedicament("Medicament 2 handbal");
                this.addMedicament("Medicament 3 handbal");
            }
        }
    }

    @Override
    public List<String> getListaAntrenamente() {
       return this.listaAntrenamente;
    }

    @Override
    public void addMedicament(String medicament) {
        this.listaMedicamente.add(medicament);
    }

    @Override
    public void addAntrenament(String antrenament) {
        this.listaAntrenamente.add(antrenament);
    }

    @Override
    public void joaca() {
        System.out.println("Jucatorul " + this.nume +" joaca " + this.tipSport);
    }

    @Override
    public String toString() {
        return "Jucator{" +
                "listaAntrenamente=" + listaAntrenamente +
                ", nume='" + nume + '\'' +
                ", listaMedicamente=" + listaMedicamente +
                ", tipSport=" + tipSport +
                '}';
    }

    @Override
    protected AbstractJucator clone() throws CloneNotSupportedException {
        Jucator rezultat = (Jucator) super.clone();
        rezultat.listaAntrenamente = new ArrayList<>();
        for(String antrenament:this.listaAntrenamente){
            rezultat.listaAntrenamente.add(antrenament);
        }
        return rezultat;
    }
}
