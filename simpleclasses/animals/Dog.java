package simpleclasses.animals;

public class Dog extends Animal{
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void makeSound() {
        System.out.println("Woof woof");
    }
}
