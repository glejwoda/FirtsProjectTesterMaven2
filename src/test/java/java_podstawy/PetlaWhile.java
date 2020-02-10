package java_podstawy;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PetlaWhile {

    @Test
    public void testPetlaWhile (){

        int index = 0;
        List<String> owoce = Arrays.asList("Jabłko","Banan", "Pomarańcza");

        while (index < owoce.size()) {
            System.out.println(owoce.get(index));
            index++;
        }


    }

}
