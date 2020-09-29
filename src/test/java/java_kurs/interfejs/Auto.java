package java_kurs.interfejs;

public interface Auto {

    /*kontrakt który musi byc wypełniony przez klasy które ten java_kurs.interfejs implementują
    * w interfejsie domyślnie wszystkie metody są publiczne
    * będziemy wymuszać implementację tych 4 metod */

    String nazwa = "samochód";

     void jedz ();
     void zatrzymaj ();
     void otwórzSzybe ();
     void zmienBieg ();
}
