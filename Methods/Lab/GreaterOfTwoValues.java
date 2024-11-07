package Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int" -> {
                int n1 = Integer.parseInt(scanner.nextLine());
                int n2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(n1, n2));
            }
            case "char" -> {
                char ch1 = scanner.nextLine().charAt(0);
                char ch2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(ch1, ch2));
            }
            case "string" -> {
                String str1 = scanner.nextLine();
                String str2 = scanner.nextLine();
                System.out.println(getMax(str1,str2));
            }
        }
    }
    public static int getMax(int n1, int n2){
        return Math.max(n1, n2);
    }

    public static char getMax(char ch1, char ch2){
        if ((int)ch1 > (int) ch2){
            return ch1;
        }else {
            return ch2;
        }
    }

    public static String getMax(String str1, String str2){
        if (str1.compareTo(str2) >=0){
            //compareTo връща разликата на два стринга като цяло число.
            //str1.length() - str2.length < 0, което значи че вторият стринг е по-дълъг
            return str1 ;
        }else {
            return str2;
        }
    }
}
