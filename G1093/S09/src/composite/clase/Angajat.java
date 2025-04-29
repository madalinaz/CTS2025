package composite.clase;

public class Angajat implements INod{
    String nume;
    double salariu;

    public Angajat(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public double getSalariu() {
        return this.salariu;
    }

    @Override
    public void displayInfo() {
        System.out.println("Angajatul "+ this.nume+" are salariul "+ this.salariu);
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNrAngajati() {
        return 1;
    }
}
