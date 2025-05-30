package junit.C13.testare;

import junit.C13.clase.ExceptieAlimentare;
import junit.C13.clase.ExceptieConstructorMasina;
import junit.C13.clase.Masina;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("set up");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("tear down");
    }

    @Test
    public void testRight() throws ExceptieConstructorMasina, ExceptieAlimentare {
       Masina masina = new Masina("Opel",60,10);
       assertEquals("verif setare model","Opel",masina.getModel());
       assertEquals("verif capacitate rezervor",60,masina.getCapacitateRezervor(),0.01);
       assertEquals("verif comsum",10,masina.getConsumPer100Km(),0.01);
       assertEquals("verif capacitate curenta",0,masina.getCombustibilCurent(),0.01);
       assertEquals("verif nr km parcursi",0,masina.getKilometriParcursi(),0.01);
    }

    @Test
    public void testBoundary() throws ExceptieConstructorMasina, ExceptieAlimentare {
        Masina masina = new Masina("AB",60,10);
        assertEquals("verif setare model pe lg minima","AB",masina.getModel());
        assertEquals("verif capacitate rezervor",60,masina.getCapacitateRezervor(),0.01);
        assertEquals("verif comsum",10,masina.getConsumPer100Km(),0.01);
        assertEquals("verif capacitate curenta",0,masina.getCombustibilCurent(),0.01);
        assertEquals("verif nr km parcursi",0,masina.getKilometriParcursi(),0.01);
    }

    @Test(expected = ExceptieConstructorMasina.class)
    public void testException() throws ExceptieConstructorMasina, ExceptieAlimentare {
        Masina masina = new Masina(null,60,10);
    }
}