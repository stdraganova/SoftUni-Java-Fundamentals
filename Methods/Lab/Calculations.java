package Methods.Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (input){
            case "add" -> add(firstNum, secondNum);
            case "multiply" -> multiply(firstNum, secondNum);
            case "subtract" -> subtract(firstNum, secondNum);
            case "divide" -> divide(firstNum, secondNum);
        }
    }
    //Метод за събиране, който принтира резултата
    public static void add(int firstNum, int secondNum){
        System.out.println(firstNum + secondNum);
    }
    //Метод за изваждане, който принтира резултата
    public static void subtract(int firstNum, int secondNum){
        System.out.println(firstNum - secondNum);
    }
    //Метод за умножение, който принтира резултата
    public static void multiply(int firstNum, int secondNum){
        System.out.println(firstNum * secondNum);
    }
    //Метод за деление, който принтира резултата
    public static void divide(int firstNum, int secondNum){
        System.out.println(firstNum / secondNum);
    }
}
