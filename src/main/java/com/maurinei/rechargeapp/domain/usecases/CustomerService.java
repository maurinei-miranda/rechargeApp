package com.maurinei.rechargeapp.domain.usecases;

import com.maurinei.rechargeapp.domain.dtos.CustomerRequest;
import com.maurinei.rechargeapp.domain.entities.Customer;
import com.maurinei.rechargeapp.domain.repositories.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Customer create(CustomerRequest customerRequest) {
        //TODO criar um mapper
        Customer customer = new Customer();
        customer.setName(customerRequest.getName());
        customer.setPhone(customerRequest.getPhone());
        customer.setEmail(customerRequest.getEmail());
        return customerRepository.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer updateById(Long id, CustomerRequest customerRequest) {
        Customer customer = findById(id);
        if (customerRequest.getName() != null) {
            customer.setName(customerRequest.getName());
        }
        if (customerRequest.getEmail() != null) {
            customer.setEmail(customerRequest.getEmail());
        }
        if (customerRequest.getPhone() != null) {
            customer.setPhone(customerRequest.getPhone());
        }
        return customerRepository.save(customer);
    }
}
