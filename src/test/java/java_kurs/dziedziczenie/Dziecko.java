package java_kurs.dziedziczenie;

public class Dziecko extends Rodzic {

    protected String kolorOczu = "zielony";

    public void wypiszMojKolorOczu () {
        System.out.println("Mój kolor oczu to " + kolorOczu);
    }

    public void wypiszKolorWlosow () {
        System.out.println("Mój kolor włosów to " + kolorWłosów);
    }

    public void wypiszTypCeryITycie () {
        System.out.println("Mój cera jest " + typCery + "oraz skłonnosci do tycia " + sklonnoscDoTycia);
    }

    @Override
    public void umiejetnoscPlywania () {
        System.out.println("Być może mam talent do pływania po rodzicach ale jeszcze  nie umiem");
    }
}
