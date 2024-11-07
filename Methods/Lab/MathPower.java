package Methods.Lab;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f",power(firstNum, secondNum));
    }
    //Метод, който връща стойността на число повдигнато на степен
    public static double power(int firstNum, int secondNum){
        double result = Math.pow(firstNum,secondNum);
        return result;
    }
}
