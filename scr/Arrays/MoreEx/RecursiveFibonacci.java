package Arrays.MoreEx;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Четем броя на числата от конзолата
        int numbers = Integer.parseInt(scanner.nextLine());
        int result = getFibonacci(numbers);
        System.out.println(result);
    }

    //Създаваме метод, който да смята поредицата на Фибоначи

    public static int getFibonacci(int numbers){
        if (numbers == 1 || numbers == 2){
            return 1;
        }else {
            return getFibonacci(numbers - 1) + getFibonacci(numbers - 2);
        }
    }
}
