package lessons.lesson14.innerclasses;

public class LauncherForStaticInner {
    public static void main(String[] args) {
        OuterCarStatic.InnerElectric innerElectric = new OuterCarStatic.InnerElectric();
        innerElectric.turnOnIgnition();
    }
}
