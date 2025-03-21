package dp.C4.Singleton.Restaurant.clase;

public class Ospatar {
    private String nume;

    public Ospatar(String nume){
        this.nume=nume;
    }

    public void preiaComanda(){
        int idMasa = Restaurant.getInstance().getMasaLibera();
        if(idMasa!=-1)
            System.out.println("S-a ocupat masa "+idMasa);
        else
            System.out.println("Nu mai exista mese libere");
    }

    public void inchideComanda(int idMasa){
        Restaurant.getInstance().elibereazaMasa(idMasa);
    }
}
