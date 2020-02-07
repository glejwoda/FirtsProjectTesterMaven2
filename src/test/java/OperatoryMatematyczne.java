import org.testng.annotations.Test;

public class OperatoryMatematyczne {

    @Test
    public void testOperatory (){
        int pierwszaLiczba = 5;
        int drugaLiczba = 2;

        /*suma */
        int suma = pierwszaLiczba + drugaLiczba;

        /*różnica*/
        int roznica = pierwszaLiczba - drugaLiczba;

        /*iloczyn*/
        int iloczyn = pierwszaLiczba * drugaLiczba;

        /*iloraz*/
        int iloraz = pierwszaLiczba / drugaLiczba;

        /*modulo*/
        int modulo = drugaLiczba%pierwszaLiczba;

        System.out.println(suma);
        System.out.println(roznica);
        System.out.println(iloczyn);
        System.out.println(iloraz);
        System.out.println(modulo);
    }
}
