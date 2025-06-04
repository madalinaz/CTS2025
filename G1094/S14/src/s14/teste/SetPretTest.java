package s14.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import s14.categorii.TestLent;
import s14.categorii.TestRapid;
import s14.clase.Masina;
import s14.exceptii.ExceptiePret;

import static org.junit.Assert.*;

public class SetPretTest {
    private Masina masina;


    @org.junit.Before
    public void setUp() throws Exception {
        masina=new Masina();
    }

    @Category(TestRapid.class)
    @Test
    public void testRight() throws ExceptiePret {
        masina.setPret(5000);
        assertEquals("pretul nu s-a setat corect pentru valoare normala",5000,masina.getPret(),0.001);
    }

    @Category(TestRapid.class)
    @Test
    public void testBoundary1() throws ExceptiePret {
        masina.setPret(2000);
        assertEquals("pretul nu s-a setat corect pentru valoare limita inferioara",2000,masina.getPret(),0.001);
    }

    @Category(TestRapid.class)
    @Test
    public void testBoundary2() throws ExceptiePret {
        masina.setPret(49999.99);
        assertEquals("pretul nu s-a setat corect pentru valoare limita superioara",49999.99,masina.getPret(),0.001);
    }

    @Category(TestLent.class)
    @Test(timeout=1)
    public void testPerformance1() throws ExceptiePret {
        for(int i=0;i<1000000;i++) {
            masina.setPret(5000);
        }
    }

    @Category(TestLent.class)
    @Test
    public void testPerformance2() throws ExceptiePret {
        long start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++) {
            masina.setPret(5000);
        }
        long stop = System.currentTimeMillis();
        System.out.println(start + " - "+stop);
        System.out.println(stop-start);
        long prag = 1;
        assertTrue(stop-start<=prag);
    }


    @Test
    public void testPerformance3() throws ExceptiePret {
        long start = System.nanoTime();
        for(int i=0;i<1000000;i++) {
            masina.setPret(5000);
        }
        long stop = System.nanoTime();
        System.out.println(start + " - "+stop);
        System.out.println((stop-start)/1000000);
        long prag = 1;
        assertTrue((stop-start)/1000000<=prag);
    }
}