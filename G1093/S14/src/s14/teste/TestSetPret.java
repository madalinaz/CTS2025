package s14.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import s14.categorii.TestFoarteLent;
import s14.categorii.TestLent;
import s14.categorii.TestRapid;
import s14.clase.Masina;
import s14.exceptii.ExceptiePret;

import java.sql.Time;
import java.time.Instant;

import static org.junit.Assert.*;

public class TestSetPret {
    private Masina masina;
    @org.junit.Before
    public void setUp() throws Exception {
        masina = new Masina();
    }

    @Category(TestRapid.class)
    @Test
    public void testRight() throws ExceptiePret {
        masina.setPret(5000);
        assertEquals("pretul nu a fost setat corect pentru un pret normal",5000, masina.getPret(),0.001);
    }

    @Category(TestLent.class)
    @Test
    public void testBoundary1() throws ExceptiePret {
        masina.setPret(2000);
        assertEquals(2000, masina.getPret(),0.001);
    }

    @Category(TestLent.class)
    @Test
    public void testBoundary2() throws ExceptiePret {
        masina.setPret(99999.99);
        assertEquals(99999.99, masina.getPret(),0.001);
    }

    @Category(TestFoarteLent.class)
    @Test
    public void testPerformance() throws ExceptiePret {
        long pragMaxim=2;
        long start = Time.from(Instant.now()).getTime();
        long start2 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++) {
            masina.setPret(5000);
        }
        long stop = Time.from(Instant.now()).getTime();
        long stop2 = System.currentTimeMillis();
        System.out.println(start + " " + stop);
        System.out.println(start2 + " " + stop2);

        assertTrue((stop2-start2)<=pragMaxim);
    }
}