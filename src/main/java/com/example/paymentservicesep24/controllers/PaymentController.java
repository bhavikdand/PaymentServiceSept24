package com.example.paymentservicesep24.controllers;

import com.example.paymentservicesep24.dtos.CreatePaymentLinkRequestDto;
import com.example.paymentservicesep24.dtos.CreatePaymentLinkResponseDto;
import com.example.paymentservicesep24.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/paymentLink")
    public ResponseEntity<CreatePaymentLinkResponseDto> createPaymentLink(@RequestBody CreatePaymentLinkRequestDto requestDto){
        try {
            String url = paymentService.createPaymentLink(requestDto.getOrderId());
            CreatePaymentLinkResponseDto responseDto = new CreatePaymentLinkResponseDto();
            responseDto.setUrl(url);
            return ResponseEntity.ok(responseDto);
        } catch (Exception e){
            System.out.printf(e.getMessage());
            return null;
        }

    }
}
