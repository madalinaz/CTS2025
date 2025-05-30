package S14.teste;

import S14.categorii.TestException;
import S14.categorii.TestExistence;
import S14.categorii.TestRight;
import S14.clase.Masina;
import S14.exceptii.ExceptieModelLungime;
import S14.exceptii.ExceptieModelNull;
import S14.exceptii.ExceptiePret;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {

    @Category(TestRight.class)
    @Test
    public void testRight() throws ExceptiePret, ExceptieModelLungime, ExceptieModelNull {
        Masina masina = new Masina("Opel",5000,2010);
        assertEquals("verif model","Opel",masina.getModel());
        assertEquals("verif pret",5000,masina.getPret(),0.001);
        assertEquals("verif an",2010,masina.getAnFabricatie());
    }

    @Test
    public void testBoundary() throws ExceptiePret, ExceptieModelLungime, ExceptieModelNull {
        Masina masina = new Masina("Opel",100000,2010);
        assertEquals("verif model","Opel",masina.getModel());
        assertEquals("verif pret",100000,masina.getPret(),0.001);
        assertEquals("verif an",2010,masina.getAnFabricatie());
    }

    @Category(TestExistence.class)
    @Test(expected = ExceptieModelNull.class)
    public void testExistence() throws ExceptiePret, ExceptieModelLungime, ExceptieModelNull {
        Masina masina = new Masina(null,5000,2010);
    }

}