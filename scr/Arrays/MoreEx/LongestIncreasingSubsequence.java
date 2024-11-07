package Arrays.MoreEx;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        if (sequence.length == 1){
            System.out.println(sequence[0]);
        }else {
            int[] len = new int[sequence.length];//дължината на най-дългата нарастваща редица;
            int[] prev = new int[sequence.length];

            for (int i = 0; i < sequence.length; i++) {

            }
        }


    }
}

