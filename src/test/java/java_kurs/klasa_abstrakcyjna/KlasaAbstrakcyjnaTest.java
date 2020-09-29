package java_kurs.klasa_abstrakcyjna;

import org.testng.annotations.Test;

public class KlasaAbstrakcyjnaTest {

    @Test
    public void abstarctClassTest () {
        Pies reksio = new Pies();
        reksio.poruszajSie();
        reksio.napijSieWody();
        reksio.wypiszPrzysmak();
        System.out.println(reksio.nazwa);

        Ptak tweety = new Ptak();
        tweety.nazwa = "Ptak";
        tweety.poruszajSie();
        tweety.napijSieWody();
        tweety.wypiszPrzysmak();
        System.out.println(tweety.nazwa);

    }
}
