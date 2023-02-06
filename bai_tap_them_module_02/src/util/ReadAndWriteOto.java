package util;

import model.Oto;

import java.util.ArrayList;
import java.util.List;

import static util.ReadAndWrite.readStringListFromCSV;
import static util.ReadAndWrite.writeStringListToCSV;

public class ReadAndWriteOto {
    public static List<Oto> readOtoListFromCSV(String filePath) {
        List<String> stringList = readStringListFromCSV(filePath);
        List<Oto> otoList = new ArrayList<>();
        for (String element : stringList) {
            String[] array = element.split(",");
            Oto oto = new Oto(array[0], array[1], array[2], Integer.parseInt(array[3]), Integer.parseInt(array[4]), Oto.KieuXe.valueOf(array[5]));
            otoList.add(oto);
        }
        return otoList;
    }

    public static void writeOtoListToCSV(String filePath, List<Oto> otoList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (Oto element : otoList) {
            stringList.add(element.getInfoToCSV());
        }
        writeStringListToCSV(filePath, stringList, append);
    }
//    public static List<Oto> readOtoListFromCSV(String filePath) {
//        List<Oto> otoList = new ArrayList<>();
//        File file = new File(filePath);
//        FileReader fileReader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            fileReader = new FileReader(file);
//            bufferedReader = new BufferedReader(fileReader);
//            String line = "";
//            String[] array = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                array = line.split(",");
//                Oto oto = new Oto(array[0], array[1], array[2], Integer.parseInt(array[3]), Integer.parseInt(array[4]), Oto.KieuXe.valueOf(array[5]));
//                otoList.add(oto);
//            }
//            bufferedReader.close();
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//        return otoList;
//    }
//
//    public static void writeOtoListToCSV(String filePath, List<Oto> otoList, boolean append) {
//        File file = new File(filePath);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, append);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (Oto element : otoList) {
//                bufferedWriter.write(element.getInfoToCSV());
//                bufferedWriter.newLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//    }
}
