package com.maurinei.rechargeapp.infrastructure;

import com.maurinei.rechargeapp.domain.entities.Payment;
import com.maurinei.rechargeapp.domain.repositories.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentRepositoryH2 implements IPaymentRepository {

    @Autowired
    private PaymentRepositoryJpa paymentRepositoryJpa;
    @Override
    public Payment save(Payment payment) {
        return paymentRepositoryJpa.save(payment);
    }

    @Override
    public void deleteById(Long id) {
        paymentRepositoryJpa.deleteById(id);
    }

    @Override
    public Payment findById(Long id) {
        //TODO throw exception
       return paymentRepositoryJpa.findById(id).orElseThrow();
    }
}
