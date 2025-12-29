package exceptionHandling;


public class WithoutExceptionHandling {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // error occurs here
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("The program continues...");
    }
}
