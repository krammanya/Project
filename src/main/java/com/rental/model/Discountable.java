package com.rental.model;

public interface Discountable {
    double calculateDiscount(int rentalDays);
    double getSeasonalDiscount();
    boolean isWeekendDiscountAvailable();
}
