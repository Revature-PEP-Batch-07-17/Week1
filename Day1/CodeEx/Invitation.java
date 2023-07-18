import java.util.Scanner;

public class Invitation {
    public static void main(String[] args) {
        // Allows me to take in user input
         Scanner scan = new Scanner(System.in);

        //prompt user for info
        System.out.println("Enter a person: ");
        // save info in variable
        // DataType name;
        String person = scan.nextLine();

        System.out.println("Enter an age"); // "\n"
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter a plural noun: ");
        String items = scan.nextLine();
        System.out.println("Enter a plural profession: ");
        String professions = scan.nextLine();
        System.out.println("Enter an event: ");
        String event = scan.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = scan.nextLine();
        System.out.println("Enter a nickname: ");
        String nickname = scan.nextLine();

        //create an invitation to give to the user using their input
        System.out.println();
        System.out.println("Dear " + person + ",");
        System.out.println("I want to come to my bday party! I am turning " + age + " years old!");
        System.out.println("There will be fun things like " +
                            items + " and " + professions + " at my party. There will even be a " +
                            event + " event!");
        System.out.println("Please come to my party this year. If not, I will cry "
                            + adjective + ".");
        System.out.println("Sincerely,");
        System.out.println(nickname);

        scan.close();
    }
}