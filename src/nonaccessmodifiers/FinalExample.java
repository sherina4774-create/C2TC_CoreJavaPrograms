package nonaccessmodifiers;

//FinalExample.java
final class FinalExample {
 final int x = 100;

 final void print() {
     System.out.println("Print the value of x: " + x);
 }

 public static void main(String[] args) {
     FinalExample fe = new FinalExample();
     fe.print();
     // fe.x = 200; // This will cause a compilation error
     // fe.print();
 }
}

//Example.java (removed extends FinalExample because FinalExample is final)
class Example {
 void print() {
     System.out.println("Example class print method");
 }

 public static void main(String[] args) {
     Example ex = new Example();
     ex.print();
 }
}