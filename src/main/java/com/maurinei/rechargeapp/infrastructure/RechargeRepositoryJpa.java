package com.maurinei.rechargeapp.infrastructure;

import com.maurinei.rechargeapp.domain.entities.Recharge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RechargeRepositoryJpa extends JpaRepository<Recharge, Long> {
}
