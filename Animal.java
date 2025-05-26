public interface Animal {
    void makeSound(); 
}

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); 
        myDog.makeSound(); 
    }
}