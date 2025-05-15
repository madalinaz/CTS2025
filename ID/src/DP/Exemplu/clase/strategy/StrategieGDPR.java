package DP.Exemplu.clase.strategy;

import DP.Exemplu.clase.chainOfResponsability.Candidat;
import DP.Exemplu.clase.chainOfResponsability.ICandidat;

import java.util.List;

public class StrategieGDPR implements IStrategy{
    @Override
    public void printare(List<ICandidat> listaCandidati) {
        for(ICandidat c:listaCandidati){
            System.out.println("Nume: ******* "+", facultate: "+c.getFacultate() +", nr ani experienta: "+c.getNrAniExperienta());
        }
    }
}
