package S11.clase.chainOfResponsability;

import java.util.List;

public abstract class AHandler {
    AHandler succesor;
    public void setSuccesor(AHandler handler){
        this.succesor = handler;
    }

    public abstract List<Candidat> filtrare(List<Candidat> listaCandidat, Facultate facultate);
}
