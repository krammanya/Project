package com.rental.service;
import com.rental.model.Customer;
import  java.util.List;

public interface CustomerService {
    Customer registerCustomer(String firstName, String lastName, String phone);
    Customer findCustomerByPhone(String phone);
    boolean rentItem(Customer customer, RentalItem item, int days);
    boolean returnItem(Customer customer, RentalItem item);
    List<Customer> getAllCustomers();
    boolean canCustomerRent(Customer customer);
    List<Customer> getContactableCustomers();
}
