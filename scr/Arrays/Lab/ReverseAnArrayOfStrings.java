package Arrays.Lab;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //четем масив от стрингове -> на един ред, разделени със спейс
        String[] strings = scanner.nextLine().split(" ");
        //завъртаме масива
        for (int i = 0; i < strings.length/2; i++) {
            String temps = strings[i]; //инициализираме временна променлива, която ще съхранява стойността на вървия елемент.
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temps;
        }

        //принтираме елементите от зад на пред на един ред разделени със спейс
        System.out.print(String.join(" ", strings)); //използваме print(), за да принтираме елемрнтите на един ред
    }
}
