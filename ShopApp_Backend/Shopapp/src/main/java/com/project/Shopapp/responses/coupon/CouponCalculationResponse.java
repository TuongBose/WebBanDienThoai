package com.project.Shopapp.responses.coupon;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponCalculationResponse {
    @JsonProperty("result")
    private Double result;

    // errorCode ?
    @JsonProperty("errorMessage")
    private String errorMessage;
}
