package java_kurs.dziedziczenie;

import org.testng.annotations.Test;

public class TestDziedziczenia {

    @Test
    public void testDziedziczenia () {
        Dziecko dziecko = new Dziecko();
        dziecko.umiejetnoscPlywania();
    }
}
