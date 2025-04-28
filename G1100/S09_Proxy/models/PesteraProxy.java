package S09_Proxy.models;

import java.util.ArrayList;
import java.util.List;

public class PesteraProxy implements IPestera {
    private Pestera pestera;    // Daca folosim IPestera pentru ca putea ajunge prin implement a IPestera un proxy sa controleze alt proxy
    private List<String> numeVizitatori;

    public PesteraProxy(Pestera pestera) {
        this.pestera = pestera;
        this.numeVizitatori = new ArrayList<>();
    }

    @Override
    public void vizitare(String nume) {
        this.numeVizitatori.add(nume);
        System.out.println("\t" + nume + " este in lista de asteptare");
        if (this.numeVizitatori.size() == 5){
            System.out.println("\t" + "Incepem vizita");
            for (String numeVizitator : numeVizitatori) {
                pestera.vizitare(numeVizitator);
            }
            this.numeVizitatori.clear();
        }
    }

    @Override
    public int getNrVizitatori() {
        return pestera.getNrVizitatori();
    }
}
