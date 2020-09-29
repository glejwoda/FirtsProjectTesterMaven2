package java_kurs.kolekcje;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    /*Implementacja Mapy - pozwala na przydzielenie wartości String do danego numeru Integer, który zawsze jest unikalny*/

    Map<Integer,String> dziennik  = new HashMap<Integer, String>();

    public void dodajUczniow () {

        dziennik.put(1,"Kowalska");
        dziennik.put(2,"Nowak");
        dziennik.put(3,"Opolska");
        dziennik.put(4,"Jastrząb");
    }

    @Test
    public void mapTest () {
        dodajUczniow();
        System.out.println(dziennik.size());
        dziennik.remove(1);
        dziennik.put(2,"Nowa wartość");
        System.out.println(dziennik.size());
        System.out.println(dziennik.get(2));
        System.out.println(dziennik.containsKey(3));
    }

}
