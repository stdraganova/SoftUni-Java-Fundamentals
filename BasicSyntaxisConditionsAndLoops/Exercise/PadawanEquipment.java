package BasicSyntaxisConditionsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double tenPercentMoreLightsabers = Math.ceil(0.10 * studentsCount)* lightsaberPrice;
        int freeBelts = studentsCount - (studentsCount / 6);
        double totalPrice = (freeBelts * beltPrice) + (studentsCount * (lightsaberPrice + robePrice)) + tenPercentMoreLightsabers;
        double diff = Math.abs(money - totalPrice);

        if (money >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
