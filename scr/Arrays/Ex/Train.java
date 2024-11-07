package Arrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем от конзолата брой вагони
        int wagonsNumber = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagonsNumber];
        
        //За всеки вагон получаваме броя на пътниците в него
        int sum = 0;

        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
            sum += train[i];
        }

        //Принтираме на един ред пътниците за всеки вагон и на следващ ред общия брой пътници на влака
        for (int i = 0; i < train.length; i++) {
            System.out.print(train[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
