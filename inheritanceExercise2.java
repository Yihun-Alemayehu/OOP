class Vehicle {
    String model;
    int year;
    double fuelEfficiency;

    // Constructor
    public Vehicle(String model, int year, double fuelEfficiency) {
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
    }

    // Method to calculate fuel consumption
    public double calculateFuelConsumption(int distance) {
        return distance / fuelEfficiency;
    }
}

class Car extends Vehicle {
    int numDoors;

    // Constructor
    public Car(String model, int year, double fuelEfficiency, int numDoors) {
        super(model, year, fuelEfficiency);
        this.numDoors = numDoors;
    }

    // Override the calculateFuelConsumption method
    @Override
    public double calculateFuelConsumption(int distance) {
        return distance / (fuelEfficiency - (numDoors * 0.1));
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    // Constructor
    public Motorcycle(String model, int year, double fuelEfficiency, boolean hasSidecar) {
        super(model, year, fuelEfficiency);
        this.hasSidecar = hasSidecar;
    }

    // Override the calculateFuelConsumption method
    @Override
    public double calculateFuelConsumption(int distance) {
        return distance / (hasSidecar ? fuelEfficiency - 2 : fuelEfficiency);
    }
}

// Main class
public class inheritanceExercise2 {
    public static void main(String[] args) {
        // Create objects for each type of vehicle
        Vehicle genericVehicle = new Vehicle("Generic", 2023, 20.0);
        Car myCar = new Car("Toyota", 2022, 25.0, 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley", 2021, 30.0, true);

        // Demonstrate the use of inheritance by calling calculateFuelConsumption method
        System.out.println("Generic Vehicle Fuel Consumption: " + genericVehicle.calculateFuelConsumption(100));
        System.out.println("Car Fuel Consumption: " + myCar.calculateFuelConsumption(100));
        System.out.println("Motorcycle Fuel Consumption: " + myMotorcycle.calculateFuelConsumption(100));
    }
}
