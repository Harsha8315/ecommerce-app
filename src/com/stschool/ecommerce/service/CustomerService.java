package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerService {
    public Customer handleSignupData(Customer customer){
        System.out.println("Customer Service : " + customer);
        CustomerRepository customerRepository = new CustomerRepository();
        return customerRepository.addedNewCustomer(customer);
    }
    public void displayCustomerDetails(Customer customer){
        System.out.println("ID : " + customer.getId());
        System.out.println("First Name : " + customer.getFirstName());
        System.out.println("Last Name : " + customer.getLastName());
        System.out.println("Mobile NO : " + customer.getMobileNo());
        System.out.println("Email ID : " + customer.getEmailId());
    }
}
