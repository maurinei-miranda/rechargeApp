package com.maurinei.rechargeapp.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Recharge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal rechargeValue;
    @ManyToOne
    @JsonBackReference
    private Customer customer;
    @OneToOne
    private Payment payment;

}
