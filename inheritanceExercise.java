class Vehicle {
    String model;
    int year;
    double fuelEfficiency;

    Vehicle(String model, int year, double fuelEfficiency) {
        this.model = model;
        this.year = year;
        this.fuelEfficiency = fuelEfficiency;
    }

    double calculateFuelConsumption(int distance) {
        return distance / fuelEfficiency;
    }
}

class Car extends Vehicle {
    int numDoor;

    Car(int numDoor, String model, int year, double fuelEfficiency) {
        super(model, year, fuelEfficiency);
        this.numDoor = numDoor;
    }

    @Override
    double calculateFuelConsumption(int distance) {
        return distance / (fuelEfficiency - ((numDoor * 0.1)));
    }

}

class Motercycle extends Vehicle {
    boolean hasSideCar;

    Motercycle(boolean hasSideCar, String model, int year, double fuelEfficiency) {
        super(model, year, fuelEfficiency);
        this.hasSideCar = hasSideCar;
    }

    @Override
    double calculateFuelConsumption(int distance) {
        double hasSideCarEffect;
        if (hasSideCar) {
            hasSideCarEffect = 2;
            return (distance / (fuelEfficiency - hasSideCarEffect));
        } else {
            return (distance / (fuelEfficiency));
        }

    }
}

public class inheritanceExercise {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("md20", 2003, 30.0);
        Car car = new Car(4, "yaris879", 2013, 40.0);
        Motercycle cycle = new Motercycle(true, "Mc32", 2000, 70.0);

        double output = vehicle.calculateFuelConsumption(200);
        double output1 = car.calculateFuelConsumption(200);
        double output2 = cycle.calculateFuelConsumption(200);

        System.out.println(output);
        System.out.println(output1);
        System.out.println(output2);
    }
}
