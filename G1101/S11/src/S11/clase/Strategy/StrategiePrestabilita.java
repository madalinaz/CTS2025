package S11.clase.Strategy;


import S11.clase.ChainOfResponsability.FiltruClasament;
import S11.clase.ChainOfResponsability.FiltruEseu;
import S11.clase.ChainOfResponsability.FiltruNote;

public class StrategiePrestabilita implements IStrategy{
    @Override
    public TehnicaFiltrare generareStrategie() {
        return new TehnicaFiltrare(new FiltruEseu(), new FiltruNote(), new FiltruClasament());
    }
}
