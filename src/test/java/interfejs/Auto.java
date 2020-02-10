package interfejs;

public interface Auto {

    /*kontrakt który musi byc wypełniony przez klasy które ten interfejs implementują
    * w interfejsie domyślnie wszystkie metody są publiczne
    * będziemy wymuszać implementację tych 4 metod */

    String nazwa = "samochód";

     void jedz ();
     void zatrzymaj ();
     void otwórzSzybe ();
     void zmienBieg ();
}
