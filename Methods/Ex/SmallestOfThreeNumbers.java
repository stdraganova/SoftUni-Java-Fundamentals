package Methods.Ex;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        minNum(firstNum, secondNum, thirdNum);
    }
    //Метод, който принтира най-малкото число
    public static void minNum(int firstNum, int secondNum, int thirdNum){
        int controlNum = Math.min(firstNum, secondNum);
        System.out.println(Math.min(controlNum, thirdNum));
    }
}
