package PEP.Week1.Day4.CodeEx;

public class Arrays {
    public static void main(String[] args) {

        int[] intArr = new int[3];

        intArr[0] = 6;
        intArr[1] = 14;
        intArr[2] = -24;
        intArr[0] = 52;

        //the array looks like this
        // {6, 14, -24}

        System.out.println(intArr[0]);
        System.out.println(intArr[1] + " " + intArr[2]);

        System.out.println("~~~~~~~~~~~~~");

        for(int i = 0; i < intArr.length; i++){
            System.out.println("This is i: " + i);
            System.out.println(intArr[i]);
        }

        System.out.println("~~~~~~~~~~~~~");

        String[] stringArr = {"Gomez", "Morticia", "Fester", "Lurch", "Pugsley", "Wednesday", "Thing"};

        for(int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }

        System.out.println("~~~~~~~~~~~~~");

        String temp = stringArr[5]; //Wednesday

        stringArr[5] = stringArr[6];

        stringArr[6] = temp;

         for(int i = 0; i < stringArr.length; i++) {
            System.out.println(stringArr[i]);
        }

        String l = "Hello";
    }
}
