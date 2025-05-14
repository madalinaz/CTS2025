package MagazinOnline.clase;

import java.util.ArrayList;
import java.util.List;

public class FiltrarePret extends AHandler{
    @Override
    public List<Pantof> filtrare(List<Pantof> pantofi, ICautare cautare) {
        List<Pantof> pantofiFiltrati;
        if(cautare.isFiltruPret()){
            pantofiFiltrati = new ArrayList<>();

            for(Pantof p:pantofi){
                if(p.getPret()>= cautare.getPretMinim()){
                    pantofiFiltrati.add(p);
                }
            }
            System.out.println("\nAu ramas "+pantofiFiltrati.size());
        }else{
            System.out.println("Nu s-a dorit filtrare dupa pret");
            pantofiFiltrati = pantofi;
        }
        if(super.getNextHandler()!=null){
            return super.getNextHandler().filtrare(pantofiFiltrati,cautare);
        }
        else{
            System.out.println("S-a terminat afisarea");
            return pantofiFiltrati;
        }
    }
}
