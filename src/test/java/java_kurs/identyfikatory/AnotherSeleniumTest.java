package java_kurs.identyfikatory;

public class AnotherSeleniumTest {

    public void accesCheck  () {
        BaseSeleniumClass baseSeleniumClass = new BaseSeleniumClass();
        System.out.println(baseSeleniumClass.first);
        System.out.println(baseSeleniumClass.second);
        System.out.println(baseSeleniumClass.third);
//        System.out.println(baseSeleniumClass.fourth);  /*Oznacza to że elementy private są dostępne tylko w obrębie tej samej klasy.*/
    }
}
