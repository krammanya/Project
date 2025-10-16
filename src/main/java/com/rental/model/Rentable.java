package com.rental.model;

public interface Rentable {
    String getName();
    String getDescription();
    double getDailyPrice();
    boolean isAvailable();
    void setAvailable(boolean available);
    String getItemType();
    double calculateRentalPrice(int days);
}
