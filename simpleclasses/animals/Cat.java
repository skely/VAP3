package simpleclasses.animals;

public class Cat extends Animal{
    private String color;
    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void makeSound() {
        System.out.println("Meow");
    }

    public void introduceYourself() {
        if (getAge() == 1)
            System.out.println("I am a " + color + " cat named " + getName() + " and I am " + getAge() + " year old.");
        else {
            System.out.println("I am a " + color + " cat named " + getName() + " and I am " + getAge() + " years old.");
        }
    }
}
