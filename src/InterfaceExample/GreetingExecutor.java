package InterfaceExample;

public class GreetingExecutor {
public static void main(String[] args) {
		
		//lambda expression
		
		GreetingDemo gd = () -> {
			System.out.println("Hi All! Welcome to the Java Session");
		};
		
		gd.greet();
		

	}

}


