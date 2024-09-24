package pracesesoubory;

import java.io.IOException;
import java.io.FileWriter;

public class UlozitSoubor {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/pracesesoubory/soubor.txt");
            myWriter.write("Hello World");
            myWriter.close();
            System.out.println("Soubor byl úspěšně uložen.");
        } catch (IOException e) {
            System.out.println("Nepodařilo se otevřít soubor.");
            e.printStackTrace();
        }
    }
}