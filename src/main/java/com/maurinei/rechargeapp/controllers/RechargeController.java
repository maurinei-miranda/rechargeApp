package com.maurinei.rechargeapp.controllers;

import com.maurinei.rechargeapp.domain.dtos.RechargeRequest;
import com.maurinei.rechargeapp.domain.entities.Customer;
import com.maurinei.rechargeapp.domain.entities.Payment;
import com.maurinei.rechargeapp.domain.entities.Recharge;
import com.maurinei.rechargeapp.domain.usecases.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recharge")
public class RechargeController {

    @Autowired
    IRechargeService rechargeService;

    @Autowired
    IPaymentService paymentService;

    @Autowired
    ICustomerService customerService;

    @PostMapping
    public ResponseEntity<Recharge> createRecharge(@RequestBody RechargeRequest rechargeRequest) {
        Customer customer = customerService.findById(rechargeRequest.getCustomerId());
        Payment payment = paymentService.create(customer, rechargeRequest.getRechargeAmount());
        Recharge recharge = new Recharge();
        if (payment != null) {
            recharge = rechargeService.create(customer.getId(), payment);
        }
        return new ResponseEntity<>(recharge, HttpStatus.CREATED);
    }

}
