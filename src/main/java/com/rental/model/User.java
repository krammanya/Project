package com.rental.model;


public abstract class User {

    protected Long id;
    protected String firstName;
    protected String lastName;
    protected String phone;

    public User(Long id, String firstName, String lastName, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public abstract String getRole();

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getFullName() { return firstName + " " + lastName; }

    public void setPhone(String phone) { this.phone = phone; }
}
