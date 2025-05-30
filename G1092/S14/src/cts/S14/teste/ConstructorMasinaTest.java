package cts.S14.teste;

import cts.S14.Categorii.TestareException;
import cts.S14.Categorii.TestareRight;
import cts.S14.clase.Masina;
import cts.S14.exceptii.ExceptieModelNull;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {

    @Category(TestareRight.class)
    @Test
    public void testRight() throws ExceptieModelNull {
        Masina masina = new Masina(10,"Dacia",2000,12000);
        assertEquals("verif consum",10,masina.getConsum());
        assertEquals("verif model","Dacia",masina.getModel());
        assertEquals("verif an fabricatie",2000,masina.getAnFabricatie());
        assertEquals("verif pret",12000,masina.getPret(),0.001);
    }

    @Category(TestareException.class)
    @Test(expected=ExceptieModelNull.class)
    public void testException() throws ExceptieModelNull {
        Masina masina = new Masina(10,null,2000,12000);
    }

}