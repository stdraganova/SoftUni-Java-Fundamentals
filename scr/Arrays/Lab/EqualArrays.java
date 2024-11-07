package Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Четем два масива
        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        //Сравняваме дължините на масивите
        int maxLength = 0;

        if (firstArr.length > secondArr.length){
            maxLength = firstArr.length;
        }else {
            maxLength = secondArr.length;
        }

        //Сравняваме елементите на двата масива
        //Ако са еднакви принтираме сумата на единия
        int diffIndex = 0;
        int sum = 0;
        boolean isIdentical = true;

        for (int i = 0; i < maxLength; i++) {
            if (firstArr[i] != secondArr[i]){
                isIdentical = false;
                diffIndex = i;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }else {
                sum += firstArr[i];
            }
        }

        //Принтираме на конзолата дали са еднакви
        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
