package java_podstawy;

public class Zmienne {

    /*kontenerki w pamięci które przechowuyją jakąś wartość- zdeklarowane  nie zainicjalizowane */

    // deklaracje zmiennych
    int pierwszaLiczba;
    int drugaLiczba;
    int suma;

    /*deklaracja i inizjalizacja w jednej linii*/
    int trzeciaLiczba = 3;

    String naszeImie = "Grzegorz";

    /*inicjalizacja zmiennych*/
    public void suma(){
        pierwszaLiczba = 2;
        drugaLiczba = 1;

        suma = pierwszaLiczba + drugaLiczba;

        System.out.println(suma);

    }
}
