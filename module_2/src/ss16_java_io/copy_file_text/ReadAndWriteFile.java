package ss16_java_io.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        final String SOURCE_PATH = "src/ss16_java_io/copy_file_text/source";
        final String TARGET_PATH = "src/ss16_java_io/copy_file_text/target";
        List<String> text = new ArrayList<>();
        File sourceFile = new File(SOURCE_PATH);
        File targetFile = new File(TARGET_PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            // read
            fileReader = new FileReader(sourceFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                text.add(line);
            }
            bufferedReader.close();
            fileReader.close();
            // write
            fileWriter = new FileWriter(targetFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String element : text) {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
