package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем масив от цели числа
        int[] numArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //Модифицираме масива след получаване на команда:
        String command = scanner.nextLine();
        //swap {index1} {index2}
        //multiply {index1} {index2}
        //decrease
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                String[] index = command.split(" ");
                int firstIndex = Integer.parseInt(index[1]);
                int secondIndex = Integer.parseInt(index[2]);

                int temp = numArray[firstIndex];
                numArray[firstIndex] = numArray[secondIndex];
                numArray[secondIndex] = temp;

            } else if (command.contains("multiply")) {
                String[] index = command.split(" ");
                int firstIndex = Integer.parseInt(index[1]);
                int secondIndex = Integer.parseInt(index[2]);

                int sum = numArray[firstIndex] * numArray[secondIndex];
                numArray[firstIndex] = sum;

            } else if (command.contains("decrease")) {
                for (int i = 0; i < numArray.length; i++) {
                    numArray[i]--;
                }
            }

            command = scanner.nextLine();
        }
            //Принтираме модифицирания масив
            for (int i = 0; i < numArray.length - 1; i++) {
                System.out.print(numArray[i] + ", ");
            }

        System.out.print(numArray[numArray.length -1]);
    }
}
