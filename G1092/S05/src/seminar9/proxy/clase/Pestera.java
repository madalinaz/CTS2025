package seminar9.proxy.clase;

public class Pestera implements Ipestera{

    private int nrPersoane=0;

    @Override
    public void adaugaPersoana(String nume) {
        System.out.println(nume + " cineva a intrat in pestera");
        System.out.println(nrPersoane);
        nrPersoane++;
    }

    @Override
    public int getNrVizitatori() {
        return nrPersoane;
    }
}
