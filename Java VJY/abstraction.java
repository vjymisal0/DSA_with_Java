class Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The animal makes a sound");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The dog says: bow wow");
    }
}

public class abstraction {

    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        myDog.animalSound();
        myDog.sleep();
    }
}
