package lessons.lesson12.filleWritter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrriterExample2 {
    public static void main(String[] args) throws IOException {
        int start = 1;
        int finish = 9;
        writeToFile(start, finish);
    }
    public static void writeToFile(int start, int finish) throws IOException {
        FileWriter fileWriter = new FileWriter("src/lessons/lesson12/filleWritter/result2.txt");
        for (int i = start; i <=  finish; i++) {
            fileWriter.write("Это " + i + " итерация" + "\n");
        }

        fileWriter.close();
    }
}
