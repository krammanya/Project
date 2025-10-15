package com.rental.service;

import com.rental.model.Customer;
import java.util.List;
import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {
private final  List<Customer>customers=new ArrayList<>();

    @Override
    public Customer registerCustomer(String firstName, String lastName, String phone) {
        Customer customer=new Customer(firstName, lastName, phone);
        customers.add(customer);
        System.out.println("Клиент зарегистрирован: "+customer.getFullName());
        return customer;
    }

    @Override
    public Customer findCustomerByPhone(String phone) {
        for(Customer customer : customers){
            if(phone !=null && phone.equals(customer.getPhone())){
                System.out.println("Контактная информация: " + customer.getContactInfo() );
                return  customer;
            }
        }
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customers);
    }

    @Override
    public boolean canCustomerRent(Customer customer) {
        return customer.canBeContacted();
    }

    @Override
    public List<Customer> getContactableCustomers() {
        List<Customer> contactable=new ArrayList<>();
        for(Customer customer : customers){
            if(customer.canBeContacted()){
                contactable.add(customer);
            }
        }
        return contactable;
    }
}
