


    
interface Walkable {
    void walk();
}

interface Runnable {
    void run();
}


public class Human implements Walkable, Runnable {
    @Override
    public void walk() {
        System.out.println("Human is walking.");
    }

    @Override
    public void run() {
        System.out.println("Human is running.");
    }

    public static void main(String[] args) {
    
        Human human = new Human();

       
        human.walk();

        human.run();
    }


    
}
