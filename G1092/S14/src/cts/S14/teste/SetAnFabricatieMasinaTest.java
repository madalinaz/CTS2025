package cts.S14.teste;

import cts.S14.Categorii.TestareRight;
import cts.S14.clase.Masina;
import cts.S14.exceptii.ExceptieAnFabricatie;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class SetAnFabricatieMasinaTest {
    Masina masina;

    @org.junit.Before
    public void setUp() throws Exception {
        masina = new Masina();
    }

    @Category(TestareRight.class)
    @Test
    public void testRight() throws ExceptieAnFabricatie {
        masina.setAnFabricatie(2000);
        assertEquals("nu s-a setat anul corect pentru an normal",2000, masina.getAnFabricatie());
    }
}