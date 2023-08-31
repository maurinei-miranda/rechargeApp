package com.maurinei.rechargeapp.domain.usecases;

import com.maurinei.rechargeapp.domain.entities.Customer;
import com.maurinei.rechargeapp.domain.entities.Payment;
import com.maurinei.rechargeapp.domain.repositories.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService implements IPaymentService {

    @Autowired
    private IPaymentRepository paymentRepository;

    public Payment create(Customer customer, BigDecimal paymentAmount) {
        Payment payment = new Payment();

        payment.setCustomer(customer);
        payment.setPaymentAmount(paymentAmount);

        return paymentRepository.save(payment);
    }

    public Payment findById(Long id) {
        return paymentRepository.findById(id);
    }


}
