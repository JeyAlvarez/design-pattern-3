package com.example.patterns_banking.services.proxy;

import com.example.patterns_banking.dtos.CustomerDTO;
import com.example.patterns_banking.models.Customer;
import com.example.patterns_banking.repositories.ICostumerRepository;

public class CustomerOperationsProxy implements ICustomerOperations {
    private final ICustomerOperations customerOperations;
    private ICostumerRepository customerRepository;

    public CustomerOperationsProxy(ICustomerOperations customerOperations, ICostumerRepository customerRepository) {
        this.customerOperations = customerOperations;
        this.customerRepository = customerRepository;
        
    }

    @Override
    public Customer createCustomer(CustomerDTO customerDTO) {
        Customer customer = Customer
            .builder()
            .name(customerDTO.getName())
            .email(customerDTO.getEmail())
            .build();

    // Implementar proxy para verificar que el correo no sea del dominio yahoo
        return customerRepository.save(customer);
    }

}
