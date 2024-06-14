package com.payment.demo.PaymentAppBackend.controller;

import com.payment.demo.PaymentAppBackend.dto.PaymentInfoDTO;
import com.payment.demo.PaymentAppBackend.service.PaymentService;
import com.stripe.exception.StripeException;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class PaymentController {

    private final PaymentService paymentService;
    @PostMapping("/paymentIntent")
    public ResponseEntity<String> createPaymentIntent(@RequestBody PaymentInfoDTO paymentInfoDTO) {
        try {
            paymentService.createPaymentintent(paymentInfoDTO);
        } catch (StripeException e) {
            throw new RuntimeException(e);
        }
        return ok("payment success yay!!");
    }

}
