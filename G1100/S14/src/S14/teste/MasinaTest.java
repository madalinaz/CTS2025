package S14.teste;

import S14.categorii.TestException;
import S14.categorii.TestRight;
import S14.clase.Masina;
import S14.exceptii.ExceptiePret;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class MasinaTest {
    private Masina masina;
    public MasinaTest() {
        System.out.println("Constructor MasinaTest");
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
    }

    @org.junit.Before
    public void setUp() throws Exception {
        masina = new Masina();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Category(TestRight.class)
    @Test
    public void testRight() throws ExceptiePret {
        masina.setPret(5000);
        assertEquals("nu a setat corect pretul pentru valoare normala",5000, masina.getPret(),0.001);
    }

    @Category(TestException.class)
    @Test(expected = ExceptiePret.class)
    public void testException() throws ExceptiePret {
        masina.setPret(500);
    }

    @Category(TestException.class)
    @Test
    public void testException2(){
        double pretInitial = masina.getPret();
        try {
            masina.setPret(500);
            //1 NU este bine
            //assertTrue(false);
            fail("nu s-a aruncat exceptie atunci cand pretul era invalid");
        } catch (ExceptiePret e) {
            //2 este bine
            assertTrue(true);
        }
        assertEquals("s-a modificat pretul in set atunci cand arunca exceptie",pretInitial, masina.getPret(),0.001);
    }


}