package Arrays.MoreEx;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int[] previousLine = new int[0];

        //редовете
        for (int i = 0; i < lines; i++) {
            int[] numbers = new int[i + 1];
            numbers[0] = 1;
            numbers[numbers.length - 1] = 1;

            //колоните
                for (int j = 1; j < i; j++) {
                    numbers[j] = previousLine[j - 1] + previousLine[j];
                }



            for (int element = 0; element < numbers.length; element++) {
                System.out.print(numbers[element] + " ");
            }
            System.out.println();

            previousLine = numbers;
        }
    }
}
