package S11.clase.Strategy;


import S11.clase.ChainOfResponsability.FiltruAbstract;

public class TehnicaFiltrare {
    private FiltruAbstract filtru1;
    private FiltruAbstract filtru2;
    private FiltruAbstract filtru3;

    public TehnicaFiltrare(FiltruAbstract filtru1, FiltruAbstract filtru2, FiltruAbstract filtru3) {
        this.filtru1 = filtru1;
        this.filtru2 = filtru2;
        this.filtru3 = filtru3;
    }

    public FiltruAbstract getFiltru1() {
        return filtru1;
    }

    public FiltruAbstract getFiltru2() {
        return filtru2;
    }

    public FiltruAbstract getFiltru3() {
        return filtru3;
    }
}
