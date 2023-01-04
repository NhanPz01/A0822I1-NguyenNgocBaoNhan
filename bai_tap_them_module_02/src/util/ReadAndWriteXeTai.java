package util;

import model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteXeTai extends ReadAndWrite {
    public static List<XeTai> readXeTaiListFromCSV(String filePath) {
        List<String> stringList = readStringListFromCSV(filePath);
        List<XeTai> xeTaiList = new ArrayList<>();
        for (String element : stringList) {
            String[] array = element.split(",");
            XeTai xeTai = new XeTai(array[0], array[1], array[2], Integer.parseInt(array[3]), Double.parseDouble(array[4]));
            xeTaiList.add(xeTai);
        }
        return xeTaiList;
    }

    public static void writeXeTaiListToCSV(String filePath, List<XeTai> xeTaiList, boolean append) {
        List<String> stringList = new ArrayList<>();
        for (XeTai element : xeTaiList) {
            stringList.add(element.getInfoToCSV());
        }
        writeStringListToCSV(filePath, stringList, append);
    }
//    public static List<XeTai> readXeTaiListFromCSV(String filePath) {
//        List<XeTai> xeTaiList = new ArrayList<>();
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
//                XeTai xetai = new XeTai(array[0], array[1], array[2], Integer.parseInt(array[3]), Double.parseDouble(array[4]));
//                xeTaiList.add(xetai);
//            }
//            bufferedReader.close();
//            fileReader.close();
//        } catch (FileNotFoundException e) {
//            e.getStackTrace();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//        return xeTaiList;
//    }

//    public static void writeXeTaiListToCSV(String filePath, List<XeTai> xeTaiList, boolean append) {
//        File file = new File(filePath);
//        FileWriter fileWriter = null;
//        BufferedWriter bufferedWriter = null;
//        try {
//            fileWriter = new FileWriter(file, append);
//            bufferedWriter = new BufferedWriter(fileWriter);
//            for (XeTai element : xeTaiList) {
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
