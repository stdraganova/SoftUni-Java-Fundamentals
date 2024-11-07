package ObjectsAndClasses.Ex.AdvertisementMessage;

public class AdvertisementMessage {
    private String laudatoryPhrase;
    private String event;
    private String author;
    private String city;

    public void setLaudatoryPhrase(String laudatoryPhrase) {
        this.laudatoryPhrase = laudatoryPhrase;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString(){
        String message = String.format("%s %s %s - %s",laudatoryPhrase, event, author, city);
        return message;
    }
}
