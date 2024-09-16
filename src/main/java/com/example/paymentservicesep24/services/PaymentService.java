package com.example.paymentservicesep24.services;

public interface PaymentService {

    String createPaymentLink(long orderId) throws Exception;
}
