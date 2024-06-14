package com.payment.demo.PaymentAppBackend.configuration.payment;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {
    private static final String PAYMENT_SECRET_KEY = System.getenv("PAYMENT_SECRET_KEY");
    @PostConstruct
    public void initStripe(){
        Stripe.apiKey = PAYMENT_SECRET_KEY;
    }
}
