package cts.S14.suite;

import cts.S14.teste.ConstructorMasinaTest;
import cts.S14.teste.SetAnFabricatieMasinaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({ConstructorMasinaTest.class, SetAnFabricatieMasinaTest.class})
public class SuitaTotala {

}