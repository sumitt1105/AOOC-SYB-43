public class StaticExample {

    // Static variable
    static int count = 0;

    // Static block
    static {
        System.out.println("Static block is executed.");
        count = 10; // Initializing static variable count
    }

   
    public StaticExample() {
        count++;
        System.out.println("Constructor called. Current count: " + count);
    }

    // Static method
    public static void displayCount() {
        System.out.println("The current value of count is: " + count);
    }

    public static void main(String[] args) {
        
        StaticExample.displayCount();

        
        StaticExample obj1 = new StaticExample(); // Constructor will be called here
        StaticExample obj2 = new StaticExample(); // Constructor will be called again

        
        StaticExample.displayCount();
    }
}
