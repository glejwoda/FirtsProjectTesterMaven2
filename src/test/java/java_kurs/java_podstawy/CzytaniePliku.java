package java_kurs.java_podstawy;

import org.testng.annotations.Test;

import java.io.*;


public class CzytaniePliku {

    @Test
    public void czytaniePlikuTest() throws FileNotFoundException {

        File plik = new File("src/main/resources/tekst.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(plik))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
