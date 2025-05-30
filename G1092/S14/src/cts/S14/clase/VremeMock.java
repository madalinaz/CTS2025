package cts.S14.clase;

public class VremeMock implements AbstractVreme{
    private boolean estePloaie;

    public VremeMock(boolean estePloaie) {
        this.estePloaie = estePloaie;
    }

    @Override
    public boolean estePloaie() {
        return this.estePloaie;
    }
}
