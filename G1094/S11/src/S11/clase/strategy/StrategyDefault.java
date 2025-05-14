package S11.clase.strategy;


import S11.clase.chainOfResponsability.AHandler;
import S11.clase.chainOfResponsability.FiltruClasament;
import S11.clase.chainOfResponsability.FiltruEseu;
import S11.clase.chainOfResponsability.FiltruNote;

import java.util.ArrayList;
import java.util.List;

public class StrategyDefault implements IStrategy {
    @Override
    public List<AHandler> generareFiltre() {
        List<AHandler> listaHandler = new ArrayList<>();
        listaHandler.add(new FiltruEseu());
        listaHandler.add(new FiltruNote());
        listaHandler.add(new FiltruClasament());
        return listaHandler;
    }
}
