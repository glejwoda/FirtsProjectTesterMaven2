package java_kurs.tablice;

import java_kurs.java_podstawy.Student;

public class Tablice {

    /*Tablice (Arrays) - są to struktuty które pozwalają gromadzić większe ilości danych w sposób usystematyzowany */

    int liczby [] = new int [5];

    public void ustawWartości () {
        liczby[0] = 1;
        liczby[1] = 10;
        liczby[2] = 25;
        liczby[3] = 100;
        liczby[4] = 150;
    }

    public void wypiszElementyTablicy () {

        for (int i=0; i<liczby.length; i++) {
            System.out.println(liczby[i]);
        }
    }

    Student studenci [] = new Student[2];

    public void dodajStudentow () {
        Student pierwszy = new Student ("Michał","Pierwszy","Gr 1");
        Student drugi = new Student ("Adam","Drugi","Gr 2");
        studenci[0] = pierwszy;
        studenci[1] = drugi;
    }

    public void przedstawStudentów () {

        /*Obsługa wyjątków - try/catch ! - przykład*/

        try {
            studenci[0].przedstawSie();
            studenci[1].przedstawSie();
            //studenci[2].przedstawSie();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Wystąpił wyjątek! Odwołujesz sie do elementu tablicy którego nie ma !");
        } finally {
            System.out.println("Tutaj znajduje sie coś innego. Zamykam połączenie do bazy danych ");
        }
    }

}
