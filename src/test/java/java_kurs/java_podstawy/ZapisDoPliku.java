package java_kurs.java_podstawy;

import org.testng.annotations.Test;

import java.io.*;

public class ZapisDoPliku {

    @Test
    public void zapisDoPlikuTest () {

        File file = new File("src/main/resources/zapis.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("To jest tekst do zapisania w  pliku !!!! sadsaadsaads");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
