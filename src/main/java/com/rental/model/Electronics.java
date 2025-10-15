package com.rental.model;

public class Electronics extends RentalItem{
    private String brand;
    private String model;

    public Electronics(String name, String description, double dailyPrice,
                       String brand, String model) {
        super(name, description, dailyPrice);
        this.brand = brand;
        this.model = model;
    }
    public Electronics() {
        super("", "", 0.0); // Вызываем конструктор RentalItem с пустыми значениями
        this.brand = "";
        this.model = "";
    }
    @Override
    public String getItemType() {
        return "Электроника";
    }

    public void demonstrateFeatures() {
        System.out.println("Демонстрация функций " + brand + " " + model + "...");
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Бренд: " + brand);
        System.out.println("Модель: " + model);
    }
}
