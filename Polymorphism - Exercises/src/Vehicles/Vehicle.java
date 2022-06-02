package Vehicles;

import java.text.DecimalFormat;

public class Vehicle {

    private  double fuel;
    private double consumption;

    protected Vehicle(double fuel, double consumption) {
        this.fuel = fuel;
        this.consumption = consumption;
    }


    public String drive(double distance) {
        double fuelNeeded = distance * this.consumption;
        if(fuelNeeded > this.fuel){
            return this.getClass().getSimpleName() + " needs refueling";
        }
        this.fuel -= fuelNeeded;

        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s km",this.getClass().getSimpleName(),decimalFormat.format(distance));
    }


    public void refuel(double liters) {
        this.fuel += liters;
    }


    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(),this.fuel);
    }

}
