package java_kurs.java_podstawy;
/*<select id="cars">
  <option value="volvo">Volvo</option>
  <option value="saab">Saab</option>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>*/

public class Select {

    public void selectBy (String visibleText) {
        System.out.println("Wybieram wartość zawierającą tekst" + visibleText);

    }

    public void selectBy (int index) {
        System.out.println("Wybieram wartość index " + index);
    }

    /*W zależności od tego jaki typ argumentu podamy, Java rozpozna której metody chcemy użyc
    * Używanie takich samych metod nazywamy ovelloading-em */

}
