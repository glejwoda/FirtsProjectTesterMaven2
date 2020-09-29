package java_kurs.java_podstawy;

import java_kurs.interfejs.Auto;

public class PodstawoweAuto implements Auto {

    private String model = "Tipo";
    private String marka = "Fiat";

    public void toJestMetodaSpecyficzna () {
        System.out.println("Metoda dla posiadaczy auta w wersji podstawowej - " + model + marka);
    }

    @Override
    public void jedz() {
        System.out.println("Jedziesz podstawowym modelem auta");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Zatrzymujesz auto używając hamulców bębnowych");

    }

    @Override
    public void otwórzSzybe() {
        System.out.println("Kręcisz korbą aby otworzyć szybę");

    }

    @Override
    public void zmienBieg() {
        System.out.println("Zmieniasz bieg manualną skrzynią");

    }
}
