package cts.S14.suite;

import cts.S14.Categorii.TestareRBICEP;
import cts.S14.Categorii.TestareRight;
import cts.S14.teste.ConstructorMasinaTest;
import cts.S14.teste.SetAnFabricatieMasinaTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
//@Categories.IncludeCategory(TestareRight.class)
//@Categories.ExcludeCategory(TestareRight.class)
@Categories.IncludeCategory(TestareRBICEP.class)
@Suite.SuiteClasses({ConstructorMasinaTest.class, SetAnFabricatieMasinaTest.class})
public class SuitaCategorieRight {

}