package s14.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import s14.teste.ConstructorMasinaTest;
import s14.teste.SetPretTest;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ConstructorMasinaTest.class,
        SetPretTest.class})
public class SuitaTotala {

}