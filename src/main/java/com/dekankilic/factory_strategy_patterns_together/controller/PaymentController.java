package com.dekankilic.factory_strategy_patterns_together.controller;

import com.dekankilic.factory_strategy_patterns_together.dto.PaymentRequest;
import com.dekankilic.factory_strategy_patterns_together.factory.PaymentFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    private final PaymentFactory paymentFactory;

    public PaymentController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping
    public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(paymentFactory.executePayment(paymentRequest));
    }

}
