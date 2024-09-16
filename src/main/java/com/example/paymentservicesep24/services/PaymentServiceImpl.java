package com.example.paymentservicesep24.services;

import com.example.paymentservicesep24.payment_gateway.PaymentGatewayInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentGatewayInterface pgi;

    @Override
    public String createPaymentLink(long orderId) throws Exception {
        // Call GET /orders/{orderId} and fetch order info
        long amount = 1000;
        return pgi.createPaymentLink(orderId, amount);
    }
}
