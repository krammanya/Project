package com.rental.model;

public interface Rentable {
    String getName();
    double getDailyPrice();
    void demonstrateFeatures();
    boolean isAvailable();
    double calculateRentalPrice(int days);
}
