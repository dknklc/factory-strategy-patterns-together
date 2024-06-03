package com.dekankilic.factory_strategy_patterns_together.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {

    String pay(String orderId, BigDecimal amount, String paymentType);
}
