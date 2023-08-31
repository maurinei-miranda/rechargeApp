package com.maurinei.rechargeapp.domain.repositories;

import com.maurinei.rechargeapp.domain.entities.Payment;

public interface IPaymentRepository {
    Payment save(Payment payment);
    void deleteById(Long id);
    Payment findById(Long id);
}
