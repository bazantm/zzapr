package zzapr.w05;

public class GarageMain {


    public static void main(String[] args) {
        Car car01 = new Car("Fiat", "500",
                10000, 10500);

        Car car02 = new Car("Skoda", "Fabia",
                8000, 30895);

        Garage garage01 = new Garage();
        garage01.addCarToGarage(car01);
        garage01.addCarToGarage(car02);

        System.out.println(garage01);

        System.out.println("The most expensive car in garage is: " +
                garage01.getMostExpensiveCar());


        //TODO write a method that finds the most expensive
        // car in the garage and returns such a car

        //TODO Task for this week:
        // Sort cars in garage so that they are listed
        // in descending order according to their mileage
        // For this task create a new method
    }
}
