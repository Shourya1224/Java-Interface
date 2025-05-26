public interface Shape {
    double area(); 
}
2. Implement the Circle Class

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; 
    }
}
3. Use the Interface Reference in the Main Method

public class Main {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5); 
        System.out.println("Area of Circle: " + myCircle.area()); 
    }
}