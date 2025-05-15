package DP.Exemplu.clase.strategy;

import DP.Exemplu.clase.chainOfResponsability.ICandidat;

import java.util.List;

public interface IStrategy {
    void printare(List<ICandidat> listaCandidati);
}
