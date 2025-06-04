package s14.mock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AutostradaTest {
    @Test
    public void testRight(){
        List<AbstractMasina> lista = new ArrayList<>();
        lista.add(new MasinaMock(120,true));
        lista.add(new MasinaMock(150,false));
        lista.add(new MasinaMock(80,true));
        lista.add(new MasinaMock(200,false));
        lista.add(new MasinaMock(110,true));
        AbstractVreme vreme = new VremeMock(true);
        int rezultat=Autostrada.getNrAmenzi(lista,vreme);
        assertEquals(5,rezultat);

    }

}