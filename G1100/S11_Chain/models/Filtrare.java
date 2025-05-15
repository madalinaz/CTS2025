package S11_Chain.models;

import java.util.List;

// Clasa AbstractHandler
public abstract class Filtrare {
    protected Filtrare nextHandler;

    public Filtrare(String denumire) {
        FacadeFiltrare.adaugareHandler(denumire, this);
    }

    public void setNextHandler(Filtrare nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract List<Candidat> filtrare(List<Candidat> candidati);
}
