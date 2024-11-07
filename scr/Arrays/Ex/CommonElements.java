package Arrays.Ex;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Създаваме два масива
        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        //Сравняваме масивите
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {
                if (firstArr[i].equals(secondArr[j])){
                    //Принтираме сьодните елементи
                    System.out.print(firstArr[i] + " ");
                }
            }
        }
    }
}
