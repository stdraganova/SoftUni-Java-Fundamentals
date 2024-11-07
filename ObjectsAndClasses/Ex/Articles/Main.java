package ObjectsAndClasses.Ex.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleInfo = scanner.nextLine().split(", ");
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        String title = articleInfo[0];
        String content = articleInfo[1];
        String author = articleInfo[2];

        Article article = new Article(title, content, author);

        for (int i = 1; i <= numberOfCommands ; i++) {
            String[] command = scanner.nextLine().split(": ");

            switch (command[0]){
                case "Edit" ->{
                 String newContent = command[1];
                 article.setContent(newContent);
                }
                case "ChangeAuthor" -> {
                    String newAuthor = command[1];
                    article.setAuthor(newAuthor);
                }
                case "Rename" -> {
                    String newTitle = command[1];
                    article.setTitle(newTitle);
                }
            }
        }

        System.out.println(article);
    }
}
