package BasicSyntaxisConditionsAndLoops.MoreEx;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;

        while (a < b || a < c){
            if (a < b){
                max = a;
                a = b;
                b = max;
            }
            if (b < c){
                max = b;
                b = c;
                c = max;
            }
            if (a < c){
                max = a;
                a = c;
                c = max;
            }
        }
        System.out.printf("%d%n %d%n %d%n", a, b, c);
    }
}
