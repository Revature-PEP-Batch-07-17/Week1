public class PasswordGenerator {
        public static double operatorPasswordPortion(int age) {
            // Here we will work with the operators first:
            double num = 0;

            // add 5 to age
            num = age + 5;
            System.out.println("After adding 5: " + num);

            num = num * 11;
            System.out.println("After multiplying by 11: " + num);

            num = num - 20;
            System.out.println("After subtracting 20: " + num);

            num = num / 2;
            System.out.println("After dividing by 2: " + num);

            num += num % 3;
            System.out.println("After adding the remainder: " + num);

            num++;
            System.out.println("After adding 1: " + num);

            return num;
        }


        public static String stringMethodsPasswordPortion(String name, String favColor) {
            // Now we will work with the String methods
            favColor = favColor.toUpperCase();
            System.out.println("After making the string uppercase: " + favColor);

            favColor = favColor.substring(0,3);
            System.out.println("After taking the substring: " + favColor);

            String secondPart = favColor.concat(name);
            System.out.println("After using concat() with favColor and name: " + secondPart);


            char secondLetterOfName = name.charAt(1);
            System.out.println("The second letter of name is: " + secondLetterOfName);

            System.out.println("The length f name is: " + name.length());


            String newPassword = secondLetterOfName +  "HeLlO" + name.length() + secondPart;

            return newPassword;
        }

}
