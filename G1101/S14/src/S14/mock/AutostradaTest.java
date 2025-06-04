package S14.mock;

import S14.clase.AbstractMasina;
import S14.clase.AbstractVreme;
import S14.clase.Autostrada;
import S14.clase.Masina;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AutostradaTest {

    @Test
    public void testRight(){
        List<AbstractMasina> lista = new ArrayList<AbstractMasina>();
        lista.add(new MasinaMock(130));
        lista.add(new MasinaMock(90));
        lista.add(new MasinaMock(190));
        lista.add(new MasinaMock(290));
        AbstractVreme vreme = new VremeMock(true,100);
        int rezultat = Autostrada.getNrAmenzi(lista,vreme);
        assertEquals(3,rezultat);
    }

}