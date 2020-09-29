package java_kurs.identyfikatory;

public class BaseSeleniumClass {

    public String first = "publiczny";

    String second = "bez identyfikatora - domyslny";

    protected String third = "protected";

    private String fourth  = "private";

    public void checkAcces () {

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
