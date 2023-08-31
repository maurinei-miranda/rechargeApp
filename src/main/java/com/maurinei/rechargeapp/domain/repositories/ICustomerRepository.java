package com.maurinei.rechargeapp.domain.repositories;

import com.maurinei.rechargeapp.domain.entities.Customer;

import java.util.Optional;

public interface ICustomerRepository {
    Customer save(Customer customer);
    Optional<Customer> findById(Long id);
    void deleteById(Long id);
}
