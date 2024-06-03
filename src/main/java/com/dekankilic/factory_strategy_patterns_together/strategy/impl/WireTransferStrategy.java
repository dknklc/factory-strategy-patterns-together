package com.dekankilic.factory_strategy_patterns_together.strategy.impl;

import com.dekankilic.factory_strategy_patterns_together.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("wireTransfer")
public class WireTransferStrategy implements PaymentStrategy {

    @Override
    public String pay(String orderId, BigDecimal amount, String paymentType) {
        return "Payment done with wire transfer for orderId: " + orderId + " amount: " + amount + " paymentType: " + paymentType;
    }
}
