package AssociativeArrays.Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        Map<String,String> parking = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfCommands ; i++) {
            String[] command = scanner.nextLine().split(" ");
            String userName = command[1];

            switch (command[0]){
                case "register" ->{
                    String licensePlate = command[2];
                    if (parking.containsKey(userName)){
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                    }else {
                        parking.put(userName, licensePlate);
                        System.out.printf("%s registered %s successfully%n", userName, licensePlate);
                    }
                }
                case "unregister" ->{
                    if (!parking.containsKey(userName)){
                        System.out.printf("ERROR: user %s not found%n", userName);
                    }else {
                        parking.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                    }
                }
            }
        }

        parking.entrySet().forEach(entry -> {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        });
        /* for (Map.Entry<String, String> entry : parking.entrySet()){
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        } */

    }
}
