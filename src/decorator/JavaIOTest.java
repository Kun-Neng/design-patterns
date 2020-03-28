package src.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JavaIOTest {
    public static void showAllFilesFromDirectory(String filePath, String dir) {
        // File file = new File(".");
        File file = new File(filePath.concat(dir));
        for (String fileNames : file.list()) {
            System.out.println(fileNames);
        }
    }

    public static void main(String[] args) throws IOException {
        String filePath = new File("").getAbsolutePath();
        // System.out.println(filePath);
        // showAllFilesFromDirectory(filePath, "\\src\\decorator\\");
        String testFilePath = filePath.concat("\\src\\decorator\\test.txt");

        System.out.println("=== FileReader ===");
        FileReader fileReader = new FileReader(testFilePath);
        int ch = fileReader.read();
        while (ch >= 0) {
            System.out.println((char) ch);
            ch = fileReader.read();
        }
        fileReader.close();

        System.out.println("=== BufferedReader ===");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(testFilePath));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

        System.out.println("=== ReversedReader ===");
        ReversedReader reversedReader = new ReversedReader(new FileReader(testFilePath));
        // String rLine = reversedReader.readLine();
        String rLine = reversedReader.reverseLine();
        while (rLine != null) {
            System.out.println(rLine);
            // rLine = reversedReader.readLine();
            rLine = reversedReader.reverseLine();
        }
        reversedReader.close();
    }
}
