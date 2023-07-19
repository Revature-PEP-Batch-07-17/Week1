package PEP.Week1.Day2.CodeEx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // calls the Comparisons class and runs the compareStrings() method
        Comparisons.compareStrings();


        // create my scanner object so I can get info from user
        Scanner scan = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("Lets create a super secret, super secure password!\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("First, tell me your name so we can get started!");
        // Holds the user input in a String variable called name
        String name = scan.nextLine();
        System.out.println("Thank you " + name + ", now, tell me your favorite color (make sure it's atleast 4 characters long!)");
        String favColor = scan.nextLine();
        System.out.println("Ahhhh, I see, finally how old are you?");
        int age = scan.nextInt();
        System.out.println("Perfect! Hold on while I generate your super secret, super secure password...");
        System.out.println("Your password is: " + PasswordGenerator.stringMethodsPasswordPortion(name, favColor) + PasswordGenerator.operatorPasswordPortion(age));
        scan.close();
    }
}
