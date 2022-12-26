package ss16_java_io.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static void main(String[] args) {
        final String PATH = "src/ss16_java_io/read_file_csv/data.csv";
        List<Country> countries = new ArrayList<>();
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Country country = new Country(Integer.parseInt(array[0]), array[1], array[2]);
                countries.add(country);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Country element : countries) {
            System.out.println(element);
        }
    }
}
