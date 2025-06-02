package s14.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import s14.categorii.TestLent;
import s14.categorii.TestRapid;
import s14.clase.Masina;
import s14.exceptii.ExceptieModelNull;
import s14.exceptii.ExceptiePret;

import static org.junit.Assert.*;

public class TestConstructorMasina {

    @Category(TestRapid.class)
    @Test
    public void testRight() throws ExceptiePret, ExceptieModelNull {
        Masina masina = new Masina("Opel",5000);
        assertEquals("Opel",masina.getModel());
        assertEquals(5000,masina.getPret(),0.001);
    }



}