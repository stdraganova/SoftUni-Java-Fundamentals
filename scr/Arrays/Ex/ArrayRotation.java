package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        //ротираме елементите в масива
        for (int i = 0; i < rotations; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {

                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }

        //принтираме масива
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
