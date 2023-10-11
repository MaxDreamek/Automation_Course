package lessons.lesson14.innerclasses;

public class OuterCarStatic {


     static class InnerEngine {
        public void startEngine(){
            System.out.println("Starting Engine");
        }
    }
     static class InnerElectric {
        public void turnOnIgnition(){
            System.out.println("Turning on ignition");
        }
    }
}
