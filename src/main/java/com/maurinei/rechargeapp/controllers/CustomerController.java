package com.maurinei.rechargeapp.controllers;

import com.maurinei.rechargeapp.domain.dtos.CustomerRequest;
import com.maurinei.rechargeapp.domain.entities.Customer;
import com.maurinei.rechargeapp.domain.usecases.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @PostMapping("/")
    public ResponseEntity<Customer> create(@RequestBody CustomerRequest customerRequest) {
        Customer newCustomer = customerService.create(customerRequest);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable Long id) {
        Customer customerById = customerService.findById(id);
        return new ResponseEntity<>(customerById, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteById(@RequestParam Long id) {
        customerService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Customer> updateById(@PathVariable Long id, @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerService.updateById(id, customerRequest);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

}
