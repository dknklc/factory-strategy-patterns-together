package com.dekankilic.factory_strategy_patterns_together.factory;

import com.dekankilic.factory_strategy_patterns_together.dto.PaymentRequest;

public interface PaymentFactory {

    String executePayment(PaymentRequest paymentRequest);
}
