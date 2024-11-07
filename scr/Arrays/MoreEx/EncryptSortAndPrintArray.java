package Arrays.MoreEx;

import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //колко реда ще се въведат
        int lines = Integer.parseInt(scanner.nextLine());

        int[] result = new int[lines];
        for (int l = 0; l < lines; l++) {

            //Четем поредица от стрингове
            String string = scanner.nextLine();

            //преобразуваме стринга в масив от символи
            char[] symbols = string.toCharArray();
            int sum = 0;

            for (int i = 0; i < symbols.length; i++) {

                //кодът на всяка гласна умножаваме по дължината на стринга
                if (symbols[i] == 'a' || symbols[i] == 'e' || symbols[i] == 'i' || symbols[i] == 'o' || symbols[i] == 'u' ||
                        symbols[i] == 'A' || symbols[i] == 'E' || symbols[i] == 'I' || symbols[i] == 'O' || symbols[i] == 'U') {

                    int code = (int)symbols[i] * symbols.length;
                    sum += code;
                } else {
                    //Кодът на всяка съгласна го делим на дължината на стинга
                    int code = (int)symbols[i] / symbols.length;
                    sum += code;
                }

            }
            result[l] = sum;
        }

        for (int l = 0; l < lines; l++) {
            for (int j = l + 1; j < lines; j++) {

                if (result[l] > result[j]){
                    int temp = result[l];
                    result[l] = result[j];
                    result[j] = temp;
                }
            }
        }

        for (int i = 0; i < lines; i++) {
            System.out.println(result[i]);
        }
    }
}
