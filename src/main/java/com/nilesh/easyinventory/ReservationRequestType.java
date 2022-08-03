package com.nilesh.easyinventory;

public enum ReservationRequestType {



    FULFIL_BY_DC ("fulfil-by-dc"),
    BUYIN_VIA_DC("buyin-via-dc");

    private final String reservationType;

    ReservationRequestType(String type) {
        this.reservationType = type;
    }

    public String reservationType() {
        return reservationType;
    }
}
