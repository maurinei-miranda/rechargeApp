package com.maurinei.rechargeapp.infrastructure;

import com.maurinei.rechargeapp.domain.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositoryJpa extends JpaRepository<Customer, Long> {
}
