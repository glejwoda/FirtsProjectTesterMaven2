import org.testng.annotations.Test;

public class OperatoryLogicznePorównawcze {

    @Test
    public void testOperatorów(){

        int liczbaA = 2;
        int liczbaB = 5;

        System.out.println("------------------operatory porównawcze -------------------- ");

        System.out.println(liczbaA > liczbaB);
        System.out.println(liczbaA < liczbaB);
        System.out.println(liczbaA == liczbaB);
        System.out.println(liczbaA != liczbaB);
        System.out.println(liczbaA >= liczbaB);
        System.out.println(liczbaA <= liczbaB);


        System.out.println("------------------operatory logiczne -------------------- ");


        System.out.println(1>0 && 1>-1);
        System.out.println(1>2 || 0>2);
        System.out.println(2>3 && 1>0);
        System.out.println(1>0 || 3>5);





    }

}
