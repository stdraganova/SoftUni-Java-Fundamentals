package ObjectsAndClasses.Ex.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<Person>personsList = new ArrayList<>();

        for (int i = 1; i <= numberOfPeople ; i++) {
            String[] personalInfo = scanner.nextLine().split(" ");
            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);

            if (age > 30){
                Person person = new Person(name, age);
                personsList.add(person);
            }
        }

        for (Person person : personsList){
            System.out.println(person);
        }
    }
}
