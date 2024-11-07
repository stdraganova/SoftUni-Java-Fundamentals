package Methods.Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(rectangleArea(width, length));
    }
    //Метод, който смята и връща лицето на правоъгълник
    public static int rectangleArea(int width, int length){
        int area = width * length;

        return area;
    }
}
