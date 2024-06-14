package com.payment.demo.PaymentAppBackend.service;

import com.payment.demo.PaymentAppBackend.dto.PaymentInfoDTO;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PaymentService implements StripeCheckoutService{
    @Override
    public PaymentIntent createPaymentintent(PaymentInfoDTO paymentInfo) throws StripeException {
        List<String> paymentMethodTypes = new ArrayList<>();
        paymentMethodTypes.add("card");
        Map<String, Object> params = new HashMap<>();
        //logic for different checks that need to be done for the payment.
        //logic to calculate amount using OrderUUID
        BigDecimal amount = new BigDecimal(30.00);
        params.put("amount", amount);
        params.put("currency", paymentInfo.getCurrency());
        params.put("payment_method_types", paymentMethodTypes);
        //PaymentIntent paymentIntent = PaymentIntent.create(params);
        PaymentIntent paymentIntent = null;
        return paymentIntent;
    }
}
