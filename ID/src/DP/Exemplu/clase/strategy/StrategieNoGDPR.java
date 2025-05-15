package DP.Exemplu.clase.strategy;

import DP.Exemplu.clase.chainOfResponsability.ICandidat;

import java.util.List;

public class StrategieNoGDPR implements IStrategy{
    @Override
    public void printare(List<ICandidat> listaCandidati) {
        System.out.println(listaCandidati);
    }
}
