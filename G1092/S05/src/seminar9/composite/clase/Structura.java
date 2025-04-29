package seminar9.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Structura implements INod{

    private float greutate;
    private List<INod> listaNoduri;

    public Structura(float greutate)
    {
        this.greutate = greutate;
        listaNoduri = new ArrayList<>();
    }
    @Override
    public float getGreutate() {
        float totalGreutate = 0f;
        for (INod nod : listaNoduri)
        {
            totalGreutate+=nod.getGreutate();
        }
        totalGreutate +=greutate;
        return totalGreutate;
    }

    @Override
    public boolean isFragil() {
        for (INod nod : listaNoduri)
        {
            if (nod.isFragil())
            {
                return true;
            }
        }
        return false;
   }

    @Override
    public void adaugaNod(INod nod) {
        if (nod != null)
        {
            listaNoduri.add(nod);
        }
    }

    @Override
    public void stergeNod(INod nod) {
        if (nod!=null)
            listaNoduri.remove(nod);
    }

    @Override
    public INod getNod(int index) {
        if (index >= 0 && index < listaNoduri.size())
        {
            return listaNoduri.get(index);
        }
        else {
            return null;
        }
    }
}

//command nu intra la lucrare (scoate 2-3 DP de la lucrare)