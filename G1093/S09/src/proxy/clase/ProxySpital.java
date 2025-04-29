package proxy.clase;

import java.util.ArrayList;
import java.util.List;

public class ProxySpital implements ISpital{
    private Spital spital;
    private List<Pacient> listaPacientiVizitati;

    public ProxySpital(Spital spital) {
        this.spital=spital;
        this.listaPacientiVizitati = new ArrayList<>();
    }

    @Override
    public void vizitarePacient(Vizitator vizitator, Pacient pacient) {
        if(!listaPacientiVizitati.contains(pacient)){
            listaPacientiVizitati.add(pacient);
            this.spital.vizitarePacient(vizitator,pacient);
        }
        else{
            System.out.println("Nu se poate");
        }
    }
}
