package S11.clase.ChainOfResponsability;

import java.util.List;

public abstract class FiltruAbstract {
    protected FiltruAbstract nextHandler;
    public void setNextHandler(FiltruAbstract nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract List<Candidat> filtrare(List<Candidat> candidati);
}
