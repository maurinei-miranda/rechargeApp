package com.maurinei.rechargeapp.domain.repositories;

import com.maurinei.rechargeapp.domain.entities.Recharge;

public interface IRechargeRepository {

    Recharge create(Recharge recharge);
    void deleteById(Long id);
    Recharge findById(Long id);
}
