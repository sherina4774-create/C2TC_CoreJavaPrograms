package polymorphism;

//Parent class
class AnimalClass {

 void sound() {
     System.out.println("Animals can make sound");
 }
}

//Child class
class Lion extends AnimalClass {

 @Override
 void sound() {
     System.out.println("Lion roars");
 }
}

//Main class
public class MethodOverridingDemo {

 public static void main(String[] args) {

     AnimalClass ac = new Lion(); // Upcasting
     ac.sound(); // Calls overridden method
 }
}
	
