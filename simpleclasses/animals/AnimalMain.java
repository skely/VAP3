package simpleclasses.animals;

public class AnimalMain {
    public static void main(String[] args) {
        Cat karl = new Cat("Claw", "black");
        Dog hans = new Dog("Rex", "bulldog");
        Cat lisa = new Cat("Whiskers", "white");
        Dog fido = new Dog("Buddy", "golden retriever");

        Animal[] pack = {karl, hans, lisa, fido};

        for(int i = 0; i < pack.length; i++) {
            pack[i].setAge(i*2+1);
            pack[i].makeSound();
        }

        for (Animal a : pack) {
            a.introduceYourself();
        }

        for (Animal a : pack) {
            a.growOlder();
        }

        System.out.println("After growing older.");

        for (Animal a : pack) {
            a.introduceYourself();
        }

    }
}
