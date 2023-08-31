package com.maurinei.rechargeapp.domain.usecases;

import com.maurinei.rechargeapp.domain.entities.Customer;
import com.maurinei.rechargeapp.domain.entities.Payment;

import java.math.BigDecimal;

public interface IPaymentService {

    Payment create(Customer customer, BigDecimal paymentAmount);
    Payment findById(Long id);
}
