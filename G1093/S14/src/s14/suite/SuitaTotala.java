package s14.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import s14.teste.TestConstructorMasina;
import s14.teste.TestSetPret;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestConstructorMasina.class, TestSetPret.class})
public class SuitaTotala {

}