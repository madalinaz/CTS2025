package S11_Strategy.models;

import S11_Chain.models.Candidat;

import java.util.List;

public class NoGDPRStrategy implements IStrategy{
    @Override
    public void afisareCandidati(List<Candidat> listaCandidati) {
        System.out.println("======= Strategie de NoGDPR ========");
    }
}
