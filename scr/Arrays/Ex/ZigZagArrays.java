package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Създаваме два празни масива
        int numOfElements = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[numOfElements];
        int[] secondArr = new int[numOfElements];

        //Попълваме двата масива
        for (int i = 0; i < numOfElements; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0){
                firstArr[i] = numbers[0];
                secondArr[i] = numbers[1];
            }else {
                firstArr[i] = numbers[1];
                secondArr[i] = numbers[0];
            }
        }

        //Принтираме двата масива
        for (int i = 0; i < numOfElements; i++) {
            System.out.print(firstArr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numOfElements; i++) {
            System.out.print(secondArr[i] + " ");
        }
    }
}
