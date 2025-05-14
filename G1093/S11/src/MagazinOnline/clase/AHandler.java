package MagazinOnline.clase;

import java.util.List;

public abstract class AHandler {
    protected AHandler handler;
    public void setNextHandler(AHandler handler) {this.handler = handler;}
    public AHandler getNextHandler() {return handler;}
    public abstract List<Pantof> filtrare(List<Pantof> pantofi, ICautare cautare);

    //acasa: return void cu actualizarea listei
}
