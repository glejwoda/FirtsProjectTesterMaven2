package java_kurs.identyfikatory;

public class SpecificSeleniumTest extends BaseSeleniumClass {

    public void checkAccesFromSubClass () {

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
//        System.out.println(fourth); /// Oznacza to że elementy private są dostępne tylko w obrębie tej samej klasy.

    }
}
