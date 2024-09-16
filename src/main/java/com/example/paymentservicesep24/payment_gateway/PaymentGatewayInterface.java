package com.example.paymentservicesep24.payment_gateway;


public interface PaymentGatewayInterface {

    String createPaymentLink(long orderId, long amount) throws Exception;
}
