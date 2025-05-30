package junit.C13.testare;

import junit.C13.clase.ExceptieAlimentare;
import junit.C13.clase.Masina;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetConsumMasinaTest {
    Masina masina=null;

    @Before
    public void setUp() throws Exception {
        masina = new Masina("Opel",60,10);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRight() throws ExceptieAlimentare {
        masina.setConsumPer100Km(5);
        assertEquals("verif setare consum pe valoare normala",5,masina.getConsumPer100Km(),0.01);
    }

    @Test
    public void testBoundary1() throws ExceptieAlimentare {
        masina.setConsumPer100Km(3.01);
        assertEquals("verif setare consum pe valoare minima",3.01,masina.getConsumPer100Km(),0.01);
    }

    @Test
    public void testBoundary2() throws ExceptieAlimentare {
        masina.setConsumPer100Km(30);
        assertEquals("verif setare consum pe valoare maxima",30,masina.getConsumPer100Km(),0.01);
    }

    //testul trece doar daca meth set arunca exceptia asteptata de test
    @Test(expected = ExceptieAlimentare.class)
    public void testException1() throws ExceptieAlimentare {
        masina.setConsumPer100Km(-5);
    }

    @Test(expected = ExceptieAlimentare.class)
    public void testException2() throws ExceptieAlimentare {
        masina.setConsumPer100Km(35);
    }
}