package util;

import model.HangSanXuat;
import service.impl.HangSanXuatService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteHangSanXuat {
    public static List<HangSanXuat> readHangSanXuatListFromCSV(String filePath) {
        List<HangSanXuat> hangSanXuatList = new ArrayList<>();
        File file = new File(filePath);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                HangSanXuat hangSanXuat = new HangSanXuat(array[0], array[1], array[2]);
                hangSanXuatList.add(hangSanXuat);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
        return hangSanXuatList;
    }

    public static void writeHangSanXuatListToCSV(String filePath, List<HangSanXuat> hangSanXuatList, boolean append) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (HangSanXuat element : hangSanXuatList) {
                bufferedWriter.write(element.getInfoToCSV());
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
