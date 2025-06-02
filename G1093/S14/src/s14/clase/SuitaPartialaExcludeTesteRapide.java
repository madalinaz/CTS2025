package s14.clase;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import s14.categorii.TestRapid;
import s14.teste.TestConstructorMasina;
import s14.teste.TestSetPret;

import static org.junit.Assert.*;

@RunWith(Categories.class)
@Categories.ExcludeCategory(TestRapid.class)
@Suite.SuiteClasses({TestConstructorMasina.class, TestSetPret.class})
public class SuitaPartialaExcludeTesteRapide {

}