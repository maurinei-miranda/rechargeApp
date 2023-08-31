package com.maurinei.rechargeapp.domain.usecases;

import com.maurinei.rechargeapp.domain.entities.Customer;
import com.maurinei.rechargeapp.domain.entities.Payment;
import com.maurinei.rechargeapp.domain.entities.Recharge;
import com.maurinei.rechargeapp.domain.repositories.IRechargeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RechargeService implements IRechargeService{
    @Autowired
    private IRechargeRepository rechargeRepository;

    @Autowired
    private ICustomerService customerService;

    public Recharge create(Long customerId, Payment payment) {
        Recharge recharge = new Recharge();

        Customer byId = customerService.findById(customerId);

        recharge.setCustomer(byId);
        recharge.setPayment(payment);
        recharge.setRechargeValue(payment.getPaymentAmount());
        return rechargeRepository.create(recharge);
    }

}
