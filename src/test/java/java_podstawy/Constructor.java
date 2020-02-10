package java_podstawy;

import org.testng.annotations.Test;

public class Constructor {

    @Test
    public void testConstructor(){

        Student drugiStudent = new Student("Marek", "Miroński", "gr 4");
        drugiStudent.przedstawSie();

    }

}
