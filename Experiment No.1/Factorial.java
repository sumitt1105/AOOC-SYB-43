import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        long result = factorial(number);

       
        System.out.println("The factorial of " + number + " is " + result);
    }

    
    public static long factorial(int n) {
        long fact = 1;

        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;  
        }

        
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}
