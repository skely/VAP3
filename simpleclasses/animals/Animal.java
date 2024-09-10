package simpleclasses.animals;

class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this.name = name;
        age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void growOlder() {
        age++;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void introduceYourself() {
        if (age == 1)
            System.out.println("I am an animal named " + name + " and I am " + age + " year old.");
        else {
            System.out.println("I am an animal named " + name + " and I am " + age + " years old.");
        }

    }
}
