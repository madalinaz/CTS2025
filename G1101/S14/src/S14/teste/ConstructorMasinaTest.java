package S14.teste;

import S14.clase.Masina;
import S14.exceptii.ExceptieAn;
import S14.exceptii.ExceptieModel;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {
    @Test
    public void testRight() throws ExceptieModel, ExceptieAn {
        Masina masina = new Masina("Opel",12000,2020);
        assertEquals("Opel",masina.getModel());
        assertEquals(12000,masina.getPret(),0.001);
        assertEquals(2020,masina.getAnFabricatie());
    }

}