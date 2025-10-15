package com.rental.model;

public class CoffeeMachine extends Electronics{
    private String coffeeType;
    private int waterTankCapacity;
    public CoffeeMachine(String name, String description, double dailyPrice,
                         String brand, String model, String coffeeType,
                         int waterTankCapacity) {
        super(name, description, dailyPrice, brand, model);
        this.coffeeType = coffeeType;
        this.waterTankCapacity = waterTankCapacity;
    }

    @Override
    public String getItemType() {
        return "Кофемашина";
    }

    public void makeCoffee() {
        System.out.println("Приготовление " + coffeeType + " на " + getBrand() + " " + getModel());
    }

    public void cleanMachine() {
        System.out.println("Очистка кофемашины " + getBrand());
    }

    public String getCapacityInfo() {
        return "Емкость бака: " + waterTankCapacity + " мл";
    }

    public String getCoffeeType() { return coffeeType; }
    public int getWaterTankCapacity() { return waterTankCapacity; }

    public void setCoffeeType(String coffeeType) { this.coffeeType = coffeeType; }
    public void setWaterTankCapacity(int waterTankCapacity) { this.waterTankCapacity = waterTankCapacity; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Тип кофе: " + coffeeType);
        System.out.println(getCapacityInfo());
    }

    @Override
    public void demonstrateFeatures() {
        super.demonstrateFeatures();
        makeCoffee();
        cleanMachine();
    }
}
