import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testStudent(){
        Student naszPierwszyStudent = new Student();
        naszPierwszyStudent.nazwisko = "Polański";
        naszPierwszyStudent.imie = "Mariusz";
        naszPierwszyStudent.grupa = "I";

        naszPierwszyStudent.przedstawSie();

        Student drugiStudent = new Student();
        drugiStudent.imie = "Miłosz";
        drugiStudent.nazwisko = "Kowalski";
        drugiStudent.grupa = "II";
        drugiStudent.przedstawSie();
    }

}
