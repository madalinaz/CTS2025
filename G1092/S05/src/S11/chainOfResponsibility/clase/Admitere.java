package S11.chainOfResponsibility.clase;

import java.util.ArrayList;
import java.util.List;

public class Admitere {
    private Handler handler1;
    private Handler handler2;
    private Handler handler3;
    private List<Candidat> candidati = new ArrayList<>();

    public Admitere(Handler handler1, Handler handler2, Handler handler3) {
        this.handler1 = handler1;
        this.handler2 = handler2;
        this.handler3 = handler3;
        setNext();
    }

    private void setNext()
    {
        handler1.setNext(handler2);
        handler2.setNext(handler3);
    }

    public void addCandidat(Candidat candidat)
    {
        candidati.add(candidat);
    }

    public void filtrareCandidati()
    {
        List<Candidat> candidatiFiltrati = new ArrayList<>();
        candidatiFiltrati = handler1.admitere(candidati);
        for (Candidat candidat : candidatiFiltrati)
        {
            System.out.println(candidat);
        }
    }
}
