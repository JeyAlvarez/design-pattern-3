package com.example.patterns_banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.patterns_banking.models.Customer;

public interface ICostumerRepository extends JpaRepository<Customer, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario

}
