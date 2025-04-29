package seminar9.composite.clase;

public interface INod {
    float getGreutate();
    boolean isFragil();
    void adaugaNod(INod nod);
    void stergeNod(INod nod);
    INod getNod(int index);
}
