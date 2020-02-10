package java_podstawy;

import org.testng.annotations.Test;

public class InstrukcjaIfElse {

    /*instrukcja warunkowa wykonuje blok kodu jeśli warunek jest prawdziwy lub fałszywy*/

    @Test
    public void testInstrukcji(){
        sprawdzWiek(17);
        sprawdzWiek(19);

    }

    public void sprawdzWiek(int wiek){

        if(wiek < 18){
            System.out.println("Młodzieży do lat 18 alkoholu nie sprzedajemy");
        } else {
            System.out.println("Możesz kupić alkohol ;D");
        }

    }
}
