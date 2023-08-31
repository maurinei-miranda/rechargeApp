package com.maurinei.rechargeapp.domain.dtos;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class RechargeRequest {
    private Long customerId;
    private BigDecimal rechargeAmount;
}
