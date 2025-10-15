package com.rental;

import com.rental.model.Customer;
import com.rental.service.CustomerService;
import com.rental.service.CustomerServiceImpl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Запуск системы проката");

        CustomerService customerService = new CustomerServiceImpl();
        System.out.println("\nВыберите действие:");
        System.out.println("1 - Зарегистрировать клиента");
        System.out.println("2 - Показать всех клиентов");
        System.out.print("Ваш выбор: ");

        int choice=scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
                System.out.println("Регистрация клиента");
                System.out.print("Введите имя: ");
                String firstName = scanner.nextLine();
                System.out.print("Введите фамилию: ");
                String lastName = scanner.nextLine();
                System.out.print("Введите телефон: ");
                String phone = scanner.nextLine();
                Customer customer = customerService. registerCustomer( firstName, lastName, phone);

                System.out.println("Успешно: " + customer.getFullName());
                scanner.close();
             case 2:

        }
    }
}
