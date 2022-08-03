package com.nilesh.easyinventory;

import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Map;

public class ReservationHandler {

    Map<String, ProcessReservationTypeHandler> reservationTypeHandlers =
            Map.of(ReservationHandlerConfig.PO, new PurchaseOrderHandler(), ReservationHandlerConfig.SOH, new StockOnHandHandler());

    @Transactional
    public void reserve(ReservationRequest request, String reservartionType) {
            var config = ReservationHandlerConfig
                    .getFulfilByDcReservationConfig();

            BigDecimal totalQuantityReserved = BigDecimal.ZERO;
            for(String rt : config) {
                BigDecimal quantityReserved = reservationTypeHandlers.get(rt).reserve(request);
                totalQuantityReserved.add(quantityReserved);
                if(quantityReserved.compareTo(request.getQuantity()) == 0) {
                    break;
                }
            }

            if(totalQuantityReserved.compareTo(request.getQuantity()) != 0) {
                throw new RuntimeException("Quantity cannot be reserved");
            }
    }
}
