public class Comparisons {
    public static void compareStrings() {
        String string1 = "Hello World";
        String string2 = new String("Hello World");
        String string3 = "Hello World";

        /*
        * .equals() just compares value NOT memory location
        * we expect this to show up as true for any combination of these Strings
        * since they all hold the value: Hello World
        */
        if(string1.equals(string2)) {
            System.out.println("String 1 and 2 .equals() eachother");
        } else System.out.println("String 1 and 2 do NOT .equals() each other");

        if(string1.equals(string3)) {
            System.out.println("String 1 and 2 .equals() eachother");
        } else System.out.println("String 1 and 2 do NOT .equals() each other");

        /*
        * == compares value as well as location in memory (Aka are they the same exact object)
        * we expect this to show up as true ONLY if we compare string1 and string3 due to the String pool
        */

        if(string1 == string2){
            System.out.println("String 1 and 2 == eachother");
        } else System.out.println("String 1 and 2 do NOT == each other");

    }
}
