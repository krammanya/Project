package com.rental.model;

public class Tool extends RentalItem {
    private String category;
    private String powerType;

    public Tool(String name, String description, double dailyPrice,
                String category, String powerType) {
        super(name, description, dailyPrice);
        this.category = category;
        this.powerType = powerType;
    }

    @Override
    public String getItemType() {
        return "Инструмент";
    }

    public String getCategory() { return category; }
    public String getPowerType() { return powerType; }

    public void setCategory(String category) { this.category = category; }
    public void setPowerType(String powerType) { this.powerType = powerType; }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Категория: " + category);
        System.out.println("Тип питания: " + powerType);
    }
}
