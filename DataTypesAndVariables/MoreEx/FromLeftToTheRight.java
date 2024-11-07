package DataTypesAndVariables.MoreEx;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Създава нов Scanner обект за четене на входни данни от конзолата

        int number = Integer.parseInt(scanner.nextLine());  // Чете първия ред от входа, който съдържа броя на тестовите случаи, и го преобразува в цяло число

        // Цикъл, който се изпълнява 'number' пъти, за да обработи всеки от тестовите случаи
        for (int i = 0; i < number; i++) {
            // .trim() не е нужен в този случай, може да се използва и само split(" "), който ще раздели стринга по даденият в кавичките символ.(в случая space)
            String twoNumbers = scanner.nextLine().trim();  // Чете следващия ред от входа, премахва водещите и следващите празни места

            // .split() Разделя входния ред на две части по интервал (space)
            String[] parts = twoNumbers.split(" ");
            long firstNumber = Long.parseLong(parts[0]);  // Преобразува първата част на дълго число (long)
            long secondNumber = Long.parseLong(parts[1]);  // Преобразува втората част на дълго число (long)

            // Намира по-голямото от двете числа
            long largerNumber = Math.max(firstNumber, secondNumber);
            long sumOfDigits = 0;  // Инициализира променлива за сумата на цифрите

            // Цикъл за изчисляване на сумата на цифрите на по-голямото число
            while (largerNumber != 0) {
                sumOfDigits += Math.abs(largerNumber % 10);  // Добавя стойността на последната цифра на числото към сумата, използва Math.abs за отчитане на отрицателни цифри
                largerNumber /= 10;  // Премахва последната цифра на числото, като го дели на 10
            }

            System.out.println(sumOfDigits);  // Отпечатва сумата на цифрите на по-голямото число
        }

        scanner.close();  // Затваря Scanner обекта, за да освободи ресурсите
    }
}
