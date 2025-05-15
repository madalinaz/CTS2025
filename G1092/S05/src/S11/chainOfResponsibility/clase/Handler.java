package S11.chainOfResponsibility.clase;

import java.util.List;

public abstract class Handler {
    protected Handler next;
    public abstract List<Candidat> admitere(List<Candidat> candidati);

    public void setNext(Handler next) {
        this.next = next;
    }
}
