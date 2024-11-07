package ObjectsAndClasses.Lab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<>();

        for (int i = 1; i <= numberOfSongs ; i++) {
            String[] songInfo = scanner.nextLine().split("_");

            String typeList = songInfo[0];
            String name = songInfo[1];
            String time = songInfo[2];

            Song song = new Song(typeList, name, time);
            songsList.add(song);
        }

        String command = scanner.nextLine();

        for (Song currentSong : songsList){
            if (command.equals("all")){
                System.out.println(currentSong.getName());
            } else if (command.equals(currentSong.getTypeList())){
                System.out.println(currentSong.getName());
            }
        }
    }
}
