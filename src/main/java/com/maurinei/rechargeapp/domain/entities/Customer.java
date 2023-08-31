package com.maurinei.rechargeapp.domain.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "customer")
    @JsonManagedReference
    private List<Payment> payments;
    @JsonManagedReference
    @OneToMany(mappedBy = "customer")
    private List<Recharge> recharges;
}
