package ObjectsAndClasses.Ex.AdvertisementMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfMessages; i++) {
            String phrase = phrase();
            String event = events();
            String author = authors();
            String city = cities();

            AdvertisementMessage message = new AdvertisementMessage();
            message.setLaudatoryPhrase(phrase);
            message.setEvent(event);
            message.setAuthor(author);
            message.setCity(city);

            System.out.println(message);
        }

    }

    public static String phrase (){
        List<String> phrasesList = new ArrayList<>();

        String phrase1 = "Excellent product.";
        String phrase2 = "Such a great product.";
        String phrase3 = "I always use that product.";
        String phrase4 = "Best product of its category.";
        String phrase5 = "Exceptional product.";
        String phrase6 = "I can’t live without this product.";

        phrasesList.add(phrase1);
        phrasesList.add(phrase2);
        phrasesList.add(phrase3);
        phrasesList.add(phrase4);
        phrasesList.add(phrase5);
        phrasesList.add(phrase6);

        Random rnd = new Random();
        int randomPhrase = rnd.nextInt(phrasesList.size());
        String phrase = phrasesList.get(randomPhrase);

        return  phrase;
    }

    public  static  String events(){
        String event1 = "Now I feel good.";
        String event2 = "I have succeeded with this product.";
        String event3 = "Makes miracles. I am happy of the results!";
        String event4 = "I cannot believe but now I feel awesome.";
        String event5 = "Try it yourself, I am very satisfied.";
        String event6 = "I feel great!";

        List<String> eventsList = new ArrayList<>();
        eventsList.add(event1);
        eventsList.add(event2);
        eventsList.add(event3);
        eventsList.add(event4);
        eventsList.add(event5);
        eventsList.add(event6);

        Random rnd = new Random();
        int randomEvent = rnd.nextInt(eventsList.size());
        String event = eventsList.get(randomEvent);

        return  event;
    }

    public  static String authors(){
        String author1 = "Diana";
        String author2 = "Petya";
        String author3 = "Stella";
        String author4 = "Elena";
        String author5 = "Katya";
        String author6 = "Iva";
        String author7 = "Annie";
        String author8 = "Eva";

        List<String> authorsList = new ArrayList<>();
        authorsList.add(author1);
        authorsList.add(author2);
        authorsList.add(author3);
        authorsList.add(author4);
        authorsList.add(author5);
        authorsList.add(author6);
        authorsList.add(author7);
        authorsList.add(author8);

        Random rnd = new Random();
        int randomAuthor = rnd.nextInt(authorsList.size());
        String author = authorsList.get(randomAuthor);

        return author;
    }

    public  static String cities(){
        String city1 = "Burgas";
        String city2 = "Sofia";
        String city3 = "Plovdiv";
        String city4 = "Varna";
        String city5 = "Ruse";

        List<String>citiesList = new ArrayList<>();
        citiesList.add(city1);
        citiesList.add(city2);
        citiesList.add(city3);
        citiesList.add(city4);
        citiesList.add(city5);

        Random rnd = new Random();
        int randomCity = rnd.nextInt(citiesList.size());
        String city = citiesList.get(randomCity);

        return city;
    }
}
