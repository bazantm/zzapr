package zzapr.w05;

public class Car {
    private String manufacturer;
    private String type;
    private int pricePaid;
    private int odometer;

    public Car(String manufacturer,
               String type, int pricePaid,
               int odometer) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.pricePaid = pricePaid;
        this.odometer = odometer;
    }

    public int getPricePaid() {
        return pricePaid;
    }

    @Override
    public String toString() {
        String text = "";

        text += this.manufacturer + " " +
                this.type + ": " + this.pricePaid +
                " EUR, " + "mileage: " +
                this.odometer + " km";

        return text;
    }
}
