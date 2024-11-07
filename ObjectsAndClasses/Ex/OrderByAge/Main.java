package ObjectsAndClasses.Ex.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Person> personList = new ArrayList<>();

        while (!input[0].equals("End")){
            String name = input[0];
            int id = Integer.parseInt(input[1]);
            int age = Integer.parseInt(input[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            input = scanner.nextLine().split(" ");
        }

        Collections.sort(personList, Comparator.comparing(Person :: getAge));

        for (Person person : personList){
            System.out.println(person);
        }
    }
}
