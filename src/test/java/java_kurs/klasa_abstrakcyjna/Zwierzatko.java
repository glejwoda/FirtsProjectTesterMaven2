package java_kurs.klasa_abstrakcyjna;

public abstract class Zwierzatko {

    public String nazwa = "Ssak";

    public abstract void  poruszajSie ();

    public abstract void  wypiszPrzysmak ();

    public void napijSieWody() {
        System.out.println("Piję wodę");
    }



    /*W klasie abstract możemy defiiniować metody które posiadają ciało jak i tylko deklarować takie metody a
    * implementacja ich znajdzie się w w klasach rozszerzających klasy abstrakcyjne*/

}
