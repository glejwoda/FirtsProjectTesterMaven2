package interfejs;

public class AutoPremium  implements Auto{
    @Override
    public void jedz() {
        System.out.println("Jedziesz autem Premium ");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Hamulce tarczowe Premium ");
    }

    @Override
    public void otwórzSzybe() {
        System.out.println("Szyby otwierasz elektrycznie ");
    }

    @Override
    public void zmienBieg() {
        System.out.println("Biegi zmieniają się automatycznie ");
    }
    public void specyficznaMetodaPremium (){
        System.out.println("Posiadając Premium masz 30 % zniżki na paliwo");
    }

}
