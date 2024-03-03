package classConstrictor;

public class Skyscraper {
    private int floorsCount;
    private String developer;

    public Skyscraper (int floorsCount, String developer){
        this.floorsCount = floorsCount;
        this. developer = developer;
    }

    public Skyscraper (){
        this.floorsCount = floorsCount;
        this. developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
    }
}
