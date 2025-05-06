package S09.composite.clase;

public interface INod {
    double getNrCalorii();
    boolean isBio();
    void addNod(INod nod);
    void removeNod(INod nod);
    INod getNod(int index);

}
