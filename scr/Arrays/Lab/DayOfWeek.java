package Arrays.Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = Integer.parseInt(scanner.nextLine());
        String[] arrOfDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

       switch (dayNumber){
           case 1:
               System.out.println(arrOfDays[0]);
               break;

           case 2:
               System.out.println(arrOfDays[1]);
               break;

           case 3:
               System.out.println(arrOfDays[2]);
               break;

           case 4:
               System.out.println(arrOfDays[3]);
               break;

           case 5:
               System.out.println(arrOfDays[4]);
               break;

           case 6:
               System.out.println(arrOfDays[5]);
               break;

           case 7:
               System.out.println(arrOfDays[6]);
               break;

           default:
               System.out.println("Invalid day!");
               break;
       }
    }
}
