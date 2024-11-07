package List.Ex;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Четем входа от конзолата
        String input = scanner.nextLine();
        //Преобразуваме входа в лист и го сплитваме(разделяме) по |
        List<String> list = Arrays.stream(input.split("\\|"))
                .collect(Collectors.toList());
        //Вход: {1 2 3 |4 5 6 | 7 8} -> {"1 2 3 ", "4 5 6 ", " 7 8"}
        //Получаваме лист от няколко масива
        //Обръщаме листа с масиви отзад напред
        //{"1 2 3 ", "4 5 6 ", " 7 8"} -> {" 7 8", "4 5 6 ", "1 2 3 "}
        Collections.reverse(list);
        //Премахваме всички единични и двойни спейсове и ги заменяме с по един
        //Превръщаме листа обратно в стринг
        //"%s+" -> един или повече спейсове
        //trim() - изрязва, ако има спейсове в началото и края на стринга
        for (String text : list){
            text = text.replaceAll("%s+", " ");
            System.out.print(text.trim() + " ");
        }
        //Изрязваме, ако има спейсове в началото и края на стринга
        //Принтираме резултата
    }
}
