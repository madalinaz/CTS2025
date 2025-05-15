package DP.Exemplu.clase.chainOfResponsability;

public abstract class AbstractHandler implements IFiltrare{
    //in clasa abstracta sa implementez zona comuna a tuturor claselor de tip handler
    private IFiltrare nextHandler;

    @Override
    public void setSuccesor(IFiltrare filtrare) {
        this.nextHandler=filtrare;
    }

    @Override
    public IFiltrare getSuccesor() {
        return nextHandler;
    }
}
