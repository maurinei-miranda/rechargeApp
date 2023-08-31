package com.maurinei.rechargeapp.domain.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequest {
    private String name;
    private String phone;
    private String email;
}
