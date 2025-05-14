package S11.chainOfResponsibility.clase;

import java.util.ArrayList;
import java.util.List;

public class AnalizaMedieBacHandler extends Handler{
    @Override
    public List<Candidat> admitere(List<Candidat> candidati) {
        List<Candidat> candidatiFiltrati = new ArrayList<>();
        for (Candidat candidat : candidati) {
            if (candidat.getMedieBac() > 8)
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
