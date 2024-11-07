import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String twoNumbers = scanner.nextLine(); //.trim();

        String[] parts = twoNumbers.split(" ");
        long firstNumber = Long.parseLong(parts[0]);  // Преобразува първата част на дълго число (long)
        long secondNumber = Long.parseLong(parts[1]);

        System.out.println(twoNumbers);
        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }
}
