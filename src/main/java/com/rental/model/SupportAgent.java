package com.rental.model;

public class SupportAgent extends User {
    @Override
    public String getRole() {
        return "СЛУЖБА ПОДДЕРЖКИ";
    }

    private String specialization;
    private String shift;
    private int performanceScore;
    public SupportAgent(Long id, String firstName, String lastName, String phone,
                        String specialization, String shift) {
        super(id, firstName, lastName, phone);
        this.specialization = specialization;
        this.shift = shift;
        this.performanceScore = 100;
    }

    public void handleCustomerRequest() {
        System.out.println("Обработка запроса клиента...");
    }

    public void escalateToAdmin() {
        System.out.println("Эскалация проблемы администратору...");
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }
    //не уверна пока что они необходимы
    public void increaseScore(int points) {
        if (points > 0) {
            this.performanceScore += points;
            System.out.println("Баллы увеличены на " + points + ". Текущий счет: " + performanceScore);
        }
    }
    public void resetScore() {
        this.performanceScore = 100; // Сброс к начальному значению
        System.out.println("Баллы сброшены к 100");
    }

    public void decreaseScore(int points) {
        if (points > 0) {
            this.performanceScore = Math.max(0, performanceScore - points); // Не ниже 0
            System.out.println("Баллы уменьшены на " + points + ". Текущий счет: " + performanceScore);
        }
    }
    //

    public String getSpecialization() { return specialization; }
    public String getShift() { return shift; }
    public int getPerformanceScore() { return performanceScore; }
}
