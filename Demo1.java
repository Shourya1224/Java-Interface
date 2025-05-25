
interface A {
    void display();
}


interface B {
    void display();
}


public class Demo1 implements A, B {
   
    @Override
    public void display() {
        System.out.println("Display method from Demo class.");
    }

    
    public static void main(String[] args) {

        Demo1 demo = new Demo1();

     
        demo.display();
    }
}
