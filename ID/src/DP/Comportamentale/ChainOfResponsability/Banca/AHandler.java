package DP.Comportamentale.ChainOfResponsability.Banca;

import DP.Comportamentale.ChainOfResponsability.Restaurant.Comanda;

public abstract class AHandler {
    protected AHandler nextHandler;

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract boolean verificareConditiiCreditare (Client client);
}
