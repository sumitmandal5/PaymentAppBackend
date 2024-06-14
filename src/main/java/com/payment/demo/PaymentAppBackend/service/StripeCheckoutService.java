package com.payment.demo.PaymentAppBackend.service;

import com.payment.demo.PaymentAppBackend.dto.PaymentInfoDTO;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface StripeCheckoutService {
    PaymentIntent createPaymentintent(PaymentInfoDTO paymentInfo) throws StripeException;
}
