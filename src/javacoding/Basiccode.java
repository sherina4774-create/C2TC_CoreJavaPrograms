package javacoding;


public class Basiccode {
    public static void main(String[] args) {
        int age = 21;
        double salary = 50000.00;
        boolean isPassed = true;
        char grade = 'A';

        // Simple arithmetic operations
        int increment = age + 1;
        int total = (int) salary + age; // Explicit cast to int

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Passed: " + isPassed);
        System.out.println("Grade: " + grade);
        System.out.println("Incremented Age: " + increment);
        System.out.println("Total: " + total);
    }
}