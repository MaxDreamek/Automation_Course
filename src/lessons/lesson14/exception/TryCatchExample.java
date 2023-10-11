package lessons.lesson14.exception;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatchExample {
    public static void main(String[] args) throws IOException {
        writeSomethingWithThrows();
    }
    public static void writeSomething() {
        try {
            FileWriter fileWriter = new FileWriter("somefile.txt");
            fileWriter.close();
            fileWriter.write("some");
        } catch (IOException e){
            System.err.println("open the flow");
        } finally {
            System.out.println("Я выполнюсь всегда");
        }
        System.out.println("Программа работает дальше");
    }
    public static void writeSomethingWithThrows() throws IOException {

            FileWriter fileWriter = new FileWriter("somefile.txt");
            fileWriter.close();
            fileWriter.write("some");
        System.out.println("Программа работает дальше");
    }
}
