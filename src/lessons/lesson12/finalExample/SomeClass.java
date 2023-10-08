package lessons.lesson12.finalExample;

public class SomeClass extends MethodsFinal{

    public void aboutPerson() {
        sayAge();
        sayHello();
    }


    @Override
    public void sayAge() {
        super.sayAge();
    }
}
