package java_kurs.java_podstawy;

public class Student {

    public String imie;

    public String nazwisko;

    public String grupa;

    public Student() {
        System.out.println("Cześć witaj w Constructorze ");
    }

    public void przedstawSie(){
        System.out.println("Cześć ! Nazywam się " + imie + " " + nazwisko + " " +grupa);
    }

    public Student (String noweImie, String noweNazwisko, String nowaGrupa){
        imie = noweImie;
        nazwisko = noweNazwisko;
        grupa = nowaGrupa;
    }


}
