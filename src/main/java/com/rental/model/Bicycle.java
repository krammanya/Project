package com.rental.model;

public class Bicycle extends RentalItem{
    @Override
    public String getItemType() {
        return "Велосипед";
    }

    private String type;
    private int gears;
    private String size;

    public Bicycle(String name, String description, double dailyPrice,
                   String type, int gears, String size) {
        super(name, description, dailyPrice);
        this.type = type;
        this.gears = gears;
        this.size = size;
    }
    public String getType() { return type; }
    public int getGears() { return gears; }
    public String getSize() { return size; }
}
