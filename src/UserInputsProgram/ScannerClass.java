package UserInputsProgram;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your TNS UID:");
        int uid = sc.nextInt();

        System.out.println("Enter your Department:");
        int dept = sc.nextInt();

        System.out.println("The TNS UID is: " + uid);
        System.out.println("The Dept is: " + dept);

        sc.close();
    }
}