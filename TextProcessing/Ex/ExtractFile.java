package TextProcessing.Ex;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] path = scanner.nextLine().split("\\\\");
        String fileName = path[path.length - 1].split("\\.")[0];
        String fileType = path[path.length - 1].split("\\.")[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", fileType);
    }
}
