package S09_Composite.models;

import java.util.ArrayList;
import java.util.List;

// In problema noastra: Vapor / Container
public class NodStructura implements INod {
    private double greutate;
    private List<INod> listaCopii;

    public NodStructura(double greutate) {
        this.greutate = greutate;
        this.listaCopii = new ArrayList<>();
    }

    @Override
    public double getGreutate() {
        return this.greutate + listaCopii.stream().mapToDouble(INod::getGreutate).sum();
    }

    @Override
    public boolean esteFragil() {
        return listaCopii.stream().filter(INod::esteFragil).count() > 0;
    }

    @Override
    public void addNod(INod nod) {
        this.listaCopii.add(nod);
    }

    @Override
    public void stergeNod(INod nod) {
        this.listaCopii.remove(nod);
    }

    @Override
    public INod getNod(int index) {
        return this.listaCopii.get(index);
    }
}
