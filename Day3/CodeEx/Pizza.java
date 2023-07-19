import java.util.Scanner;

/*
 * GOAL: As a User, I want a console app for my Pizza Shop: PEP Pizzeria.
 * I want it to allow customers to:
 * 1. choose what they want to order (Cheese/Peperoni Pizza, Drinks or Desserts)
 * 2. choose how many of that item to order
 * 3. get a total for how much it will cost
 */

public class Pizza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("              Welcome to ");
        System.out.println("             PEP Pizzeria!!!!");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        boolean loopSwitch = true;

        while (loopSwitch) {

            System.out.println("First, what would you like to order?");
            System.out.println("Enter a number between 1 - 5 to choose a menu option");
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      
            System.out.println("|1| Cheese Pizza" );
            System.out.println("|2| Peperoni" );
            System.out.println("|3| Drinks" );
            System.out.println("|4| Dessert" );
            System.out.println("|5| Exit program");
            System.out.println();

            int selection = scan.nextInt();
            

            switch (selection){
                case 1: {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("You selected Cheese Pizza, how many would you like?");

                    //gets the amount of pizza they want and then invokes the total method
                    //so that using that number so they can get the price
                    int numPizza = scan.nextInt();
                    total(numPizza);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
                case 2: {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("You selected Peperoni, how many would you like?");

                    //gets the amount of pizza they want and then invokes the total method
                    //so that using that number so they can get the price
                    int numPizza = scan.nextInt();
                    total(numPizza);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
                case 3: {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("You selected Drinks, how many would you like?");

                    //gets the amount of drinks they want and then runs the forloop to calculate the price
                    //so that using that number so they can get the price
                    int numDrinks = scan.nextInt();
                    double totalPrice = 0;

                    for (int index = 1; index <= numDrinks; index++) {
                        totalPrice += 5;
                    }
                    System.out.println("You owe: " + totalPrice + " for your drinks!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    break;
                }
                case 4: {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("You selected desserts?");

                    do {
                        System.out.println("Oh, I forgot we don't actually have desserts");
                        System.out.println("My bad!");
                    //the while portion of this code will never run (since it is set to false)
                    } while (false);
        
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                }
                default: {
                    System.out.println("Thanks for eating at PEP Pizzeria. Goodbye!");
                    System.out.println();
                    System.out.println();
            
                    // The while loop will loop forever if we don't force it's condition to be false
                    // we can do that by doing either of these two lines
                    loopSwitch = false;
                    //System.exit(0);

                    scan.close();
                }
            }
        }
    }


    public static void total(int numPizza) {

        double totalPrice = 0;

        for (int index = 1; index <= numPizza; index++) {
            totalPrice += 10;
        }
        System.out.println(totalPrice);
    }
}

}
