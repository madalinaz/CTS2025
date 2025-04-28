package S09_Composite.models;

// nod este generic. Si frunza si nod
public interface INod {
    double getGreutate();
    boolean esteFragil(); // nodul este fragil daca ajunge sa aibe si containere fragile

    void addNod(INod nod);
    void stergeNod(INod nod);
    INod getNod(int index);
}
