package List.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courseSchedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String command = scanner.nextLine();
        //Команди:
        //Add:{lessonTitle}
        //Insert:{lessonTitle}:{index}
        //Remove:{lessonTitle}
        //Swap:{lessonTitle}:{lessonTitle}
        //Exercise:{lessonTitle}
        while (!command.equals("course start")){
            String[] commandParts = command.split(":");
            switch (commandParts[0]){
                case "Add" -> {
                    if (courseSchedule.contains(commandParts[1])){
                        break;
                    }
                    courseSchedule.add(commandParts[1]);
                }
                case "Insert" -> {
                    if (courseSchedule.contains(commandParts[1])){
                        break;
                    }
                    courseSchedule.add(Integer.parseInt(commandParts[2]), commandParts[1]);
                }
                case "Remove" -> {
                    if (courseSchedule.contains(commandParts[1])){
                        String element = commandParts[1] + "-" + "Exercise";
                        courseSchedule.remove(commandParts[1]);
                        if (courseSchedule.contains(element)){
                            courseSchedule.remove(element);
                        }
                    }
                }
                case "Swap" -> {
                    if (courseSchedule.contains(commandParts[1]) && courseSchedule.contains(commandParts[2])){
                        int firstIndex = courseSchedule.indexOf(commandParts[1]);
                        int secondIndex = courseSchedule.indexOf(commandParts[2]);
                        courseSchedule.set(firstIndex,commandParts[2]);
                        courseSchedule.set(secondIndex,commandParts[1]);

                        String firstElement = commandParts[1] + "-" + "Exercise";
                        String secondElement = commandParts[2] + "-" + "Exercise";

                        if (courseSchedule.contains(firstElement)){
                            courseSchedule.remove(firstElement);
                            courseSchedule.add(secondIndex + 1, firstElement);
                        }
                        if (courseSchedule.contains(secondElement)){
                            courseSchedule.remove(secondElement);
                            courseSchedule.add(firstIndex + 1, secondElement);
                        }
                    }
                }
                case "Exercise" -> {
                    String element = commandParts[1] + "-" + "Exercise";
                    if (!courseSchedule.contains(commandParts[1])){
                        courseSchedule.add(commandParts[1]);
                    }
                    if (!courseSchedule.contains(element)){
                        int indexOfLesson = courseSchedule.indexOf(commandParts[1]);
                        courseSchedule.add(indexOfLesson + 1, element);
                    }
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < courseSchedule.size(); i++) {
            System.out.printf("%d.%s",i + 1, courseSchedule.get(i));
            System.out.println();
        }
    }
}
