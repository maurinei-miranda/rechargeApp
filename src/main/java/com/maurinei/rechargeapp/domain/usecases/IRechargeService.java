package com.maurinei.rechargeapp.domain.usecases;

import com.maurinei.rechargeapp.domain.entities.Payment;
import com.maurinei.rechargeapp.domain.entities.Recharge;

public interface IRechargeService {
    Recharge create(Long customerId, Payment payment);
}
