package java_kurs.interfejs;

import java_kurs.java_podstawy.PodstawoweAuto;
import org.testng.annotations.Test;

public class InterfejsTest {

    @Test
    public void interfejsTest () {
        Auto autoPremium = new AutoPremium();
        zeprezentujAuto(autoPremium);

        Auto auto = new PodstawoweAuto();
        zeprezentujAuto(auto);

    }

    public void zeprezentujAuto (Auto auto) {
        auto.jedz();
        auto.zatrzymaj();
        auto.zmienBieg();
    }

}

/*Stworzyliśmy java_kurs.interfejs Auto,
*  Stworzyliśmy klasę PodstawoweAuto która implementuje ten java_kurs.interfejs
*  Stworzyliśmy prosty test żeby sprawdzić czy klasa działa odpowiednio*/