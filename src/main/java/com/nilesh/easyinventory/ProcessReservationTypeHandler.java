package com.nilesh.easyinventory;

import java.math.BigDecimal;

public interface ProcessReservationTypeHandler {
     BigDecimal reserve(ReservationRequest request);
     BigDecimal unreserve();
}
