package com.nilesh.easyinventory;

import java.util.List;

public class ReservationHandlerConfig {

    public static final String PO = "PO";
    public static final String SOH = "SOH";

    public static List<String> getFulfilByDcReservationConfig() {
        return List.of(PO, SOH);
    }

    public static List<String> getBuyinViaDCReservationConfig() {
        throw new IllegalArgumentException("Buyin Via Dc has its own PO");
    }

    public static List<String> getFulfilByDcUnReserveConfig() {
        return List.of(SOH, PO);
    }

    public static List<String> getBuyinViaDCUnreserveConfig() {
        return List.of(PO, SOH);
    }

}
