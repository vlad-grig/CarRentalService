package com.sda.carrentalservice.entity;

public enum Status {
    NOT_AVAILABLE("NOT AVAILABLE"),
    BROKEN("BROKEN"),
    IN_REPAIR("IN REPAIR"),
    IN_SERVICE("IN SERVICE"),
    AVAILABLE("AVAILABLE");

    private final String displayName;

    Status(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
