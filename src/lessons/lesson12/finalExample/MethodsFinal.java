package lessons.lesson12.finalExample;

public class MethodsFinal {
    final void sayHello() { // запрещает переопределение
        System.out.println("Hello");
    }
    public void sayAge() {
        System.out.println("23");
    }
}
