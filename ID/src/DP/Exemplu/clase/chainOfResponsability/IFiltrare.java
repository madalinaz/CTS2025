package DP.Exemplu.clase.chainOfResponsability;

import java.util.List;

public interface IFiltrare {
    List<ICandidat> filtrare(List<ICandidat> listaCandidati);
    void setSuccesor(IFiltrare filtrare);
    IFiltrare getSuccesor();

    //void filtrare2(List<ICandidat> listaCandidati);
}
