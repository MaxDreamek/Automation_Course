package lessons.lesson12.filleWritter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/lessons/lesson12/filleWritter/result.txt");
        fileWriter.write("Hello world");
        fileWriter.write(" Hello Anna");
        fileWriter.close();
    }
}
