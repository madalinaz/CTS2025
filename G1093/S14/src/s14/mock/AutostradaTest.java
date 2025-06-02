package s14.mock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AutostradaTest {

    @Test
    public void testRight(){
        List<AbstractMasina> listaMasini = new ArrayList<AbstractMasina>();
        listaMasini.add(new MasinaMock(100));
        listaMasini.add(new MasinaMock(200));
        listaMasini.add(new MasinaMock(70));
        AbstractVreme vreme = new VremeMock(true,20);
        int rezultat=Autostrada.getNrAmenzi(listaMasini, vreme);
        assertEquals(2,rezultat);
    }

}