package day3;

public class Car {
    private String make;
    private String model;
    private int year;
    private double MPG;
    private double milesDriven;
    private double fuelCapacity;
    private double fuelRemaining;

    //pass the value of that certain field to other place
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;       //the current object
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMPG() {
        return MPG;
    }

    public void setMPG(double MPG) {
        this.MPG = MPG;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(double milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelRemaining() {
        return fuelRemaining;
    }

    public void setFuelRemaining(double fuelRemaining) {
        this.fuelRemaining = fuelRemaining;
    }

    public void display(String description){
        for (int i = 0; i < 5; i++) {//execute 5 times
            System.out.println(make + " is a "+description+" car");
        }
    }

    public String createSmoke(int gasType){
        if(gasType == 92){
            return "black";
        }else if(gasType == 95){
            return "whilte";
        }else{
            return "colorful";
        }
    }

    /*
    //method: a code block with some certain logic
    //define
    public returnType methodName(parameters){
        operations
    }

    //call a method


     */
}
