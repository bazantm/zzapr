package zzapr.w05;

public class Garage {
    final static int MAX_CARS_GARAGE = 100;
    private int carCounter = 0;

    //instance variable cars - it is valid for all this class
    private Car[] cars = new Car[MAX_CARS_GARAGE];

    public void addCarToGarage(Car car) {
        //TODO write a logic here
        if (carCounter < MAX_CARS_GARAGE &&
                car != null) {
            cars[carCounter] = car;
            carCounter++;
        } else {
            System.out.println("Garage is full or " +
                    "car is null !!!");
        }
    }

    public Car getMostExpensiveCar() {
        Car mostExpensive = null;
        if (0 < carCounter) {
            mostExpensive = cars[0];

            for (int i = 1; i < carCounter; i++) {
                if (mostExpensive.getPricePaid() <
                        cars[i].getPricePaid()) {
                    mostExpensive = cars[i];
                }
            }
        }

        return mostExpensive;
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < carCounter; i++) {
            text += cars[i].toString() + "\n";
        }

        return text;
    }
}
