package java_kurs.java_podstawy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OurFirstTest {

        // To jest mój komentarz, jednolinijkowy slash SayHello lalala

        /*komentarz wielolinijkowy
        * torororoorro;a,fdws
        * ;ldassdl;sakdsafdsadsa*/

        @Test
        public void sayHello(){
            System.out.println("Cześć ! Witam Cie w kursie Selenium");

            WebDriver driver = new FirefoxDriver();
        }


}
