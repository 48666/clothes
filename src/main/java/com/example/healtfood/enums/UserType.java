package com.example.healtfood.enums;

public enum UserType {
    NORMAL(0),SILVER(0.1),GOLD(0.15),PREMIUM(0.2);
    private double discount;

    UserType(double discount) {
        this.discount = discount;
    }
}
