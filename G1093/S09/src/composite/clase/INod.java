package composite.clase;

public interface INod {
    public double getSalariu();
    public void displayInfo();
    public void addNod(INod nod);
    public void removeNod(INod nod);
    public INod getNod(int index);
    public int getNrAngajati();
}
