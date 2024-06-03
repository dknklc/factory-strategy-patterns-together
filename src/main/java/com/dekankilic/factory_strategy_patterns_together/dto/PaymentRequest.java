package com.dekankilic.factory_strategy_patterns_together.dto;

import java.math.BigDecimal;

public record PaymentRequest(
        String orderId,
        BigDecimal amount,
        String paymentType
) {
}
