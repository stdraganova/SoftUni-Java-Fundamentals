package List.Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Колко реда команди ще получим
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        //Получаваме входните команди
        List<String> guests = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(" ");
            String name = command[0];

            if (command.length == 3){ // Is going
                if (guests.contains(name)){
                    System.out.printf("%s is already in the list!", name);
                    System.out.println();
                }else {
                    guests.add(name);
                }
            }else if (command.length == 4){ // Is not going
                if (guests.contains(name)){
                    guests.remove(name);
                }else {
                    System.out.printf("%s is not in the list!", name);
                    System.out.println();
                }
            }
        }

        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
