package composite.clase;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod{
    private String denumire;
    private List<INod> listaFii;

    public NodStructura(String denumire) {
        this.denumire = denumire;
        this.listaFii = new ArrayList<>();
    }

    @Override
    public double getSalariu() {
        int nrAngajati=0;
        double salariuTotal=0;
        for(INod nod:listaFii){
            if(nod instanceof Angajat){
                nrAngajati++;
                salariuTotal+=nod.getSalariu();
            }
            else{
                salariuTotal+=nod.getSalariu()*nod.getNrAngajati();
                nrAngajati+=nod.getNrAngajati();
            }
        }
        return salariuTotal/nrAngajati;
    }

    @Override
    public void displayInfo() {
        System.out.println("Departamentul "+this.denumire);
        for(INod nod:listaFii){
            nod.displayInfo();
        }
    }

    @Override
    public void addNod(INod nod) {
        if(nod!=null){
            listaFii.add(nod);
        }
    }

    @Override
    public void removeNod(INod nod) {
        if(nod!=null) {
            listaFii.remove(nod);
        }
    }

    @Override
    public INod getNod(int index) {
        if(index<listaFii.size()&&index>=0) {
            return listaFii.get(index);
        }
        return null;
    }

    @Override
    public int getNrAngajati() {
        int contor=0;
        for(INod nod:this.listaFii){
            if(nod instanceof Angajat){
                contor++;
            }
            else{
                contor+= nod.getNrAngajati();
            }
        }
        return contor;
    }
}
