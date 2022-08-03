package com.nilesh.easyinventory;

import java.math.BigDecimal;

public class ReservationRequest {

    private String productNumber;
    private BigDecimal quantity;
    private Integer ratio;

    public BigDecimal getQuantity() {
        return quantity;
    }
}
