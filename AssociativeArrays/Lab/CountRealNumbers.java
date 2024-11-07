package AssociativeArrays.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map <Double, Integer> numbers = new TreeMap<>();

        for (Double number : input){
            if (!numbers.containsKey(number)){
                numbers.put(number, 1);
            }else {
                int occurrences = numbers.get(number);
                occurrences++;
                numbers.put(number,occurrences);
            }
        }

        for (Map.Entry<Double,Integer> entry : numbers.entrySet()){
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
