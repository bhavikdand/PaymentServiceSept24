package com.example.paymentservicesep24.services;

import com.example.paymentservicesep24.dtos.Product;
import com.example.paymentservicesep24.payment_gateway.PaymentGatewayInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentGatewayInterface pgi;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String createPaymentLink(long orderId) throws Exception {
        // Call GET /orders/{orderId} and fetch order info
        ResponseEntity<Product> productResponseEntity = restTemplate.getForEntity("http://PRODUCTSERVICEAUG24/products/" + orderId, Product.class);
        Product body = productResponseEntity.getBody();
        System.out.println("id:" +  body.getId());
        long amount = 1000;
        return pgi.createPaymentLink(orderId, amount);
    }
}
