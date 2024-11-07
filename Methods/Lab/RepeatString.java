package Methods.Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatingString(string,repeatCount));
    }
    //Метод, който връща нов стринг (стария принтиран Н пъти)
    public static String repeatingString (String string, int repeatCount){

        String newString = "";

        for (int i = 0; i < repeatCount; i++) {
           newString = newString + string;
        }

        return newString;
    }
}
