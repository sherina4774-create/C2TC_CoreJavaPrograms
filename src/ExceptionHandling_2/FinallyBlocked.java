package ExceptionHandling_2;


	//Program to demonstrate Finally block


	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class FinallyBlocked {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.print("Enter the number : ");
				int number = scanner.nextInt();
				System.out.println((number % 2 == 0 )? " is Even" : " is Odd");
				return;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input...");

			} finally {
				System.out.println("In Finally....");
				scanner.close(); 
			}
		}
	}

