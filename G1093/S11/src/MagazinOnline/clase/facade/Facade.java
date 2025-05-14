package MagazinOnline.clase.facade;

import MagazinOnline.clase.AHandler;
import MagazinOnline.clase.ICautare;
import MagazinOnline.clase.Pantof;

import java.util.ArrayList;
import java.util.List;

public class Facade {

    private AHandler filtru1;
    private AHandler filtru2;
    private AHandler filtru3;

    private List<Pantof> pantofi=new ArrayList<>();

    public Facade(AHandler filtru1, AHandler filtru2, AHandler filtru3) {
        this.filtru1 = filtru1;
        this.filtru2 = filtru2;
        this.filtru3 = filtru3;
        setareLantResponsabili();
    }

    public void addPantof(Pantof p) {
        pantofi.add(p);
    }

    private void setareLantResponsabili(){
        filtru1.setNextHandler(filtru2);
        filtru2.setNextHandler(filtru3);
    }

    public void filtrare(ICautare cautare){
        List<Pantof> rezultat= filtru1.filtrare(pantofi, cautare);
        System.out.println(rezultat);
    }
}
