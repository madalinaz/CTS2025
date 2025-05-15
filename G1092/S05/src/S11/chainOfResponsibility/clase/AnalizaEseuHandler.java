package S11.chainOfResponsibility.clase;

import java.util.ArrayList;
import java.util.List;

public class AnalizaEseuHandler extends Handler{
    @Override
    public List<Candidat> admitere(List<Candidat> candidati) {
        //toate eseurile motiv. de lungime para trec filtrarea
        List<Candidat> candidatiFiltrati = new ArrayList<>();
        for (Candidat candidat : candidati) {
            if (candidat.getEseu().length()%2 == 0)
            {
                candidatiFiltrati.add(candidat);
            }
        }
        System.out.println("S-a filtrat dupa analiza eseu. Au ramas " +candidatiFiltrati.size()
        + " candidati");
        if (next != null)
        {
            return next.admitere(candidatiFiltrati);
        } else {
            System.out.println("S-a terminat analiza");
        }
        return candidatiFiltrati;
    }


}
