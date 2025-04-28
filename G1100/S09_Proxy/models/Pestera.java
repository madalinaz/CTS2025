package S09_Proxy.models;

public class Pestera implements IPestera {
    private int nrVizitatori;

    @Override
    public void vizitare(String nume) {
        this.nrVizitatori++;
        System.out.println(nume + " a vizitat pestera!");
    }

    @Override
    public int getNrVizitatori() {
        return this.nrVizitatori;
    }
}
