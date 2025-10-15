package com.rental.model;

public class Car extends RentalItem {
    @Override
    public String getItemType() {
        return "Машина";
    }

    private String brand;
    private String model;
    private int year;

    public Car( String name, String description, double dailyPrice,
               String brand, String model, int year) {
        super( name, description, dailyPrice);
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
}
