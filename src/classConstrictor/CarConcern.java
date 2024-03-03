package classConstrictor;

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "ddd";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 1;
        this.color = "ddd";
    }
}
class Building {
    private String type;

    public void initialize (String type) {
        this.type = type;
    }

    //напишите тут ваш код

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}

