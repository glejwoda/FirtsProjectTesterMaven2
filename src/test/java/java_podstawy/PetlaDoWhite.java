package java_podstawy;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaDoWhite {

    @Test
    public void testPetliDoWhile () {

        int index = 0;


        /*Kod zawarty w sekcji DO wykona się zawsze conajmniej raz*/

        List<String> rzeczy = Arrays.asList("Lampa","Stolik","Sofa");

        do {
            System.out.println(rzeczy.get(index));
            index++;
        }while (index < rzeczy.size());
    }
}
