package com.stschool.ecommerce.repository;

import com.stschool.ecommerce.model.Customer;

public class CustomerRepository {
    public Customer addedNewCustomer(Customer customer) {
        System.out.println("Customer Repository : " + customer);
        System.out.println("New Customer Added");
        return customer;
    }
}
