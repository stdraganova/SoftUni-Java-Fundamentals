package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем масив от цели числа
        int[] numArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //Четем специално число
        int specialNum = Integer.parseInt(scanner.nextLine());
        //Търсил сумата на кои числа е равна на специалното число
        for (int i = 0; i < numArray.length - 1; i++) {
            int firstNum = numArray[i];
            for (int j = i + 1; j < numArray.length; j++) {
                int secondNumber = numArray[j];
                if (firstNum + secondNumber == specialNum){
                    System.out.print(firstNum + " " + secondNumber);
                    System.out.println();
                }
            }
        }
    }
}
