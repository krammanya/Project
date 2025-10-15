package com.rental.model;

public class Admin extends User {
    private String position;

    public Admin(Long id, String firstName, String lastName, String phone, String position) {
        super(id, firstName, lastName, phone);
        this.position = position;
    }

    @Override
    public String getRole() {
        return "АДМИН";
    }

    public void viewSystemLogs() {
        System.out.println("Просмотр системных логов...");
    }
    public void manageInventory() {
        System.out.println("Управление инвентарем...");
    }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
}
