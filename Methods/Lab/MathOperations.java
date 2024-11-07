package Methods.Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());
        System.out.println(calcumationOfTwoNumbers(firstNum, operator, secondNum));
    }
    //Метод, който връща резултат от операцията с две числа
    public static int calcumationOfTwoNumbers(int firstNum, char operator, int secondNum){
        int result = 0;

        switch (operator){
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> result = firstNum / secondNum;
        }

        return result;
    }
}
