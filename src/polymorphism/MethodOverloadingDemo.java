package polymorphism;



public class MethodOverloadingDemo {

    // same method name with different parameters (int)
    int addition(int a, int b) {
        return a + b;
    }

    // same method name with different parameters (float)
    float addition(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodOverloadingDemo mod = new MethodOverloadingDemo();

        System.out.println("Addition is: " + mod.addition(5, 10));
        System.out.println("Addition is: " + mod.addition(5.5f, 7.7f));
    }
}