package com.maurinei.rechargeapp.domain.usecases;

import com.maurinei.rechargeapp.domain.dtos.CustomerRequest;
import com.maurinei.rechargeapp.domain.entities.Customer;

public interface ICustomerService {
    Customer create(CustomerRequest customerRequest);

    Customer findById(Long id);

    void deleteById(Long id);

    Customer updateById(Long id, CustomerRequest customerRequest);
}
