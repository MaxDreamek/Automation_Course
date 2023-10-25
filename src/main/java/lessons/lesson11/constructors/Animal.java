package lessons.lesson11.constructors;

public class Animal {

    private String animalName;
    private String animalAge;

    public void sayAnimalName() {
        System.out.println(this.animalName);
    }

    public void sayAge() {
        System.out.println(this.animalAge);
    }

    public Animal() {
    }

    public Animal(String animalName, String animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public void animalCountry() {
        System.out.println("From Ukraine");
    }
}
