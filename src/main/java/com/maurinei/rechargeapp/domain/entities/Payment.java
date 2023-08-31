package com.maurinei.rechargeapp.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    private BigDecimal paymentAmount;

}
