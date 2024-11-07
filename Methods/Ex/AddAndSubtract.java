package Methods.Ex;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sum = sumTwoNumbers(firstNum, secondNum);
        System.out.println(subtraction(sum, thirdNum));
    }
    public static int sumTwoNumbers(int firstNum, int secondNum){
        int sum = firstNum + secondNum;
        return sum;
    }

    public static int subtraction (int sum, int thirdNum){
        int result = sum - thirdNum;
        return result;
    }
}
