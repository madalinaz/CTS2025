package MagazinOnline.clase;

import java.util.ArrayList;
import java.util.List;

public class FiltrareCuloare extends AHandler{
    @Override
    public List<Pantof> filtrare(List<Pantof> pantofi, ICautare cautare) {
        List<Pantof> pantofiFiltrati;
        if(cautare.isFiltruCuloare()){
            pantofiFiltrati = new ArrayList<>();
            //pantofiList=pantofi.stream().filter(p->p.getCuloare().equals(cautare.getCuloare())).toList();
            for(Pantof p:pantofi){
                if(p.getCuloare().equals(cautare.getCuloare())){
                    pantofiFiltrati.add(p);
                }
            }
            System.out.println("\nAu ramas "+pantofiFiltrati.size());
        }else{
            System.out.println("Nu s-a dorit filtrare dupa culoare");
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
