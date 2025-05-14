package S11_Strategy.models;

import S11_Chain.models.Candidat;

import java.util.ArrayList;
import java.util.List;

public class Admitere {
    public static List<Candidat> candidates = new ArrayList<>();
    private IStrategy strategy;

    static {
        candidates.add(new Candidat("Ion Popescu", "fdsjkllfsdfjsdfds jfldsfjlsdk", 8.0, 7.5));
        candidates.add(new Candidat("Maria Ionescu", "fdsjkllfsdfjsd fds jfldsfjlsdk", 9.0, 8.5));
        candidates.add(new Candidat("Andrei Georgescu", "fdsjkllfsdfjsd fds jfldsfjlsdk", 7.0, 6.5));
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void admitere() {
        strategy.afisareCandidati(candidates);
    }
}
