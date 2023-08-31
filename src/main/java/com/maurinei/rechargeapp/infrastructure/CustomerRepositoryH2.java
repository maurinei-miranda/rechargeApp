package com.maurinei.rechargeapp.infrastructure;

import com.maurinei.rechargeapp.domain.entities.Customer;
import com.maurinei.rechargeapp.domain.repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CustomerRepositoryH2 implements ICustomerRepository {

    @Autowired
    private CustomerRepositoryJpa customerCustomerRepositoryJpa;

    @Override
    public Customer save(Customer customer) {
        return customerCustomerRepositoryJpa.save(customer);
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerCustomerRepositoryJpa.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        customerCustomerRepositoryJpa.deleteById(id);
    }

}
