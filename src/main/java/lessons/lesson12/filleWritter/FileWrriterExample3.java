package lessons.lesson12.filleWritter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrriterExample3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/lessons/lesson12/filleWritter/result2.txt");
        Scanner scanner = new Scanner(fileReader);
        while ((scanner.hasNextLine())){
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }

}
