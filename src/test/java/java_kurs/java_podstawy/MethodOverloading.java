package java_kurs.java_podstawy;

import org.testng.annotations.Test;

public class MethodOverloading {

    @Test
    public void methodOverloadingTest () {
        Select autoSelect = new Select();

        autoSelect.selectBy(5);
        autoSelect.selectBy(" Volvo");
    }

}
