package FinalExamExercises.Ex03;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder allStops = new StringBuilder(scanner.nextLine());
        String commandsInput = scanner.nextLine();

        while (!commandsInput.equals("Travel")){
            String[] command = commandsInput.split(":");

            switch (command[0]){
                case "Add Stop" -> {
                    int index = Integer.parseInt(command[1]);
                    String string = command[2];
                    if (index >= 0 && index < allStops.length()){
                        allStops.insert(index, string);
                    }
                }
                case "Remove Stop" -> {
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);

                    if (startIndex >= 0 && endIndex < allStops.length()){
                        allStops.replace(startIndex,endIndex + 1,"");
                    }
                }
                case "Switch" -> {
                    String oldString = command[1];
                    String newString = command[2];

                    if (allStops.indexOf(oldString) != -1){
                        allStops = new StringBuilder(allStops.toString().replaceAll(oldString,newString));
                    }
                }
            }
            System.out.println(allStops);
            commandsInput = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + allStops);
    }
}
