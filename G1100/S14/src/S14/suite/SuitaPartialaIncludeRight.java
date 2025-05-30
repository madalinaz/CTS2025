package S14.suite;

import S14.categorii.TestRight;
import S14.teste.ConstructorMasinaTest;
import S14.teste.MasinaTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

@RunWith(Categories.class)
@Categories.IncludeCategory({TestRight.class})
@Suite.SuiteClasses({ConstructorMasinaTest.class, MasinaTest.class})
public class SuitaPartialaIncludeRight {

}