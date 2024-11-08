package ObjectsAndClasses.Ex.VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower){
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getColor() {
        return color;
    }
}
