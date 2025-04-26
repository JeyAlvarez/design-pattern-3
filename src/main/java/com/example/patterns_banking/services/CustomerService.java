package com.example.patterns_banking.services;

import com.example.patterns_banking.dtos.CustomerDTO;
import com.example.patterns_banking.models.Customer;
import com.example.patterns_banking.services.proxy.ICustomerOperations;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  private final ICustomerOperations proxi;

  public CustomerService(ICustomerOperations proxi) {
    this.proxi = proxi;
  }

  public Customer create(CustomerDTO customerDTO) {
    return proxi.createCustomer(customerDTO);
  }
}
