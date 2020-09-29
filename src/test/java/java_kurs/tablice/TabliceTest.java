package java_kurs.tablice;

import org.testng.annotations.Test;

public class TabliceTest {

    @Test
    public void tabliceTest () {
        Tablice tablice = new Tablice();

        tablice.dodajStudentow();
        tablice.przedstawStudentów();
    }
}
