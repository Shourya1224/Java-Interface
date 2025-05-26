public interface Vehicle 
    default void start() {
        System.out.println("Vehicle is starting...");
    }

2. Implement the Car Class

public class Car implements Vehicle {
  
}
3. Call the Default Method in the main Method
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();  
    }
}