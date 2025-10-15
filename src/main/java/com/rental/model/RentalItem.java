package com.rental.model;

public abstract class RentalItem {
    protected String name;
    protected String description;
    protected double dailyPrice;
    protected boolean isAvailable;

    public RentalItem(String name, String description, double dailyPrice) {
        this.name = name;
        this.description = description;
        this.dailyPrice = dailyPrice;
        this.isAvailable = true; // По умолчанию доступен
    }

    public abstract String getItemType();

    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getDailyPrice() { return dailyPrice; }
    public boolean isAvailable() { return isAvailable; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setDailyPrice(double dailyPrice) { this.dailyPrice = dailyPrice; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public double calculateRentalPrice(int days) {
        return dailyPrice * days;
    }

    public void displayInfo() {
        System.out.println("=== ИНФОРМАЦИЯ О ПРЕДМЕТЕ ===");
        System.out.println("Тип: " + getItemType());
        System.out.println("Название: " + name);
        System.out.println("Описание: " + description);
        System.out.println("Цена за день: " + dailyPrice);
        System.out.println("Статус: " + (isAvailable ? "Доступен" : "Занят"));
    }
}
