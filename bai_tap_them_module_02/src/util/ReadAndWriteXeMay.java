package util;

import model.XeMay;
import model.XeTai;

import java.util.ArrayList;
import java.util.List;

import static util.ReadAndWrite.readStringListFromCSV;
import static util.ReadAndWrite.writeStringListToCSV;

public class ReadAndWriteXeMay {
    public static List<XeMay> readXeMayListFromCSV(String filePath) {
        List<String> stringList = readStringListFromCSV(filePath);
        List<XeMay> xeMayList = new ArrayList<>();
        for (String element : stringList) {
            String[] array = element.split(",");
            XeMay xeMay = new XeMay(array[0], array[1], array[2], Integer.parseInt(array[3]), Double.parseDouble(array[4]));
            xeMayList.add(xeMay);
        }
        return xeMayList;
    }

    public static void writeXeMayListToCSV(String filePath, List<XeMay> xeMayList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (XeMay element : xeMayList) {
            stringList.add(element.getInfoToCSV());
        }
        writeStringListToCSV(filePath, stringList, append);
    }
//    public static List<XeMay> readXeMayListFromCSV(String filePath) {
//        List<XeMay> xeMayList = new ArrayList<>();
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
//                XeMay xeMay = new XeMay(array[0], array[1], array[2], Integer.parseInt(array[3]), Double.parseDouble(array[4]));
//                xeMayList.add(xeMay);
//            }
//            bufferedReader.close();
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//        return xeMayList;
//    }
//
//    public static void writeXeMayListToCSV(String filePath, List<XeMay> xeMayList, boolean append) {
//        File file = new File(filePath);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, append);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (XeMay element : xeMayList) {
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
