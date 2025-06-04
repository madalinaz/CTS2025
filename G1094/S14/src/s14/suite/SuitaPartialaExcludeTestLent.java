package s14.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import s14.categorii.TestLent;
import s14.categorii.TestRapid;
import s14.teste.ConstructorMasinaTest;
import s14.teste.SetPretTest;

import static org.junit.Assert.*;

@RunWith(Categories.class)
@Categories.ExcludeCategory(TestLent.class)
@Suite.SuiteClasses({
        ConstructorMasinaTest.class,
        SetPretTest.class})
public class SuitaPartialaExcludeTestLent {

}