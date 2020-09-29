package java_kurs.kolekcje;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    /*W interfejsie w Setach nie moży być duplikatów jak w Listach */

    Set<String> nicks = new HashSet<String>();

    public void dodajNicki () {
        nicks.add("popaprany");
        nicks.add("zaorany");
        nicks.add("ztrolowany");
        nicks.add("pizdanadglowo");
    }

    @Test
    public void SetListTest () {
        dodajNicki();
        nicks.add("kolejny user");
        nicks.add("kolejny user");
        System.out.println(nicks.size());
        System.out.println(nicks.contains("ztrolowany"));
        System.out.println(nicks.remove("ztrolowany"));
    }
}
