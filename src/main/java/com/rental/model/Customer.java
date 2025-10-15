package com.rental.model;

public class Customer extends User{
    private String email;
    private String driverLicense;

    public Customer(Long id, String firstName, String lastName, String phone, String email) {
        this(id, firstName, lastName, phone, email, null); // Теперь 6 аргументов
    }

    public Customer(Long id, String firstName, String lastName, String phone,
                    String email, String driverLicense) {
        super(id, firstName, lastName, phone);
        this.email = email;
        this.driverLicense = driverLicense;
    }
    public boolean hasDriverLicense() {
        return driverLicense != null && !driverLicense.isEmpty();
    }

    public void displayFullProfile() {  // ← это метод
        System.out.println("=== ПРОФИЛЬ КЛИЕНТА ===");
        System.out.println("Имя: " + getFullName());
        System.out.println("Телефон: " + getPhone());
        System.out.println("Email: " + email);
    }

    public void changePhone(String newPhone) {
        setPhone(newPhone);
        System.out.println("Телефон изменен на: " + newPhone);
    }

    @Override
    public String getRole() {
        return "ПОЛЬЗОВАТЕЛЬ";
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
}
