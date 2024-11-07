package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Създаваме масива
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        //Проверяваме дали сумата на елементите от ляво и сумата на елементите отдясно на елемента в позиция i са равни
        if (arr.length == 1){
            System.out.println("0");

        } else if (arr.length == 2) {
            System.out.println("no");

        }else {
            boolean equalSums = false;
            int index = 0;

            for (int i = 0; i < arr.length; i++) {

                index = i;

                //Сумата от ляво
                int leftSum = 0;
                for (int j = 0; j < i; j++) {
                    leftSum += arr[j];
                }

                //Дясна сума
                int rightSum = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    rightSum += arr[j];
                }

                //Сравняваме сумите
                if (leftSum == rightSum) {
                    equalSums = true;
                    break;
                }
            }
            if (equalSums) {
                System.out.println(index);
            } else {
                System.out.println("no");
            }
        }
    }
}
