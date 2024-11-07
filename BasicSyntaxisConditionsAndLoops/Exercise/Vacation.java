package BasicSyntaxisConditionsAndLoops.Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleNum = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();

        double totalPrice = 0;

        if (groupType.equals("students")){
          switch (day){
              case "friday":
                  totalPrice = peopleNum * 8.45;
                  break;

              case "saturday":
                  totalPrice = peopleNum * 9.80;
                  break;

              case "sunday":
                  totalPrice = peopleNum * 10.46;
                  break;
          }

          if (peopleNum >= 30){
              totalPrice = totalPrice * 0.85;
          }

        }else if (groupType.equals("business")) {
            if (peopleNum >= 100){
                peopleNum -= 10;
            }
            switch (day){
                case "friday":
                    totalPrice = peopleNum * 10.90;
                    break;

                case "saturday":
                    totalPrice = peopleNum * 15.60;
                    break;

                case "sunday":
                    totalPrice = peopleNum * 16;
                    break;
            }

        }else if (groupType.equals("regular")) {
            switch (day){
                case "friday":
                    totalPrice = peopleNum * 15;
                    break;

                case "saturday":
                    totalPrice = peopleNum * 20;
                    break;

                case "sunday":
                    totalPrice = peopleNum * 22.50;
                    break;
            }

            if (peopleNum >= 10 && peopleNum <= 20){
                totalPrice = totalPrice * 0.95;
            }

        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
