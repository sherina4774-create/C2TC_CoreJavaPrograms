package exceptionHandling;

public class TryCatchDemo {

    // Method definition
    static float performDivision(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("I am in main method");

        try {
            float result = TryCatchDemo.performDivision(12f, 0f);
            System.out.println("Division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("I am in catch block: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("---------------------");

        System.out.println(TryCatchDemo.performDivision(12f, 5f));
        System.out.println(TryCatchDemo.performDivision(12f, 0f)); // Infinity (no exception for float)
    }
}
	