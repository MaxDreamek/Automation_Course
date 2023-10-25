package lessons.lesson14.innerclasses;

public class Outer {

    public void beginOfTravel() {
        InnerElectric innerElectric = new InnerElectric();
        InnerEngine innerEngine = new InnerEngine();
        innerEngine.startEngine();
        innerElectric.turnOnIgnition();
    }

    private class InnerEngine {
        public void startEngine(){
            System.out.println("Starting Engine");
        }
    }
    private class InnerElectric {
        public void turnOnIgnition(){
            System.out.println("Turning on ignition");
        }
    }
}
