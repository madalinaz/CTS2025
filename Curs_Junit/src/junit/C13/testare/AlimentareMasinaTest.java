package junit.C13.testare;

import junit.C13.clase.Masina;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlimentareMasinaTest {
    Masina masina=null;
    @Before
    public void setUp() throws Exception {
        masina = new Masina("Opel",60,10);
    }

    @Test
    public void testRight(){
        masina.alimenteaza(20);
        assertEquals("verif adaugare combustibil",20,masina.getCombustibilCurent(),0.01);
    }

    @Test
    public void testInverse(){
        masina.alimenteaza(20);
        masina.consuma(20);
        assertEquals("verif ca nu s-au produs modificari",0,masina.getCombustibilCurent(),0.01);
    }

    @Test(timeout = 1)
    public void testPerformance(){
        for(int i=0;i<1000;i++)
        masina.alimenteaza(20);
        //assertEquals("verif adaugare combustibil",20,masina.getCombustibilCurent(),0.01);
    }
}