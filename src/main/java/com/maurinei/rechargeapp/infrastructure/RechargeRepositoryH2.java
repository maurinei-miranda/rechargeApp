package com.maurinei.rechargeapp.infrastructure;

import com.maurinei.rechargeapp.domain.entities.Recharge;
import com.maurinei.rechargeapp.domain.repositories.IRechargeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RechargeRepositoryH2 implements IRechargeRepository {

    @Autowired
    private RechargeRepositoryJpa rechargeRepositoryJpa;

    @Override
    public Recharge create(Recharge recharge) {
        return rechargeRepositoryJpa.save(recharge);
    }

    @Override
    public void deleteById(Long id) {
        rechargeRepositoryJpa.deleteById(id);
    }

    @Override
    public Recharge findById(Long id) {
        return rechargeRepositoryJpa.findById(id).orElseThrow();
    }
}
