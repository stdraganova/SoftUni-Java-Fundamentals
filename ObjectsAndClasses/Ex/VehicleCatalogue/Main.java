package ObjectsAndClasses.Ex.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vehicleInfo = scanner.nextLine().split(" ");
        List<Vehicle>vehicleCatalog = new ArrayList<>();

        while (!vehicleInfo[0].equals("End")){
            String type = vehicleInfo[0].substring(0,1).toUpperCase() + vehicleInfo[0].substring(1,vehicleInfo[0].length());
            String model = vehicleInfo[1];
            String color = vehicleInfo[2];
            int horsePower = Integer.parseInt(vehicleInfo[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleCatalog.add(vehicle);

            vehicleInfo = scanner.nextLine().split(" ");
        }

        String modelToDisplay = scanner.nextLine();

        while (!modelToDisplay.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleCatalog) {
                if (modelToDisplay.equals(vehicle.getModel())) {
                    System.out.printf("Type: %s%n", vehicle.getType());
                    System.out.printf("Model: %s%n", vehicle.getModel());
                    System.out.printf("Color: %s%n", vehicle.getColor());
                    System.out.printf("Horsepower: %s%n", vehicle.getHorsePower());
                }
            }

            modelToDisplay = scanner.nextLine();
        }

        int carSumHorsePower = 0;
        int truckSumHorsePower = 0;
        int countCars = 0;
        int countTruck = 0;

        for (Vehicle vehicle : vehicleCatalog){
            if (vehicle.getType().equals("Car")){
                countCars++;
                carSumHorsePower += vehicle.getHorsePower();
            } else if (vehicle.getType().equals("Truck")) {
                countTruck++;
                truckSumHorsePower += vehicle.getHorsePower();
            }
        }

        double averageCarHorsePowers = 0.0;
        double averageTruckHorsePowers = 0.0;
        if (countCars > 0){
            averageCarHorsePowers = carSumHorsePower * 1.0 / countCars;
        }
        if (countTruck > 0){
            averageTruckHorsePowers = truckSumHorsePower * 1.0 / countTruck;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHorsePowers);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTruckHorsePowers);
    }
}
