package pracesesoubory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NacistSoubor {
    public static void main(String[] args) {
        File myObj = new File("src/pracesesoubory/soubor.txt");
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nepodařilo se otevřít soubor.");
            e.printStackTrace();
        }
    }
}