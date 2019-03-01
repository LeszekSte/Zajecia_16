import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class zadanie_2 {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("magazyn.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        List<Produkt> produkts = new ArrayList<>();

        while ((line = bufferedReader.readLine()) != null) {

                String[] split = line.split(";");
                String nazwa = String.valueOf(split[0]);
                BigDecimal brutto = new BigDecimal(split[1]);
                BigDecimal vat = new BigDecimal(split[2]);
                produkts.add(new Produkt(nazwa,brutto,vat));
        }
                obliczNetto(produkts);
    }


       public static void obliczNetto(List produkts){


       }

}
