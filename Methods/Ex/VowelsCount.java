package Methods.Ex;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        countVowels(text);
    }
    //Метод, който принтира броя на гласните
    public static void countVowels(String text){
        //a, o, e, u, i
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o' || text.charAt(i) == 'e' || text.charAt(i) == 'u' || text.charAt(i) == 'i' ){
                count++;
            }
        }

        System.out.println(count);
    }
}
