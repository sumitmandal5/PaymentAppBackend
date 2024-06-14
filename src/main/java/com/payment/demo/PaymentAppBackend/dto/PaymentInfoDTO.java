package com.payment.demo.PaymentAppBackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentInfoDTO {
    private String currency;
    private String orderUUID;
}
