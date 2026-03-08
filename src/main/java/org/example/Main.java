package org.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        CustomerDAO customerDAO = new CustomerDAO();

        Order order = new Order();
        order.setOrderNumber("ORD101");
        order.setProductName("Laptop");
        order.setQuantity(1);
        order.setPrice(75000);
        order.setOrderDate(LocalDate.now());


        Customer customer = new Customer();
        customer.setCustomerName("Rahul");
        customer.setEmail("rahul@gmail.com");
        customer.setGender("Male");
        customer.setPhone(9876543210L);
        customer.setRegistrationDate(LocalDate.now());


        customer.setOrder(order);
        order.setCustomer(customer);


        customerDAO.insertCustomer(customer);


        Customer c = customerDAO.findCustomerByEmail("rahul@gmail.com");

        System.out.println(c.getCustomerName());
    }
}