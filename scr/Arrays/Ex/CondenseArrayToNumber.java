package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем масив от цели числа
        int[] numArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //Кондензираме числата // 1 2 3 -> 1+2 2+3 -> 3+5 ->8
        if (numArray.length == 1){
            System.out.print(numArray[0]);
        }else {
            //Създаваме нов масив, чиято дължина ще е оригиналният масив -1
            //Масивът намалява всеки път с 1 до достигане на един единствен инт.
            while (numArray.length > 1) {
                int[] condensed = new int[numArray.length - 1];

                for (int i = 0; i < numArray.length - 1; i++) {

                    condensed[i] = numArray[i] + numArray[i + 1];
                }
                numArray = condensed;
            }
            System.out.print(numArray[0]);
        }
        
    }
}
