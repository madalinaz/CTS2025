package seminar9.proxy.clase;

import java.util.ArrayList;
import java.util.List;

public class ProxyPestera implements Ipestera{

    private Pestera pestera;
    private List<String> listaAsteptare;

    public ProxyPestera(Pestera pestera)
    {
        this.pestera = pestera;
        listaAsteptare = new ArrayList<>();
    }
    @Override
    public void adaugaPersoana(String nume) {

        listaAsteptare.add(nume);

        if (listaAsteptare.size() == 5)
        {
            for (String numeLista : listaAsteptare) {
                pestera.adaugaPersoana(numeLista);
            }
            listaAsteptare.clear();
        }
    }

    @Override
    public int getNrVizitatori() {
        return pestera.getNrVizitatori();
    }
}
