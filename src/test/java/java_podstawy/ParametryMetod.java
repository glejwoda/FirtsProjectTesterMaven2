package java_podstawy;

import org.testng.annotations.Test;

public class ParametryMetod {

    public int suma(int pierwszaLiczba, int drugaLiczba){
        /*suma = pierwsza liczba + druga liczba */
        return  pierwszaLiczba + drugaLiczba;
    }

    public void przywitajSie(String imie){
        System.out.println("Witaj " + imie);
    }

    @Test
    public void testParametrow(){
        int sumaLiczb = suma(1,3);
        System.out.println(sumaLiczb);
        System.out.println(suma(2,6));
        przywitajSie("kasia");
        przywitajSie("Marek");
    }
}
