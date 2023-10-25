package lessons.lesson9.override;

public class LittleCat extends  Cat{

    @Override
    public void voice() {
        System.out.println("It is a little cat");
        super.voice();
    }
}
