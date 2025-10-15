package com.rental.model;

import com.rental.model.Electronics;
import com.rental.model.Rentable;

public class Camera extends Electronics {
    private Electronics electronics; // КОМПОЗИЦИЯ
    private int megapixels;

    public Camera(String name, String description, double dailyPrice,
                  String brand, String model, int megapixels) {
        this.electronics = new Electronics(name, description, dailyPrice, brand, model);
        this.megapixels = megapixels;
    }

    // Делегируем методы Electronics
    public String getBrand() {
        return electronics.getBrand();
    }

    public void demonstrateFeatures() {
        electronics.demonstrateFeatures();
        System.out.println("Демонстрация камеры " + megapixels + "MP");
    }
    }